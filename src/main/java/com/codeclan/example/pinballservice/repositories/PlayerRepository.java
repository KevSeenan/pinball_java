package com.codeclan.example.pinballservice.repositories;

import com.codeclan.example.pinballservice.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
}
