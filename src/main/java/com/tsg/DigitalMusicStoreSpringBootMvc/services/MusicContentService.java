package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicContentService {
    List<Genre> getMoodAndGenreList();

    List<TopCharts> getTopCharts();
}
