// You are using Java

import java.util.*;

class Event {
    protected String name;
    protected String detail;
    protected String type;
    protected String organiserName;

    public Event(String name, String detail, String type, String organiserName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.organiserName = organiserName;
    }

    public Event() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.organiserName = null;
    }

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

    public String getOrganiserName() {
        return organiserName;
    }

    public void setOrganiserName(String organiserName) {
        this.organiserName = organiserName;
    }
}

class Exhibition extends Event {
    private int noOfStalls;

    public Exhibition(String name, String detail, String type, String organiserName, String noOfStalls) {
        super(name, detail, type, organiserName);
        this.noOfStalls = Integer.parseInt(noOfStalls);
    }

    public Exhibition() {
        super();
        this.noOfStalls = 0;
    }

    public int getNoOfStalls() {
        return noOfStalls;
    }

    public void setNoOfStalls(int noOfStalls) {
        this.noOfStalls = noOfStalls;
    }
}

class StageEvent extends Event {
    private int noOfSeats;

    public StageEvent(String name, String detail, String type, String organiserName, String noOfSeats) {
        super(name, detail, type, organiserName);
        this.noOfSeats = Integer.parseInt(noOfSeats);
    }

    public StageEvent() {
        super();
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
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        if (n == 1) {
            String detail = sc.nextLine();
            String[] exhib = detail.split(",");
            Event e = new Event(exhib[0], exhib[1], exhib[2], exhib[3]);
            Exhibition ex = new Exhibition(exhib[0], exhib[1], exhib[2], exhib[3], exhib[4]);
            System.out.println(
                    ex.name + " " + ex.detail + " " + ex.type + " " + ex.organiserName + " " + ex.getNoOfStalls());
        }
        if (n == 2) {
            String detail = sc.nextLine();
            String[] stage = detail.split(",");
            Event e = new Event(stage[0], stage[1], stage[2], stage[3]);
            StageEvent se = new StageEvent(stage[0], stage[1], stage[2], stage[3], stage[4]);
            System.out.println(
                    se.name + " " + se.detail + " " + se.type + " " + se.organiserName + " " + se.getNoOfSeats());
        }
        if (n >= 3) {
            System.out.println("Invalid input");

        }
    }
}