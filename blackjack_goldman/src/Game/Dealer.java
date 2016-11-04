package Game;

import Cards.Card;
import Cards.Deck;

import java.util.List;

/**
 * Created by Nexev on 3/17/2016.
 */
public class Dealer {

    private Deck deck;
    private Hand dealer;

    public Dealer(){
        deck = new Deck();
        dealer = new Hand();
    }

    public List<Card> getHand(){
        return dealer.getHand();
    }

    public int getHandValue(){
        return dealer.value();
    }

    public void dealACard(Hand hand){
        hand.DrawACard(deck);
    }

    public void initialDeal(Hand hand){
        deck.shuffle();
        dealACard(hand);
        dealACard(dealer);
        dealACard(hand);
        dealACard(dealer);
    }

    public void ai(){
        if (getHandValue() == 17)
        {
            if (dealer.anyAcesAt11()){
                dealACard(dealer);
                ai();
            }
        }
        else if (getHandValue() < 17){
            dealACard(dealer);
            ai();
        }
    }
}
