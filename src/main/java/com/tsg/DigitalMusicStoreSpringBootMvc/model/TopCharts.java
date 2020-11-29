package com.tsg.DigitalMusicStoreSpringBootMvc.model;

import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TopCharts {
    private String id;
    private String songName;
    private String artist;
    private String likes;
    private String views;
}
