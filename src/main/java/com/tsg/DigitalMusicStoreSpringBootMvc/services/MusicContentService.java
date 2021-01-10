package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.RecentSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.SearchResults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MusicContentService {
    List<Genre> getMoodAndGenreList();

    List<TopCharts> getTopCharts();

    String saveSearchResults(SearchResults body);

    List<AllSongs> getRecentSongs();

}
