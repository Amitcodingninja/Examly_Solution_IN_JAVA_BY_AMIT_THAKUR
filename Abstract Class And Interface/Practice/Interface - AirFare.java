// You are using Java

import java.util.*;
import java.text.DecimalFormat;

interface Airfare {
    public double calculateAmount();
}

class AirIndia implements Airfare {
    private int hours;
    private double costPerHour;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public AirIndia() {
        this.hours = 0;
        this.costPerHour = 0;
    }

    public AirIndia(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour;
    }
}

class KingFisher implements Airfare {
    private int hours;
    private double costPerHour;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public KingFisher() {
        this.hours = 0;
        this.costPerHour = 0;
    }

    public KingFisher(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour * 4;
    }
}

class Indigo implements Airfare {
    private int hours;
    private double costPerHour;

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getCostPerHour() {
        return costPerHour;
    }

    public void setCostPerHour(double costPerHour) {
        this.costPerHour = costPerHour;
    }

    public Indigo() {
        this.hours = 0;
        this.costPerHour = 0;
    }

    public Indigo(int hours, double costPerHour) {
        this.hours = hours;
        this.costPerHour = costPerHour;
    }

    @Override
    public double calculateAmount() {
        return hours * costPerHour * 8;
    }
}

class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            AirIndia a = new AirIndia();
            a.setHours(Integer.parseInt(sc.nextLine()));
            a.setCostPerHour(Double.parseDouble(sc.nextLine()));
            double result = a.calculateAmount();
            System.out.println(d.format(result));
        }
        if (choice == 2) {
            KingFisher k = new KingFisher();
            k.setHours(Integer.parseInt(sc.nextLine()));
            k.setCostPerHour(Double.parseDouble(sc.nextLine()));
            double result = k.calculateAmount();
            System.out.println(d.format(result));
        }
        if (choice == 3) {
            Indigo i = new Indigo();
            i.setHours(Integer.parseInt(sc.nextLine()));
            i.setCostPerHour(Double.parseDouble(sc.nextLine()));
            double result = i.calculateAmount();
            System.out.println(d.format(result));
        }
    }
}
