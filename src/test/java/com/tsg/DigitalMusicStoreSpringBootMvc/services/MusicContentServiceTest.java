package com.tsg.DigitalMusicStoreSpringBootMvc.services;

import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.repository.AllSongsRepository;
import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({SpringExtension.class})
@ContextConfiguration(classes = {MusicContentService.class})
public class MusicContentServiceTest {

  @MockBean
  private AllSongsRepository mockAllSongsRepository;

  @Autowired
  private MusicContentServiceImpl getMusicContentService;

  @Test
  @DisplayName("Given user has previous results list of songs are returned")
  void hh() {

    // Given
    //find all returns an array lists
    Mockito.when(mockAllSongsRepository.findAll()).thenReturn(Arrays.asList(
        new AllSongs(9L, "99 problems", "jay z", "77", "99"),
        new AllSongs(6L, "buffalo soldier", "bob marley", "77", "99")
    ));

    // When
    final List<AllSongs> recentSongs = getMusicContentService.getRecentSongs();

    // Then
    Assertions.assertNotNull(recentSongs);
//    Assertions.assertEquals(queryId, paymentsDetail.getQueryId());
//    Assertions.assertEquals("123",paymentsDetail.getPaymentAmount());
//    Assertions.assertEquals("20110101",paymentsDetail.getPaymentDate());
  }
}
