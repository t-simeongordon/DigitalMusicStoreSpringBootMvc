package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface MusicStreamingService {

  String getQueriedTrack(String auth, String querySong, List<String> musicStreamServices);

}
