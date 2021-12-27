package com.sushavi.cricstats.repository;

import com.sushavi.cricstats.entity.Players;
import com.sushavi.cricstats.projection.PlayersView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends CrudRepository<Players, Long> {
    @Query(
            value = "SELECT p.player_id playerId, p.player_name playerName, t.team_name teamName, rc.role_name roleName, p.country_cd countryCd " +
                    "FROM Players p " +
                    "join Teams t on p.team_id = t.team_id " +
                    "join Category rc on rc.role_id = p.role_id " +
                    "WHERE p.in_active = 'Y'",
            nativeQuery = true)
    List<PlayersView> getPlayers();
}
