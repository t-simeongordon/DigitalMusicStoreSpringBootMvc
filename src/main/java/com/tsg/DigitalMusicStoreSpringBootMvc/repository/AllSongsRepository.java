package com.tsg.DigitalMusicStoreSpringBootMvc.repository;

import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import org.springframework.data.repository.CrudRepository;

public interface AllSongsRepository extends CrudRepository<AllSongs, Long> {

}
