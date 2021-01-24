package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.helper.QuerySongRetriever;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MusicStreamingServiceImpl implements MusicStreamingService {

  @Autowired
  QuerySongRetriever querySongRetriever;

  @Override
  public String getQueriedTrack(String auth, String querySong, List<String> musicStreamServices) {
    return querySongRetriever.processQueriedSongRetriever(auth, querySong, musicStreamServices);
  }
}
