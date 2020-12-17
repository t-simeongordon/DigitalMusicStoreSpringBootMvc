package com.tsg.DigitalMusicStoreSpringBootMvc.controller;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.SearchResults;
import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicContentService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DmsController {

    @Autowired
    MusicContentService musicContentService;

    @GetMapping("/genre")
    public ResponseEntity<List<Genre>> getAllMusicGenres() {
        return ResponseEntity.ok().body(musicContentService.getMoodAndGenreList());
    }

    @GetMapping("/topchart")
    public ResponseEntity<List<TopCharts>> getTopCharts() {
        return ResponseEntity.ok().body(musicContentService.getTopCharts());
    }

    @PostMapping("/store/song")
    public ResponseEntity<String> addSearchedContent(@RequestBody SearchResults body) {
        final String correlationId = musicContentService.saveSearchResults(body);
        return ResponseEntity.ok().body(correlationId);
    }

    @GetMapping("/searched/songs")
    public ResponseEntity<?> getRecentSearches() {

        return ResponseEntity.ok().body(musicContentService.getRecentSongs());
    }
}
