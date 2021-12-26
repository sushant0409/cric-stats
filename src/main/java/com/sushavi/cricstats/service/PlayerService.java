package com.sushavi.cricstats.service;

import com.sushavi.cricstats.entity.Players;
import com.sushavi.cricstats.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlayerService {
    private final PlayerRepository playerRepository;

    public List<Players> showPlayers() {
        return (List<Players>)playerRepository.findAll();
    }
}
