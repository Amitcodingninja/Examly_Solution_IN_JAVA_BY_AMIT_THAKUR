// You are using Java

import java.util.Scanner;

class InvalidQuantityException extends Exception {
    InvalidQuantityException(String s) {
        super(s);
    }
}

class Book {
    public String id, title, author;
    public float price;
    public int quant;

    public Book(String id, String title, String author, float price, int quant) {
        super();
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.quant = quant;
    }

    public void purchase(int quant) throws Exception {
        if ((this.quant - quant) < 0) {
            throw new InvalidQuantityException("Quantity not available");
        } else {
            this.quant = this.quant - quant;
            System.out.println("New quantity : " + this.quant);
        }
    }
}

class Store {
    public static void main(String args[]) {

        Scanner myObj = new Scanner(System.in);

        String id = myObj.nextLine();
        String title = myObj.nextLine();
        String author = myObj.nextLine();
        float price = Float.parseFloat(myObj.nextLine());
        int quant = Integer.parseInt(myObj.nextLine());

        Book b1 = new Book(id, title, author, price, quant);

        int purchaseQty = Integer.parseInt(myObj.nextLine());

        try {
            b1.purchase(purchaseQty);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
