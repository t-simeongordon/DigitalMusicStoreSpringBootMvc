package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public interface MoodAndGenreService {
    List<Genre> getMoodAndGenreList();
}
