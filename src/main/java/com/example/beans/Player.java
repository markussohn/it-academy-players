package com.example.beans;

/**
 * Created by justinas on 16.2.10.
 */
public class Player {
    private long id;
    private String nickname;

    public Player(String nickname) {
        this.nickname = nickname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
