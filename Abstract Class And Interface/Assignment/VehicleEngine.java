// You are using Java

import java.util.*;

interface Engine {
    void changeGear(int a);

    void speedUp(int a);

}

class Vehicle {
    int speed;
    int gear;

    public void speedUp(int a) {
        this.speed = a;
        System.out.println("speed" + speed);
    }

    public void changeGear(int a) {
        this.gear = a;
        System.out.println("gear" + gear);
    }

    public static void main(String[] args) {
        Vehicle objv = new Vehicle();
        Scanner sc = new Scanner(System.in);
        objv.changeGear(Integer.parseInt(sc.nextLine()));
        objv.speedUp(Integer.parseInt(sc.nextLine()));

    }
}
