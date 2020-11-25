package com.tsg.DigitalMusicStoreSpringBootMvc.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v0/music")
public class dmsController {
    @GetMapping("/genre")
    public ResponseEntity<String> getAllMusicGenres() {
        return ResponseEntity.ok().body("Music");
    }
}
