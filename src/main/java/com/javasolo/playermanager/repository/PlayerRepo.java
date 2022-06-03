package com.javasolo.playermanager.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.javasolo.playermanager.model.Player;

@Repository
public interface PlayerRepo extends JpaRepository<Player, Long> {

	void deletePlayerById(Long id);
	
	Optional<Player> findPlayerById(Long id);

}
