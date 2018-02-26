package com.example.davidmartins.avenging.data.ui.character;

import com.example.davidmartins.avenging.data.DataManager;
import com.example.davidmartins.avenging.data.ui.base.BasePresenter;

/**
 * Presenter for Character that extends the BasePresenter and implements the View actions
 */

public class CharacterPresenter extends BasePresenter<CharacterContract.CharacterView> implements CharacterContract.CharacterViewActions {

    private static final int ITEM_REQUEST_INITIAL_OFFSET = 0;
    private static final int ITEM_REQUEST_LIMIT = 6;
    private final DataManager mDataManager;

    public CharacterPresenter(final DataManager dataManager) {
        mDataManager = dataManager;
    }

    @Override
    public void onCharacterRequested(final long characterId) {
        
    }

    @Override
    public void onCharacterComicsRequested(final long characterId) {

    }

    @Override
    public void onCharacterSeriesRequested(final long characterId) {

    }

    @Override
    public void onCharacterStoriesRequested(final long characterId) {

    }

    @Override
    public void onCharacterEventsRequested(final long characterId) {

    }
}
