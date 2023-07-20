// You are using Java

import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

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
}

class Main {
    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.0");
        n = Integer.parseInt(sc.nextLine());
        ArrayList<ItemType> item = new ArrayList<ItemType>(n);
        ItemType[] it = new ItemType[n];
        for (i = 0; i < n; i++) {
            it[i] = new ItemType();
            it[i].setName(sc.nextLine());
            it[i].setDeposit(Double.parseDouble(sc.nextLine()));
            it[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
            item.add(it[i]);
        }
        System.out.format("%-20s%-20s%-20s\n", "Name", "Deposit", "CostPerDay");
        for (i = 0; i < n; i++) {
            System.out.format("%-20s%-20s%-20s\n", item.get(i).getName(), d.format(item.get(i).getDeposit()),
                    d.format(item.get(i).getCostPerDay()));
        }
    }
}
