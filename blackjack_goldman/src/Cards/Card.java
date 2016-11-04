package Cards;

/**
 * Created by Nexev on 3/15/2016.
 */
public class Card {
    private final Rank myRank;
    private final Suit mySuit;
    private final int myValue;

    public Card(Rank rank, Suit suit)
    {
        myRank = rank;
        mySuit = suit;
        switch (rank) {
            case ACE:
                myValue = 11;
                break;
            case JACK:
            case QUEEN:
            case KING:
                myValue = 10;
                break;
            default:
                myValue = rank.getRankNumber();
                break;
        }

    }

    public Rank getRank() {
        return myRank;
    }

    public Suit getSuit() {
        return mySuit;
    }

    public int getMyValue(){
        return myValue;
    }

    public String toString(){
        String returnValue = "[";
    
        switch (myRank) {
            case ACE:
                returnValue += "A";
                break;
            case JACK:
                returnValue += "J";
                break;
            case QUEEN:
                returnValue += "Q";
                break;
            case KING:
                returnValue += "K";
                break;
            default:
                returnValue += myRank.getRankNumber();
                break;
        }
        switch (mySuit){
            case SPADES:
                returnValue += "S";
                break;
            case CLUBS:
                returnValue += "C";
                break;
            case HEARTS:
                returnValue += "H";
                break;
            default:
                returnValue += "D";
                break;
        }
        returnValue += "]";
        return returnValue;
    }

}
