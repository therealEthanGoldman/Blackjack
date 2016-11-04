package Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Nexev on 3/15/2016.
 */
public class Deck {
    private List<Card> Cards;

    public Deck()
    {
        Cards = new ArrayList<Card>(); //Creating a complete deck
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(r, s);
                Cards.add(c);
            }
        }
    }

    public void shuffle()
    {
        Collections.shuffle(Cards);
    }

    public Card draw()
    {
        if (!Cards.isEmpty())
            return Cards.remove(0);
        else
            return null;
    }

    public int getNumberCards()
    {
        return Cards.size();
    }
}
