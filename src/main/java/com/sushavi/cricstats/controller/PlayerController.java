package com.sushavi.cricstats.controller;

import com.sushavi.cricstats.projection.PlayersView;
import com.sushavi.cricstats.service.PlayerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping("/showPlayers")
    public List<PlayersView> showRecords() {
        log.info("Inside showRecords");
        return playerService.showPlayers();
    }
}
