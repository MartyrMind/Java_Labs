package practs.pract_2.task_9;

import java.util.Formatter;

public class Card {
    private char suit;
    private String rank;

    public Card(char suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return rank+""+suit;
    }
}
