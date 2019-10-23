package com.codeclan.example.pinballservice.controllers;

import com.codeclan.example.pinballservice.models.Player;
import com.codeclan.example.pinballservice.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

    @Autowired
    PlayerRepository playerRepository;

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

    @GetMapping("{id}")
    public Optional<Player> getPlayer(@PathVariable Long id) {
        return playerRepository.findById(id);
    }
}
