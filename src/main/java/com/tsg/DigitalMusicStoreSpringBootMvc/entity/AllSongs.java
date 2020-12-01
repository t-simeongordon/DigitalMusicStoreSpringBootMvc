package com.tsg.DigitalMusicStoreSpringBootMvc.entity;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Component
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AllSongs {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "song_id")
    private Long id;
    @Column(name = "song_name", nullable = false)
    private String songName;
    private String artist;
    private String likes;
    private String views;
}