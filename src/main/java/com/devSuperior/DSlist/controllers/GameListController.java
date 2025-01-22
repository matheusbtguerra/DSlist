package com.devSuperior.DSlist.controllers;

import com.devSuperior.DSlist.dto.GameListDTO;
import com.devSuperior.DSlist.services.GameListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @Transactional(readOnly = true)
    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

}
