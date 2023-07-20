// You are using Java

import java.io.*;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

class Event {
    public String name;
    public String detail;
    public String type;
    public String ownerName;
    public Double costPerDay;

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

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }
}

class Exhibition extends Event {
    public int noOfStall;

    public Exhibition(String name, String detail, String type, String ownerName, Double costPerDay, int noOfStall2) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
        this.noOfStall = noOfStall;
    }

    public Exhibition() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.ownerName = null;
        this.costPerDay = (double) 0;
        this.noOfStall = 0;
    }

    public int getNoOfStall() {
        return noOfStall;
    }

    public void setNoOfStall(int noOfStall) {
        this.noOfStall = noOfStall;
    }
}

class StageEvent extends Event {
    public int noOfSeats;

    public StageEvent(String name, String detail, String type, String ownerName, Double costPerDay, int noOfSeats2) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
        this.costPerDay = costPerDay;
        this.noOfSeats = noOfSeats;
    }

    public StageEvent() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.ownerName = null;
        this.costPerDay = 0.0;
        this.noOfSeats = 0;
    }

    public int getNoOfSeats() {
        return noOfSeats;
    }

    public void setNoOfSeats(int noOfSeats) {
        this.noOfSeats = noOfSeats;
    }
}

class Main {
    public static void main(String[] args) throws ParseException {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        Exhibition ex = new Exhibition();
        StageEvent se = new StageEvent();
        DecimalFormat dd = new DecimalFormat("0.0");
        if (n == 1) {

            ex.setName(sc.nextLine());
            ex.setDetail(sc.nextLine());
            ex.setType(sc.nextLine());
            ex.setOwnerName(sc.nextLine());
            ex.setCostPerDay(Double.parseDouble(sc.nextLine()));
            ex.setNoOfStall(Integer.parseInt(sc.nextLine()));
            Exhibition ex1 = new Exhibition(ex.name, ex.detail, ex.type, ex.ownerName, ex.costPerDay, ex.noOfStall);
            String date1 = sc.nextLine();
            String date2 = sc.nextLine();
            Date start = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            Date end = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
            long diff = (start.getTime() - end.getTime()) / 86400000;
            Double result = 0.05 * ex.costPerDay * diff;
            System.out.println(dd.format(Math.abs(result)));
        }
        if (n == 2) {
            se.setName(sc.nextLine());
            se.setDetail(sc.nextLine());
            se.setType(sc.nextLine());
            se.setOwnerName(sc.nextLine());
            se.setCostPerDay(Double.parseDouble(sc.nextLine()));
            se.setNoOfSeats(Integer.parseInt(sc.nextLine()));
            StageEvent se1 = new StageEvent(se.name, se.detail, se.type, se.ownerName, se.costPerDay, se.noOfSeats);
            String date1 = sc.nextLine();
            String date2 = sc.nextLine();
            Date start = new SimpleDateFormat("dd/MM/yyyy").parse(date1);
            Date end = new SimpleDateFormat("dd/MM/yyyy").parse(date2);
            long diff = (start.getTime() - end.getTime()) / 86400000;
            Double result = 0.15 * se.costPerDay * diff;
            System.out.println(dd.format(Math.abs(result)));
        }
    }
}