package com.example.fullstack.repository;

import com.example.fullstack.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Integer> {
    Player findByName(String name);
    Player findByNameLike(String name);
}
