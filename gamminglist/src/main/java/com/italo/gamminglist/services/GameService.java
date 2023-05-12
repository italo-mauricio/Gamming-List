package com.italo.gamminglist.services;
import com.italo.gamminglist.dto.GameMinDTO;
import com.italo.gamminglist.entities.Game;
import com.italo.gamminglist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;
    public List<GameMinDTO> findAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }
}
