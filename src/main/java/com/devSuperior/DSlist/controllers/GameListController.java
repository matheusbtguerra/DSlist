package com.devSuperior.DSlist.controllers;

import com.devSuperior.DSlist.dto.GameListDTO;
import com.devSuperior.DSlist.dto.GameMinDTO;
import com.devSuperior.DSlist.dto.ReplacementDTO;
import com.devSuperior.DSlist.services.GameListService;
import com.devSuperior.DSlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        return gameService.findByList(listId);
    }

    @PostMapping(value = "/{listId}/games")
    public void move(@PathVariable Long listId, @RequestBody ReplacementDTO body) {
        gameListService.move(listId, body.getSourceIndex(), body.getDestinationIndex() );
    }

}
