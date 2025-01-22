package com.devSuperior.DSlist.repositories;
import com.devSuperior.DSlist.entities.Game;
import com.devSuperior.DSlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
