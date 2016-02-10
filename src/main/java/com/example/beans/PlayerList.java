package com.example.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by justinas on 16.2.10.
 */
public class PlayerList {

    List<Player> players = new ArrayList<Player>();
    long playerID = 0;

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayer(Player player) {
        player.setId(playerID);
        players.add(player);
        playerID++;
    }
}
