//package com.tsg.DigitalMusicStoreSpringBootMvc.controller;
//
//import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
//import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicContentService;
//import com.tsg.DigitalMusicStoreSpringBootMvc.services.MusicContentServiceImpl;
//import java.util.ArrayList;
//import java.util.List;
//import org.junit.Assert;
//import org.junit.Test;
//import org.junit.jupiter.api.DisplayName;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.ResultActions;
//import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
//import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
//
//@WebMvcTest(DmsController.class)
//public class dmsControllerTest {
//  @Autowired
//  MockMvc mockMvc;
//
//  @Autowired
//  DmsController dmsController;
//
//  @MockBean
//  MusicContentServiceImpl musicContentService;
// final String API_ENDPOINT = "/searched/songs";
//  @Test
//  @DisplayName("controller test")
//  public void getResult() throws Exception {
//    //given
//    AllSongs allSongs = new AllSongs().builder().artist("").id(0L).likes("11").songName("SUN").views("12").build();
//    List<AllSongs> allSongsList = new ArrayList<>();
//    allSongsList.add(allSongs);
//
//    //when
//  Mockito.when(musicContentService.getRecentSongs()).thenReturn(allSongsList);
//    ResultActions response = mockMvc
//        .perform(MockMvcRequestBuilders.get(API_ENDPOINT));
//
//
//    // Then
//    response.andExpect(MockMvcResultMatchers.status().isBadRequest());
//
////    Assert.assertEquals(allSongsList,recentSongs);
//  }
//
//}
