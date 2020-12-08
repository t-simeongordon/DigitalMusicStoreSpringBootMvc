package com.tsg.DigitalMusicStoreSpringBootMvc.repository;

import com.tsg.DigitalMusicStoreSpringBootMvc.entity.AllSongs;
import com.tsg.DigitalMusicStoreSpringBootMvc.entity.TopCharts;
import org.springframework.data.repository.CrudRepository;

/**
 * extent CrudRepository
 * No implementation needed as spring boot automatically provides this for us
 * just need to pass domain class that will be managed and the ID of the Domain class type
 * e.g. CrudRepository<TopCharts,Long>
 */
public interface SongsRepository extends CrudRepository<TopCharts, Long> {
}
