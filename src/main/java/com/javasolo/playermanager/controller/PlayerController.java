package com.javasolo.playermanager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javasolo.playermanager.model.Player;
import com.javasolo.playermanager.service.PlayerServiceImpl;

@RestController
public class PlayerController {

	@Autowired
	private PlayerServiceImpl playerServiceImpl;

	@GetMapping("/player")
	public List<Player> getAllPlayer() {

		return playerServiceImpl.findAllPlayer();
	}

	@GetMapping("/player/find/{id}")
	public Player findPlayerById(@PathVariable Long id) {

		return playerServiceImpl.findPlayerById(id);
	}

	@PostMapping("/player/add")
	public Player addPlayer(Player player) {

		return playerServiceImpl.addPlayer(player);
	}
	
	@PutMapping("/player/update")
	public Player updatePlayer(Player player) {

		return playerServiceImpl.addPlayer(player);
	}
	
	@DeleteMapping("/player/delete/{id}")
	public void deletePlayer(@PathVariable Long id) {

		playerServiceImpl.deletePlayer(id);
	}
	
	

}
