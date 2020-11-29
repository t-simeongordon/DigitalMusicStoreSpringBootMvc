package com.tsg.DigitalMusicStoreSpringBootMvc.controller;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.TopCharts;
import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v0/music")
public class dmsController {
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
}
