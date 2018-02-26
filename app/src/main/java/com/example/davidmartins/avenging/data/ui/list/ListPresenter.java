package com.example.davidmartins.avenging.data.ui.list;

import com.example.davidmartins.avenging.data.DataManager;
import com.example.davidmartins.avenging.data.model.Character;
import com.example.davidmartins.avenging.data.model.CharacterDataWrapper;
import com.example.davidmartins.avenging.data.ui.base.BasePresenter;
import com.example.davidmartins.avenging.data.utils.RxUtils;

import android.text.TextUtils;

import java.util.List;

import rx.Subscriber;

/**
 * Presenter for Characters list that extends Base Presenter and implements View Actions
 */

public class ListPresenter extends BasePresenter<ListContract.CharacterListView> implements ListContract.CharacterListViewActions {

    private static final int ITEM_REQUEST_INITIAL_OFFSET = 0;
    private static final int ITEM_REQUEST_LIMIT = 6;

    private final DataManager mDataManager;

    public ListPresenter(final DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onInitialRequest() {
        getCharacters(ITEM_REQUEST_INITIAL_OFFSET, ITEM_REQUEST_LIMIT, null);
    }

    @Override
    public void onEndListReached(final int offset, final int limit, final String searchQuery) {
        getCharacters(ITEM_REQUEST_INITIAL_OFFSET, limit == 0 ? ITEM_REQUEST_LIMIT : limit, searchQuery);
    }

    @Override
    public void onCharacterSearched(final String searchQuery) {
        getCharacters(ITEM_REQUEST_INITIAL_OFFSET, ITEM_REQUEST_LIMIT, searchQuery);
    }

    private void getCharacters(final int offset, final int limit, final String searchQuery) {
        if (!isViewAttached()) {
            return;
        }
        getView().showMessageLayout(false);
        getView().showProgress();

        mDataManager.getCharacters(offset, limit, searchQuery)
                .compose(RxUtils.applyObservableAsync())
                .subscribe(new Subscriber<CharacterDataWrapper<List<Character>>>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(final Throwable e) {
                        getView().hideProgress();
                        getView().showErrorMessage(e.getMessage());
                    }

                    @Override
                    public void onNext(final CharacterDataWrapper<List<Character>> listCharacterDataWrapper) {
                        if (!isViewAttached()) {
                            return;
                        }
                        getView().hideProgress();

                        final List<Character> listOfCharacters = listCharacterDataWrapper.getData().getResults();
                        if (listOfCharacters.isEmpty()) {
                            getView().showEmpty();
                        }

                        if (TextUtils.isEmpty(searchQuery)) {
                            getView().showCharacters(listOfCharacters);
                        } else {
                            getView().showCharacterSearched(listOfCharacters);
                        }

                    }
                });
    }
}
