package com.codeclan.example.pinballservice.components;

import com.codeclan.example.pinballservice.models.Player;
import com.codeclan.example.pinballservice.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    PlayerRepository playerRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Player allan = new Player("Allan", 750);
        playerRepository.save(allan);
        Player kev  = new Player("Kev", 1100);
        playerRepository.save(kev);
        Player tommy = new Player("Tommy" ,12000);
        playerRepository.save(tommy);
        Player sally = new Player("Sally" ,500);
        playerRepository.save(sally);
        Player acid = new Player("The Acid Queen" ,300);
        playerRepository.save(acid);
    }
}

