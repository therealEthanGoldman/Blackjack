package Game;



import Cards.Card;
import Cards.Deck;
import Cards.Rank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nexev on 3/15/2016.
 */
public class Hand {
    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public int value() {
        int returnValue = 0;
        int numAces = 0;

        for (Card card:cards)
        {
            returnValue += card.getMyValue();
            if (card.getRank() == Rank.ACE)
                numAces++;
        }
        for (int i = 0; i < numAces; i++) {
            if (returnValue > 21)
            {
                returnValue -= 10;
            }
        }
        return returnValue;
    }//end value

    public void DrawACard(Deck deck)
    {
        if (deck == null)
            return;
        Card newCard = deck.draw();
        if (newCard != null)
        {
            cards.add(newCard);
        }
    }
    public List<Card> getHand() {
        return Collections.unmodifiableList(cards);
    }

    public boolean anyAcesAt11() {
        int value = 0;
        int numAces = 0;
        int count = 0;
        for (Card c : cards) {
            value += c.getMyValue();
            if (c.getRank() == Rank.ACE)
                numAces++;
        }
        count = numAces;
        for (int i = 0; i < numAces; i++) {
            if (value > 21) {
                value -= 10;
                count--;
            }
        }
        return  (count < numAces);
    }
}
