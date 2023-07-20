
// You are using Java
import java.text.DecimalFormat;
import java.util.*;

class TicketBooking {
    private String stageEvent;
    private String customer;
    private int noOfSeats;
    DecimalFormat d = new DecimalFormat("0.0");

    public TicketBooking(String stageEvent, String customer, String noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = Integer.parseInt(noOfSeats);
    }

    public void makePayment(String creditCard, String ccv, String name, Double amount) {
        System.out.println(this.stageEvent + " " + this.customer + " " + this.noOfSeats + " " + name + " "
                + d.format(amount) + " " + creditCard + " " + ccv);
    }

    public void makePayment(String walletNumber, Double amount) {
        System.out.println(this.stageEvent + " " + this.customer + " " + this.noOfSeats + " " + d.format(amount) + " "
                + walletNumber);
    }

    public void makePayment(Double amount) {
        System.out.println(this.stageEvent + " " + this.customer + " " + this.noOfSeats + " " + d.format(amount));
    }

    public String getStageEvent() {
        return stageEvent;
    }

    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String details = sc.nextLine();
        String[] det = details.split(",");
        TicketBooking t = new TicketBooking(det[0], det[1], det[2]);
        int n = sc.nextInt();
        if (n == 1) {
            double amount = sc.nextDouble();
            t.makePayment(amount);
        }
        if (n == 2) {
            double amount = sc.nextDouble();
            String walletNumber = sc.next();
            t.makePayment(walletNumber, amount);
        }
        if (n == 3) {
            String name = sc.next();
            double amount = sc.nextDouble();
            String type = sc.next();
            String ccv = sc.next();
            t.makePayment(type, ccv, name, amount);
        }
        if (n > 3) {
            System.out.println("Invalid Choice");
        }
    }
}
