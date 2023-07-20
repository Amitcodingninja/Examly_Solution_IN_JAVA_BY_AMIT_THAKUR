// You are using Java

import java.io.*;
import java.util.*;

class Hall {
    public Hall(String name, double costPerDay, String owner) {
        this.name = name;
        this.costPerDay = costPerDay;
        this.owner = owner;
    }

    public Hall() {
        this.name = null;
        this.costPerDay = 0;
        this.owner = null;
    }

    private String name;
    private double costPerDay;
    private String owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String toString() {
        return name + " " + costPerDay + " " + owner;
    }
}

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Hall> h = new ArrayList<Hall>(n);
        Hall[] ha = new Hall[n];
        for (i = 0; i < n; i++) {
            ha[i] = new Hall();
            ha[i].setName(sc.nextLine());
            ha[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
            ha[i].setOwner(sc.nextLine());
            h.add(ha[i]);
        }
        h.sort((h1, h2) -> h1.getOwner().compareTo(h2.getOwner()));
        for (i = 0; i < n; i++) {
            System.out.println(h.get(i));
        }
    }
}
