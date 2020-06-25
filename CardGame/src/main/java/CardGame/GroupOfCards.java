/**
 * SYST 17796 Project Winter 2019 Base code.
 * Students can modify and extend to implement their game.
 * Add your name as a modifier and the date!
 */
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.Collections;

/**
 * A concrete class that represents any grouping of cards for a Game.
 * HINT, you might want to subclass this more than once.
 * The group of cards has a maximum size attribute which is flexible for reuse.
 * @author dancye
 */
public class GroupOfCards 
 //The group of cards, stored in an ArrayList
    private ArrayList<String> cards;
    private int size;//the size of the grouping

    public GroupOfCards(int givenSize)
    {
        Random rand = new Random();
        size = givenSize;
        cards = new ArrayList<String>();
        String[] colours = {"red", "blue", "green", "yellow"};
        String colour;
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int num;

        int randGenCol = rand.nextInt(colours.length);
        int randGenNum = rand.nextInt(number.length);


        for(int i=0; i<size; i++) {
            num = number[randGenNum];
            colour = colours[randGenCol];
            for (i=0; i<size; i++) {
                cards.add(num + colour);
                System.out.println(cards.get(i));

            }
        }
    }

    /**
     * A method that will get the group of cards as an ArrayList
     * @return the group of cards.
     */
    public ArrayList<String> showCards()
    {
        return cards;
    }

    public void shuffle()
    {
        Collections.shuffle(cards);
    }

    /**
     * @return the size of the group of cards
     */
    public int getSize() {
        return size;
    }

    /**
     * @param givenSize the max size for the group of cards
     */
    public void setSize(int givenSize) {
        size = givenSize;
    }

    public static void main(String args[]) {
        new GroupOfCards(2);
    }

}//end class
