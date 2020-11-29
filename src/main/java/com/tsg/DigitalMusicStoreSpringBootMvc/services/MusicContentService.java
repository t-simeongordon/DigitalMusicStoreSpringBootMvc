package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.TopCharts;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicContentService {
    List<Genre> getMoodAndGenreList();

    List<TopCharts> getTopCharts();
}
