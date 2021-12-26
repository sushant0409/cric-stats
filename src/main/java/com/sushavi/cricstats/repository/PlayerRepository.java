package com.sushavi.cricstats.repository;

import com.sushavi.cricstats.entity.Players;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<Players, Long> {
}
