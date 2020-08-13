package uno;

public class CardPile {

        public CardPile() {

        Card[] magicHand = new Card[7];
        System.out.println("Welcome to Uno game");
        Card luckyCard = new Card();
        luckyCard.setValue(7);

        int i = 0;
        System.out.println("1. 1 OF RED");
        System.out.println("2. 2 OF RED");
        System.out.println("3. 3 OF RED");
        System.out.println("4. 1 OF YELLOW");
        System.out.println("5. 2 OF YELLOW");
        System.out.println("6. 3 OF YELLOW");
        System.out.println("7. 1 OF BLUE");
        System.out.println("8. 2 OF BLUE");
        System.out.println("9. 3 OF BLUE");
        System.out.println("10. 1 OF GREEN");
        System.out.println("11. 2 OF GREEN");
        System.out.println(" 12. 3 OF GREEN");
        
        do {

            Card c = new Card();
            //c.setValue(insert call to random number generator here)
            c.setValue((int) (Math.random() * 13) + 1);
            //c.setSuit(Card.SUITS[insert call to random number between 0-3 here])
            int temp = (int) (Math.random() * 11);
            c.setSuit(c.SUITS[temp]);
            magicHand[i] = c;




            Scanner input = new Scanner(System.in);



            int cardLeft=7;

            System.out.println("Select your Card");
            int card = input.nextInt();
            System.out.println(temp);

            if(card == 1){
                System.out.println("Your card is 1 OF RED ");
            }
           else if(card == 2){
                System.out.println("Your card is 2 OF RED ");
            }
            else if(card == 3){
                System.out.println("Your card is 3 OF RED ");
            }
            else if(card == 4){
                System.out.println("Your card is 1 OF YELLOW ");
            }
            else if(card == 5){
                System.out.println("Your card is 2 OF YELLOW ");
            }
            else if(card == 6){
                System.out.println("Your card is 3 OF YELLOW");
            }
            else if(card == 7){
                System.out.println("Your card is 1 OF BLUE ");
            }
            else if(card == 8){
                System.out.println("Your card is 2 OF BLUE ");
            }
            else if(card == 9){
                System.out.println("Your card is 3 OF BLUE ");
            }
            else if(card == 10){
                System.out.println("Your card is 1 OF GREEN ");
            }
            else if(card == 11){
                System.out.println("Your card is 2 OF GREEN");
            }
            else if(card == 12){
                System.out.println("Your card is 3 OF GREEN ");
            }

            if (card == temp) {
                System.out.println("Card match");

                if(temp == 1){
                    System.out.println("Computer card is 1 OF RED ");
                }
                else if(temp == 2){
                    System.out.println("Computer card is 2 OF RED ");
                }
                else if(temp == 3){
                    System.out.println("Computer card is 3 OF RED ");
                }
                else if(temp == 4){
                    System.out.println("Computer card is 1 OF YELLOW ");
                }
                else if(temp == 5){
                    System.out.println("Computer card is 2 OF YELLOW ");
                }
                else if(temp == 6){
                    System.out.println("Computer card is 3 OF YELLOW");
                }
                else if(temp == 7){
                    System.out.println("Computer card is 1 OF BLUE ");
                }
                else if(temp == 8){
                    System.out.println("Computer card is 2 OF BLUE ");
                }
                else if(temp == 9){
                    System.out.println("Computer card is 3 OF BLUE ");
                }
                else if(temp == 10){
                    System.out.println("Computer card is 1 OF GREEN ");
                }
                else if(temp == 11){
                    System.out.println("Computer card is 2 OF GREEN");
                }
                else if(card == 12){
                    System.out.println("Computer card is 3 OF GREEN ");
                }}

                if (card == temp) {
                    System.out.println("Card match");

                cardLeft--;
                System.out.println("You lost a card\nTotalCards:"+magicHand.length);
            }
            else{
                System.out.println("Card not matched");
                cardLeft++;

                System.out.println("Pick a card\nTotal Cards"+cardLeft);
            }


            i++;
        }
            while (i < magicHand.length) ;
        }
    }
}

		


