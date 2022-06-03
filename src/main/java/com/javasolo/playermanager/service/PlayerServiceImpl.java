package com.javasolo.playermanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javasolo.playermanager.exception.UserNotFoundException;
import com.javasolo.playermanager.model.Player;
import com.javasolo.playermanager.repository.PlayerRepo;


@Service
public class PlayerServiceImpl{
	
	
	@Autowired
	private PlayerRepo playerRepo;
	
	
	public Player addPlayer(Player player) {
		
		return playerRepo.save(player);
	}
	
	public List<Player> findAllPlayer(){
		
		return playerRepo.findAll();
		
	}
	
	public Player updatePlayer(Player player) {
		
		return playerRepo.save(player);
	}
	
	public void deletePlayer(Long id) {
		
		playerRepo.deletePlayerById(id);
	}
	
	public Player findPlayerById(Long id) {
		
		return playerRepo.findPlayerById(id)
				.orElseThrow(() -> new UserNotFoundException("player by " + id + " not found"));
				
					
	}
	

}
