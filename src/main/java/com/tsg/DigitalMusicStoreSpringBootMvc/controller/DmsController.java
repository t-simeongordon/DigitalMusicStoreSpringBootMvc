package com.tsg.DigitalMusicStoreSpringBootMvc.controller;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.SearchResults;
import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicContentService;
import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicStreamingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * RestController
 */
@RestController
public class DmsController {

    @Autowired
    MusicContentService musicContentService;

    @Autowired
    MusicStreamingService musicStreamingService;

    //DMS
    @GetMapping("/genre")
    public ResponseEntity<List<Genre>> getAllMusicGenres() {
        return ResponseEntity.ok().body(musicContentService.getMoodAndGenreList());
    }

    @GetMapping("/topchart")
    public ResponseEntity<List<TopCharts>> getTopCharts() {
        return ResponseEntity.ok().body(musicContentService.getTopCharts());
    }

    /**
     * API Endpoint to find previously queried songs
     *
     * @return a song
     */
    @PostMapping("/store/song")
    public ResponseEntity<String> addSearchedContent(@RequestBody SearchResults body) {
        final String correlationId = musicContentService.saveSearchResults(body);
        return ResponseEntity.ok().body(correlationId);
    }

    /**
     * API Endpoint to find previously queried songs from DB.
     *
     * @return list of songs.
     */
    @GetMapping("/recent/songs")
    public ResponseEntity<?> getRecentSearches() {

        return ResponseEntity.ok().body(musicContentService.getRecentSongs());
    }

    /**
     * API Endpoint to get queried song from Spotify, Youtube Music or other source.
     *
     * @return search results
     */
    @GetMapping("/search/song")
    public ResponseEntity<?> getQueriedSong(@RequestHeader String auth,
        @RequestParam String querySong, @RequestParam List<String> musicStreamServices) {
        //to take a list of queries add commas to the param when making a request to this endpoint
        System.out.println("@@: " + querySong + " : " + musicStreamServices);
        String song = musicStreamingService.getQueriedTrack(auth, querySong, musicStreamServices);
        return ResponseEntity.ok().body(song);
    }


}
