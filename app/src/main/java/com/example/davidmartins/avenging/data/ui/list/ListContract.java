package com.example.davidmartins.avenging.data.ui.list;

import com.example.davidmartins.avenging.data.model.Character;
import com.example.davidmartins.avenging.data.ui.base.BaseView;

import java.util.List;

/**
 * Contract for Characters List
 */

public interface ListContract {

    interface CharacterListViewActions {

        void onInitialRequest();

        void onEndListReached(int offset, int limit, String searchQuery);

        void onCharacterSearched(String searchQuery);

    }

    interface CharacterListView extends BaseView {

        void showCharacters(List<Character> charactersList);

        void showCharacterSearched(List<Character> characterList);

    }
}
