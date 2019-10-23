package com.codeclan.example.PinballService;

import com.codeclan.example.pinballservice.models.Player;
import com.codeclan.example.pinballservice.repositories.PlayerRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class PinballServiceApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void createPlayer() {
		Player Allan = new Player("Allan", 750);
		playerRepository.save(Allan);
	}



}
