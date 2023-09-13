package com.example.fullstack.api;

import com.example.fullstack.entity.Player;
import com.example.fullstack.repository.PlayerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class PlayerController {
    PlayerRepository playerRepository;
    
    public PlayerController(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }
    
    @GetMapping
    List<Player> getPlayers(){
        return playerRepository.findAll();
    }
}
