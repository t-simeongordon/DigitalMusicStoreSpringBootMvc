package com.tsg.DigitalMusicStoreSpringBootMvc.model;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MoodAndGenre {
    public MoodAndGenre(List<Genre> moodAndGenre) {
        this.moodAndGenre = moodAndGenre;
    }

    public List<Genre> getMoodAndGenre() {
        return moodAndGenre;
    }

    public void setMoodAndGenre(List<Genre> moodAndGenre) {
        this.moodAndGenre = moodAndGenre;
    }

    @Override
    public String toString() {
        return "MoodAndGenre{" +
                "moodAndGenre=" + moodAndGenre +
                '}';
    }

    List<Genre> moodAndGenre;
}
