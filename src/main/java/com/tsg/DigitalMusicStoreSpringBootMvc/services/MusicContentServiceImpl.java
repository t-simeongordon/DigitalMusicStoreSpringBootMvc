package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.MoodAndGenre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.TopCharts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicContentServiceImpl implements MusicContentService {
    @Autowired
    private MoodAndGenre moodAndGenre;

    @Autowired
    private TopCharts topCharts;

    @Override
    public List<Genre> getMoodAndGenreList() {
        Genre genre1 = new Genre();
        genre1.setKpop("kpop");
        genre1.setPop("Pop");
        genre1.setRock("Rock");
        genre1.setRnb("RnB");
        List<Genre> list = new ArrayList<>();
        list.add(genre1);
        MoodAndGenre moodAndGenre = new MoodAndGenre(list);
        return moodAndGenre.getMoodAndGenre();
    }

    @Override
    public List<TopCharts> getTopCharts() {
        TopCharts topCharts = new TopCharts();
        topCharts.setId("id");
        topCharts.setSongName("song name");
        topCharts.setArtist("Artist");
        topCharts.setLikes("likes");
        topCharts.setViews("views");
        List<TopCharts> list = new ArrayList<>();
        list.add(topCharts);
        return list;
    }
}
