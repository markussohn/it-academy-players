package com.example.services;

import com.example.beans.Player;
import com.example.beans.PlayerList;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

/**
 * Created by justinas on 16.2.10.
 */
@RestController
public class PlayersService {

    private PlayerList playerList;

    @PostConstruct
    public void init() {
        playerList = new PlayerList();
        playerList.setPlayer(new Player("destroyer3000"));
        playerList.setPlayer(new Player("saulius"));
    }

    @RequestMapping("/players")
    public PlayerList list() {
        return playerList;
    }

    @RequestMapping(value = "/players", method = RequestMethod.PUT)
    public void createPlayer(String playerNickname) {
        playerList.setPlayer(new Player(playerNickname));
    }

    @RequestMapping(value = "players/{id}", method = RequestMethod.DELETE)
    public void deletePlayer(@PathVariable long id){
        Player toRemove = null;
        for (Player player : playerList.getPlayers()) {
            if(player.getId() == id){
                toRemove = player;
            }
        }
        if(toRemove != null)
            playerList.getPlayers().remove(toRemove);
    }

}
