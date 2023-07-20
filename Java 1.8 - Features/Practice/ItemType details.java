// You are using Java

import java.io.*;
import java.util.*;

class ItemType {
    private String name;
    private double deposit;
    private double costPerDay;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public ItemType() {
        this.name = null;
        this.deposit = 0;
        this.costPerDay = 0;
    }

    public ItemType(String name, double deposit, double costPerday) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }

    public String toString() {
        return name + " " + deposit + " " + costPerDay;
    }
}

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<ItemType> it = new ArrayList<ItemType>(n);
        ItemType[] item = new ItemType[n];
        for (i = 0; i < n; i++) {
            item[i] = new ItemType();
            item[i].setName(sc.nextLine());
            item[i].setDeposit(Double.parseDouble(sc.nextLine()));
            item[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
            it.add(item[i]);
        }
        it.sort((item1, item2) -> Double.compare(item1.getCostPerDay(), item2.getCostPerDay()));
        for (i = 0; i < n; i++) {
            System.out.println(it.get(i));
        }
    }
}
