package com.tsg.DigitalMusicStoreSpringBootMvc.client;

import org.springframework.stereotype.Component;

@Component
public interface SpotifyClient {

  String searchQueriedSong();
}
