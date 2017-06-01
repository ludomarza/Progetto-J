package handtypes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import model.Card;

/**
 * Classe astratta della mano di carte
 */
public abstract class Hand implements Comparable {
    
    protected List<Card> cards;
    
    /**
     * Calcola il punteggio della singola mano 
     * @return il numero rappresentante il punteggio
     */
    public abstract double getPoints();

    public Hand(List<Card> cards) {
        this.cards = new ArrayList<>();
        for (Card carta : cards)
        {
            this.cards.add(carta);
        }
    }
    
    @Override
    public int compareTo(Object o) {
        Hand other =  (Hand)o;
        return (int)(1000000 * (other.getPoints() - this.getPoints()));
    }

    public List<Card> getCards() {
        return cards;
    }
    
    /**
     * Stampa la descrizione delle carte nella mano
     * @return la stringa descrittiva delle carte nella mano
     */
    public String getFullDescription(){
        String result = "";
        for (Card carta : cards)
        {
            result += carta.toString() + "\n";
        }
        return result;
    }       

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.cards);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hand other = (Hand) obj;
        if (!Objects.equals(this.cards, other.cards)) {
            return false;
        }
        return true;
    }
    
    
}