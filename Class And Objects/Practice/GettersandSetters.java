// You are using Java

import java.text.DecimalFormat;
import java.util.Scanner;

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

    public void displayItemDetails() {
        DecimalFormat decimalFormat = new DecimalFormat("0.0");
        System.out.println(getName());
        System.out.println(decimalFormat.format(getDeposit()));
        System.out.println(decimalFormat.format(getCostPerDay()));
    }
}

class Main {
    public static void main(String[] args) {
        ItemType obj = new ItemType();
        Scanner sc = new Scanner(System.in);
        obj.setName(sc.next());
        obj.setDeposit(sc.nextDouble());
        obj.setCostPerDay(sc.nextDouble());
        obj.displayItemDetails();
    }
}