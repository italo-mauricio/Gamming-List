package com.italo.gamminglist.controllers;

import com.italo.gamminglist.entities.Game;
import com.italo.gamminglist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<Game> findAll(){
        List<Game> result = gameService.findAll();
        return result;
    }
}
