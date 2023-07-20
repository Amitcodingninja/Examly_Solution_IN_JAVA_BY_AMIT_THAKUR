// You are using Java

import java.util.*;
import java.text.DecimalFormat;

abstract class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganiser() {
        return organiser;
    }

    public void setOrganiser(String organiser) {
        this.organiser = organiser;
    }

    public Event() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.organiser = null;
    }

    public Event(String name, String detail, String type, String organiser) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiser = organiser;
    }

    abstract double calculateAmount();
}

class Exhibition extends Event {
    private int noOfStalls;
    private double rentPerStall;

    @Override
    double calculateAmount() {
        return noOfStalls * rentPerStall;
    }

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }

    public double getRentPerStall() {
        return rentPerStall;
    }

    public void setRentPerStall(double rentPerStall) {
        this.rentPerStall = rentPerStall;
    }

}

class StageEvent extends Event {
    private int noOfShows;
    private double costPerShow;

    public int getNoOfShows() {
        return noOfShows;
    }

    public void setNoOfShows(int noOfShows) {
        this.noOfShows = noOfShows;
    }

    public double getCostPerShow() {
        return costPerShow;
    }

    public void setCostPerShow(double costPerShow) {
        this.costPerShow = costPerShow;
    }

    @Override
    double calculateAmount() {
        return noOfShows * costPerShow;
    }

}

class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        DecimalFormat d = new DecimalFormat("0.00");
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            Exhibition e = new Exhibition();
            e.setName(sc.nextLine());
            e.setDetail(sc.nextLine());
            e.setType(sc.nextLine());
            e.setOrganiser(sc.nextLine());
            e.setNoOfStalls(Integer.parseInt(sc.nextLine()));
            e.setRentPerStall(Double.parseDouble(sc.nextLine()));
            double amount = e.calculateAmount();
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s", "Name", "Detail", "Type", "Organiser", "NoOfStalls",
                    "RentperStall");
            System.out.println();
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s", e.getName(), e.getDetail(), e.getType(),
                    e.getOrganiser(), e.getNoOfStalls(), d.format(e.getRentPerStall()));
            System.out.println();
            System.out.println(d.format(amount));
        }
        if (choice == 2) {
            StageEvent se = new StageEvent();
            se.setName(sc.nextLine());
            se.setDetail(sc.nextLine());
            se.setType(sc.nextLine());
            se.setOrganiser(sc.nextLine());
            se.setNoOfShows(Integer.parseInt(sc.nextLine()));
            se.setCostPerShow(Double.parseDouble(sc.nextLine()));
            double amount = se.calculateAmount();
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s", "Name", "Detail", "Type", "Organiser", "NoOfShows",
                    "CostPerShow");
            System.out.println();
            System.out.format("%-20s%-20s%-20s%-20s%-20s%-20s", se.getName(), se.getDetail(), se.getType(),
                    se.getOrganiser(), se.getNoOfShows(), d.format(se.getCostPerShow()));
            System.out.println();
            System.out.println(d.format(amount));
        }
    }
}
