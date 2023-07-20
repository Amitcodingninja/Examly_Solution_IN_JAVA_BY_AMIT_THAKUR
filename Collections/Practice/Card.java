// You are using Java

import java.util.*;
import java.lang.*;
import java.io.*;

class Q03Easy_Collections1 {
    static class Card {
        private String symbol;
        private Integer number;

        public Card(String symbol, Integer num) {
            this.symbol = symbol;
            this.number = num;
        }

        public String getSymbol() {
            return symbol;
        }

        public void setSymbol(String symbol) {
            this.symbol = symbol;
        }

        public Integer getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String toString() {
            return this.symbol + " " + this.number;
        }
    }

    static class CardComp implements Comparator<Card> {

        @Override
        public int compare(Card e1, Card e2) {
            return e1.getSymbol().compareTo(e2.getSymbol());
        }
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner input = new Scanner(System.in);
        boolean err = false;
        int count = 0;
        TreeSet<Card> cards = new TreeSet<Card>(new CardComp());
        while (cards.size() < 4) {
            // Input card
            String symbol = input.nextLine();
            Integer value = null;
            do {
                try {
                    value = Integer.parseInt(input.nextLine());
                    err = false;
                } catch (NumberFormatException e) {
                    System.out.println("Invalid Input");
                    err = true;
                }
            } while (err);
            cards.add(new Card(symbol, value));
            count++;
        }
        System.out.println("Four symbols gathered in " + count + " cards");
        System.out.println("Cards in Set are: ");

        for (Card card : cards) {
            System.out.println(card);
        }
    }
}
