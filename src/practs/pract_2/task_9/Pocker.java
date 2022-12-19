package practs.pract_2.task_9;

import java.lang.reflect.Array;
import java.util.*;

public class Pocker {
    private static Character HEARTS = (char) 9829;
    private static Character DIAMONDS = (char) 9830;
    private static Character SPADES = (char) 9824;
    private static Character CLUBS = (char) 9827;

    private static List<Character> suits = Arrays.asList(HEARTS, DIAMONDS, SPADES, CLUBS);
    private static List<Character> ranks = Arrays.asList('J', 'Q', 'K', 'A');

    public static ArrayList<Card> buildShuffledDeck() {
        ArrayList<Card>cards = new ArrayList<Card>();
        for(char suit : suits) {
            for(int i = 2; i < 11; i++)
                cards.add(new Card(suit, Integer.toString(i)));
            for(char rank : ranks)
                cards.add(new Card(suit, ""+rank));
        }
        Collections.shuffle(cards);
        return cards;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Число игроков: ");
        int n = in.nextInt();
        if (n * 5 > 52 || n <= 0) System.out.println("Некорректное число игроков");
        else {
            ArrayList<Card> cards = buildShuffledDeck();
            for(int i = 1; i <= n * 5; i++) {
                System.out.print(cards.get(i - 1) + " ");
                if (i % 5 == 0) System.out.println("\n");
            }
        }
    }
}
