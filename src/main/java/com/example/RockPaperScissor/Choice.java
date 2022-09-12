package com.example.RockPaperScissor;

public enum Choice {

    ROCK("Rock", "Scissor"),
    PAPER("Paper", "Rock"),
    SCISSOR("Scissor", "Paper");

    private String name;
    private String winsAgainst;

    Choice(String name, String winsAgainst) {
        this.name = name;
        this.winsAgainst = winsAgainst;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWinsAgainst() {
        return winsAgainst;
    }

    public void setWinsAgainst(String winsAgainst) {
        this.winsAgainst = winsAgainst;
    }
}
