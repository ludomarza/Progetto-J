/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import actions.Action;
import handtypes.Hand;
import java.util.ArrayList;
import poker.Card;

/**
 *
 * @author Nickelsilver
 */
public class ClientPlayer {

    protected String name;
    private int stake;
    private ArrayList<Card> cards;
    private boolean active;
    private Action lastAction; 
    private Hand currentHand;
    protected int id = 0;

    public ClientPlayer(String name, int stake) {
        this.name = name;
        this.stake = stake;
    }

    public int getStake() {
        return stake;
    }

    public void setStake(int stake) {
        this.stake = stake;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Action getLastAction() {
        return lastAction;
    }

    public void setLastAction(Action lastAction) {
        this.lastAction = lastAction;
    }

    public Hand getCurrentHand() {
        return currentHand;
    }

    public void setCurrentHand(Hand currentHand) {
        this.currentHand = currentHand;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    

}