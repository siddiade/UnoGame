package uno;

public class UnoPlayer{
	
	public static void main(String[] args) {
		CardPile card = new CardPile();
                
                //create 108 Cards
		card.generateHand();
             
		for(Card c: card.cards) {
			System.out.println(c.getValue() + " of " + c.getSuit());
        }
    }
}
