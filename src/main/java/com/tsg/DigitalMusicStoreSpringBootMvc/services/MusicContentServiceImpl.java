package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.Genre;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.MoodAndGenre;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import com.tsg.DigitalMusicStoreSpringBootMvc.model.SearchResults;
import com.tsg.DigitalMusicStoreSpringBootMvc.repository.AllSongsRepository;
import com.tsg.DigitalMusicStoreSpringBootMvc.repository.SongsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Service
public class MusicContentServiceImpl implements MusicContentService {
    @Autowired
    private MoodAndGenre moodAndGenre;

    @Autowired
    private TopCharts topCharts;

    @Autowired
    private SongsRepository songsRepository;

    @Autowired
    private AllSongsRepository allSongsRepository;

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
        try {
            return moodAndGenre.getMoodAndGenre();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage(), e);
        }
    }

    @Override
    public List<TopCharts> getTopCharts() {
        TopCharts topCharts = new TopCharts();
        topCharts.setId(0L);
        topCharts.setSongName("song name");
        topCharts.setArtist("Artist");
        topCharts.setLikes("likes");
        topCharts.setViews("views");
        List<TopCharts> list = new ArrayList<>();
        list.add(topCharts);

        for (TopCharts topCharts1 : songsRepository.findAll()) {
            System.out.println("@@@@@@@@ topCharts1: " + topCharts1.getSongName());
        }
        try {
            return (List<TopCharts>) songsRepository.findAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage(), e);
        }
//        return list;
    }

    @Override
    public String saveSearchResults(SearchResults searchResults) {
        allSongsRepository.save(new AllSongs(99L, searchResults.getSongName(), searchResults.getArtist(), searchResults.getLikes(), searchResults.getViews()));
        try {
            return searchResults.getCorrelationId().toString();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage(), e);
        }
    }
    
    @Override
    public List<AllSongs> getRecentSongs() {
//        List<RecentSongs> recentSongList = new ArrayList<RecentSongs>();
//        List<AllSongs> allSongs = (List<AllSongs>) allSongsRepository.findAll();
//        if(allSongs.isEmpty()){
//            return null;
//        }
//        allSongsRepository.findAll().forEach(recentSongList::add);

//        for(AllSongs songContent : allSongs) {
//            final String songName = songContent.getSongName();
//            final String artist = songContent.getArtist();
//            final String likes = songContent.getLikes();
//            final String views = songContent.getViews();
//            recentSongList.add(new RecentSongs("","","",""));
//        add(songName,artist, likes
//                , views);
//        }
        try {
            return (List<AllSongs>) allSongsRepository.findAll();
        } catch (Exception e) {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, e.getLocalizedMessage(), e);
        }
    }
}
