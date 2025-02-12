package com.devSuperior.DSlist.controllers;

import com.devSuperior.DSlist.dto.GameDTO;
import com.devSuperior.DSlist.dto.GameMinDTO;
import com.devSuperior.DSlist.entities.Game;
import com.devSuperior.DSlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {
    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id) {
        return gameService.findById(id);
    }
}
