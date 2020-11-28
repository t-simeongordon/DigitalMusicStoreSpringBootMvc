package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.MoodAndGenre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoodAndGenreServiceImpl implements MoodAndGenreService {
    @Autowired
    private MoodAndGenre moodAndGenre;

    @Override
    public List<Genre> getMoodAndGenreList() {
        Genre genre1 = new Genre();
        genre1.setKpop("kpop");
        genre1.setPop("Pop");
        List<Genre> list = new ArrayList<>();
        list.add(genre1);
        MoodAndGenre moodAndGenre = new MoodAndGenre(list);

//        return list;
        return moodAndGenre.getMoodAndGenre();

    }
}
