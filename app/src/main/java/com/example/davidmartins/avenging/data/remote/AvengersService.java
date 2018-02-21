package com.example.davidmartins.avenging.data.remote;

import com.example.davidmartins.avenging.data.model.Character;
import com.example.davidmartins.avenging.data.model.CharacterDataWrapper;
import com.example.davidmartins.avenging.data.model.Comic;

import java.util.List;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Avengers interface API
 */

public interface AvengersService {

    @GET("characters")
    Observable<CharacterDataWrapper<List<Character>>> getCharacters(@Query("apikey") String apiKey,
                                                                    @Query("hash") String md5Digest,
                                                                    @Query("ts") long timestamp,
                                                                    @Query("offset") int offset,
                                                                    @Query("limit") int limit,
                                                                    @Query("nameStartWith") String searchQuery);

    @GET("characters/{characterId}")
    Observable<CharacterDataWrapper<List<Character>>> getCharacter(@Query("characterId") long characterId,
                                                                   @Query("apikey") String publicKey,
                                                                   @Query("hash") String md5Digest,
                                                                   @Query("ts") long timestamp);

    @GET("characters/{characterId}/{comicType}")
    Observable<CharacterDataWrapper<List<Comic>>> getCharacterComics(@Query("characterId") long characterId,
                                                                     @Query("comicType") String comicType,
                                                                     @Query("offset") int offset,
                                                                     @Query("limit") int limit,
                                                                     @Query("hash") String md5Digest,
                                                                     @Query("ts") long timestamp);

}
