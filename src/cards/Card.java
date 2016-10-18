package cards;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author butlj9437
 */
public class Card {
    
    private int rank;
    private int suit;
    private boolean isRed;
    private boolean faceUp;
    
    public Card(int rank, int suit, boolean isRed, boolean faceUp){
        this.faceUp = faceUp;
        this.isRed = isRed;
        this.rank = rank;
        this.suit = suit;
    }
    
    public int getRank(){
        return this.rank;
    }
}
