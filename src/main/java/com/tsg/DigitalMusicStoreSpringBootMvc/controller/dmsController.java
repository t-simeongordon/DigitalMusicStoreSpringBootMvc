package com.tsg.DigitalMusicStoreSpringBootMvc.controller;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.services.MoodAndGenreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v0/music")
public class dmsController {
    @Autowired
    MoodAndGenreService moodAndGenreService;

    @GetMapping("/genre")
    public ResponseEntity<List<Genre>> getAllMusicGenres() {
        return ResponseEntity.ok().body(moodAndGenreService.getMoodAndGenreList());
    }

    @GetMapping("/topchart")
    public ResponseEntity<String> getTopCharts() {
        return ResponseEntity.ok().body("k");
    }
}
