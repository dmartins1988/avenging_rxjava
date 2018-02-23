package com.example.davidmartins.avenging.data.ui.character;

import com.example.davidmartins.avenging.data.model.Character;
import com.example.davidmartins.avenging.data.model.Comic;
import com.example.davidmartins.avenging.data.ui.base.BaseView;

import java.util.List;

/**
 * Contract for Character
 */

public interface CharacterContract {

    interface CharacterViewActions {

        void onCharacterRequested(long characterId);

        void onCharacterComicsRequested(long characterId);

        void onCharacterSeriesRequested(long characterId);

        void onCharacterStoriesRequested(long characterId);

        void onCharacterEventsRequested(long characterId);
    }

    interface CharacterView extends BaseView {

        void showCharacter(Character character);

        void showCharacterComicsList(List<Comic> comicList);

        void showCharacterSeriesList(List<Comic> seriesList);

        void showCharacterStoriesList(List<Comic> storiesList);

        void showCharacterEventsList(List<Comic> eventsList);
    }
}
