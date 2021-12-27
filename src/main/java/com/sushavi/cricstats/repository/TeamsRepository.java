package com.sushavi.cricstats.repository;

import com.sushavi.cricstats.entity.Teams;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamsRepository extends CrudRepository<Teams, Long> {
}
