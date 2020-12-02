package com.tsg.DigitalMusicStoreSpringBootMvc.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.Column;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchResults {
    private String correlationId;
    private String songName;
    private String artist;
    private String likes;
    private String views;
    private String timeStamp;
}