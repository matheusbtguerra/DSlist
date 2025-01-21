package com.devSuperior.DSlist.repositories;
import com.devSuperior.DSlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
