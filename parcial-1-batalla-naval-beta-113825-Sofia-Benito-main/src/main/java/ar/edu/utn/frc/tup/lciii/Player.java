package ar.edu.utn.frc.tup.lciii;

import java.util.Collection;

/**
 * Esta clase representa un jugador
 *
 * Puede instanciarde como el usuario que jugará y como la app.
 */

public class Player {

    /**
     * Name of the player
     */
    private String playerName;

    /**
     * Accumulated score of the match
     */
    private Integer score;

    /**
     * Accumulated games won
     */
    private Integer gamesWon;

    /**
     * Number of ships sunk by the player
     */
    private Integer shipsSunk;

    /**
     * Number of turns taken by the player
     */
    private Integer turnsTaken;

    /**
     * Boolean indicating whether the player is human or not
     */
    private Boolean isHuman;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(Integer gamesWon) {
        this.gamesWon = gamesWon;
    }

    public Integer getShipsSunk() {
        return shipsSunk;
    }

    public void setShipsSunk(Integer shipsSunk) {
        this.shipsSunk = shipsSunk;
    }

    public Integer getTurnsTaken() {
        return turnsTaken;
    }

    public void setTurnsTaken(Integer turnsTaken) {
        this.turnsTaken = turnsTaken;
    }

    public Boolean getIsHuman() {
        return isHuman;
    }

    public void setIsHuman(Boolean isHuman) {
        this.isHuman = isHuman;
    }

    // TODO: constructors if necessary...

    public Player() {
        playerName = "";
        score = 0;
        gamesWon = 0;
        shipsSunk = 0;
        turnsTaken = 0;
        isHuman = false;
    }

    public Player(String playerName, Integer score, Integer gamesWon, Integer shipsSunk, Integer turnsTaken, Boolean isHuman) {
        this.playerName = playerName;
        this.score = score;
        this.gamesWon = gamesWon;
        this.shipsSunk = shipsSunk;
        this.turnsTaken = turnsTaken;
        this.isHuman = isHuman;
    }


}

