package com.italo.gamminglist.repository;

import com.italo.gamminglist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
