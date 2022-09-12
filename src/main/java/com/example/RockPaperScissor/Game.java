package com.example.RockPaperScissor;

public class Game {

    private Choice choiceOne;
    private Choice choiceTwo;

    public Choice getChoiceOne() {
        return choiceOne;
    }

    public void setChoiceOne(Choice choiceOne) {
        this.choiceOne = choiceOne;
    }

    public Choice getChoiceTwo() {
        return choiceTwo;
    }

    public void setChoiceTwo(Choice choiceTwo) {
        this.choiceTwo = choiceTwo;
    }

    public String whoWins(Choice firstChoice, Choice secondChoice){
        if (firstChoice.equals(secondChoice)){
            return "It's a draw";
        }
        if (firstChoice.getWinsAgainst().equals(secondChoice.getName())){
            return "Player 1 Won";
        } else {
            return "Player 2 Won";
        }
    }
}
