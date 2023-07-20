import java.util.Scanner;

interface Notification {
    void notificationBySms();

    void notificationByEmail();

    void notificationByCourier();
}

class Icici implements Notification {
    @Override
    public void notificationBySms() {
        System.out.println("ICICI - Notification by SMS");
    }

    @Override
    public void notificationByEmail() {
        System.out.println("ICICI - Notification by Email");

    }

    @Override
    public void notificationByCourier() {
        System.out.println("ICICI - Notification by Courier");

    }

}

class Hdfc implements Notification {

    @Override
    public void notificationBySms() {
        System.out.println("ICICI - Notification by SMS");
    }

    @Override
    public void notificationByEmail() {
        System.out.println("HDFC - Notification by Email");

    }

    @Override
    public void notificationByCourier() {
        System.out.println("HDFC - Notification by Courier");

    }

}

class BankMain {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        int bank = Integer.parseInt(myObj.nextLine());
        int type = Integer.parseInt(myObj.nextLine());

        if (bank == 1) {
            Icici iciciObj = new Icici();
            if (type == 1)
                iciciObj.notificationBySms();
            else if (type == 2)
                iciciObj.notificationByEmail();
            else if (type == 3)
                iciciObj.notificationByCourier();
            else
                System.out.println("Invalid Input");
        } else if (bank == 2) {
            Hdfc hdfcObj = new Hdfc();
            if (type == 1)
                hdfcObj.notificationBySms();
            else if (type == 2)
                hdfcObj.notificationByEmail();
            else if (type == 3)
                hdfcObj.notificationByCourier();
            else
                System.out.println("Invalid Input");

        } else
            System.out.println("Invalid Input");

    }

}