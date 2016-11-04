package Game;

import Cards.Card;

import java.util.List;

/**
 * Created by Nexev on 3/17/2016.
 */
public class Table {
    private Dealer dealer;
    private Hand player;
    public Table() {
        dealer = new Dealer();
        player = new Hand();
    }

    public void start(){
        dealer.initialDeal(player);

    }
    public boolean checkPly21(){
        if(player.value() == 21){
            return true;
        }
        else
            return false;
    }

    public boolean checkDealer21(){
        if (dealer.getHandValue() == 21)
            return true;
        else
            return false;

    }

    public void playerhits(){
        dealer.dealACard(player);
    }

    public void dealersTurn(){
        dealer.ai();
    }

    public Hand getPlyrHand(){
        return player;
    }

    public Dealer getDlrHand(){
        return dealer;
    }
}

