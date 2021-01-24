package com.tsg.DigitalMusicStoreSpringBootMvc.client;

import org.springframework.stereotype.Component;

@Component
public class SpotifyClientImpl implements SpotifyClient {

  @Override
  public String searchQueriedSong() {
    return "searchQueriedSong";
  }
}
