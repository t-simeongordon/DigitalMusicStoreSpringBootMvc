package com.tsg.DigitalMusicStoreSpringBootMvc.helper;

import com.tsg.DigitalMusicStoreSpringBootMvc.client.SpotifyClient;
import com.tsg.DigitalMusicStoreSpringBootMvc.client.SpotifyClientImpl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class QuerySongRetriever {

  @Autowired
  SpotifyClient spotifyClient;

  public String processQueriedSongRetriever(String auth, String querySong,
      List<String> musicStreamServices) {
    return spotifyClient.searchQueriedSong();
  }

}
