package com.example.davidmartins.avenging.data;

import com.example.davidmartins.avenging.BuildConfig;
import com.example.davidmartins.avenging.data.model.Character;
import com.example.davidmartins.avenging.data.model.CharacterDataWrapper;
import com.example.davidmartins.avenging.data.model.Comic;
import com.example.davidmartins.avenging.data.remote.AvengersService;
import com.example.davidmartins.avenging.data.remote.AvengersServiceFactory;

import android.support.annotation.StringDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import rx.Observable;

/**
 * Created by david.martins on 21/02/2018.
 */

public class DataManager {

    @StringDef({COMIC_TYPE_COMICS, COMIC_TYPE_SERIES, COMIC_TYPE_STORIES, COMIC_TYPE_EVENTS})
    @Retention(RetentionPolicy.SOURCE)
    private @interface Type {
    }

    private static final String COMIC_TYPE_COMICS = "comics";
    private static final String COMIC_TYPE_SERIES = "series";
    private static final String COMIC_TYPE_STORIES = "stories";
    private static final String COMIC_TYPE_EVENTS = "events";

    private static DataManager sInstance;
    private final AvengersService mAvengersService;

    private DataManager() {
        mAvengersService = AvengersServiceFactory.makeAvengersService();
    }

    public static DataManager getInstance() {
        DataManager result = sInstance;
        if (result == null) {
            synchronized (DataManager.class) {
                result = sInstance;
                if (result == null) {
                    sInstance = result = new DataManager();
                }
            }
        }
        return result;
    }

    private static String buildMD5AuthParameter(long timestamp) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest((timestamp + BuildConfig.PRIVATE_KEY + BuildConfig.PUBLIC_KEY).getBytes());
            BigInteger number = new BigInteger(1, messageDigest);

            String md5 = number.toString(16);
            while (md5.length() < 32) {
                md5 = 0 + md5;
            }
            return md5;
        } catch (NoSuchAlgorithmException e) {
            return "";
        }
    }

    public Observable<CharacterDataWrapper<List<Character>>> getCharacters(int offset, int limit, String searchQuery) {
        long timeStamp = System.currentTimeMillis();
        return mAvengersService.getCharacters(BuildConfig.PUBLIC_KEY, buildMD5AuthParameter(timeStamp), timeStamp, offset, limit, searchQuery);
    }

    public Observable<CharacterDataWrapper<List<Character>>> getCharacterById(long characterId) {
        long timeStamp = System.currentTimeMillis();
        return mAvengersService.getCharacter(characterId, BuildConfig.PUBLIC_KEY, buildMD5AuthParameter(timeStamp), timeStamp);
    }

    public Observable<CharacterDataWrapper<List<Comic>>> getComics(long characterId, int offset, int limit) {
        return getComicListByType(characterId, COMIC_TYPE_COMICS, offset, limit);
    }

    public Observable<CharacterDataWrapper<List<Comic>>> getSeries(long characterId, int offset, int limit) {
        return getComicListByType(characterId, COMIC_TYPE_SERIES, offset, limit);
    }

    public Observable<CharacterDataWrapper<List<Comic>>> getStories(long characterId, int offset, int limit) {
        return getComicListByType(characterId, COMIC_TYPE_STORIES, offset, limit);
    }

    public Observable<CharacterDataWrapper<List<Comic>>> getEvents(long characterId, int offset, int limit) {
        return getComicListByType(characterId, COMIC_TYPE_EVENTS, offset, limit);
    }

    private Observable<CharacterDataWrapper<List<Comic>>> getComicListByType(long characterId, String comicType, int offset, int limit) {
        long timeStamp = System.currentTimeMillis();
        return mAvengersService.getCharacterComics(characterId, comicType, offset, limit, buildMD5AuthParameter(timeStamp), timeStamp);
    }
}
