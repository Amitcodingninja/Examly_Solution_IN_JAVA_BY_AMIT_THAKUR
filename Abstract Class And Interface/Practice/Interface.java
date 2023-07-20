// You are using Java

import java.util.*;

interface Stall {
    void display();
}

class GoldStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int tvSet;

    @Override
    public void display() {
        System.out.println(stallName + " " + cost + " " + ownerName + " " + tvSet);

    }

    public GoldStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.tvSet = 0;
    }

    public GoldStall(String stallName, int cost, String ownerName, int tvSet) {
        this.stallName = stallName;
        this.cost = 0;
        this.ownerName = ownerName;
        this.tvSet = 0;
    }

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getTvSet() {
        return tvSet;
    }

    public void setTvSet(int tvSet) {
        this.tvSet = tvSet;
    }

}

class PremiumStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int projector;

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getProjector() {
        return projector;
    }

    public void setProjector(int projector) {
        this.projector = projector;
    }

    public PremiumStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.projector = 0;
    }

    public PremiumStall(String stallName, int cost, String ownerName, int projector) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.projector = projector;
    }

    @Override
    public void display() {
        System.out.println(stallName + " " + cost + " " + ownerName + " " + projector);

    }
}

class ExecutiveStall implements Stall {
    private String stallName;
    private int cost;
    private String ownerName;
    private int screen;

    public String getStallName() {
        return stallName;
    }

    public void setStallName(String stallName) {
        this.stallName = stallName;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getScreen() {
        return screen;
    }

    public void setScreen(int screen) {
        this.screen = screen;
    }

    public ExecutiveStall() {
        this.stallName = null;
        this.cost = 0;
        this.ownerName = null;
        this.screen = 0;
    }

    public ExecutiveStall(String stallName, int cost, String ownerName, int screen) {
        this.stallName = stallName;
        this.cost = cost;
        this.ownerName = ownerName;
        this.screen = screen;
    }

    @Override
    public void display() {
        System.out.println(stallName + " " + cost + " " + ownerName + " " + screen);

    }
}

class Main {
    public static void main(String[] args) {
        int choice;
        Scanner sc = new Scanner(System.in);
        choice = Integer.parseInt(sc.nextLine());
        if (choice == 1) {
            GoldStall g = new GoldStall();
            g.setStallName(sc.nextLine());
            g.setCost(Integer.parseInt(sc.nextLine()));
            g.setOwnerName(sc.nextLine());
            g.setTvSet(Integer.parseInt(sc.nextLine()));
            g.display();
        }
        if (choice == 2) {
            PremiumStall p = new PremiumStall();
            p.setStallName(sc.nextLine());
            p.setCost(Integer.parseInt(sc.nextLine()));
            p.setOwnerName(sc.nextLine());
            p.setProjector(Integer.parseInt(sc.nextLine()));
            p.display();
        }
        if (choice == 3) {
            ExecutiveStall e = new ExecutiveStall();
            e.setStallName(sc.nextLine());
            e.setCost(Integer.parseInt(sc.nextLine()));
            e.setOwnerName(sc.nextLine());
            e.setScreen(Integer.parseInt(sc.nextLine()));
            e.display();
        }
    }
}
