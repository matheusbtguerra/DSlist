package com.devSuperior.DSlist.services;

import com.devSuperior.DSlist.dto.GameMinDTO;
import com.devSuperior.DSlist.entities.Game;
import com.devSuperior.DSlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findaAll(){
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();
    }
}
