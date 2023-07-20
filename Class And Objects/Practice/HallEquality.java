// You are using Java

import java.util.Scanner;
import java.util.Objects;

class Hall {
    private String name;
    private String contactNumber;
    private double costPerDay;
    private String ownerName;

    public Hall(String name, String contactNumber, double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Hall)) {
            return false;
        }
        Hall hall = (Hall) o;
        return Objects.equals(name, hall.name) &&
                Objects.equals(contactNumber, hall.contactNumber) &&
                Double.compare(costPerDay, hall.costPerDay) == 0 &&
                Objects.equals(ownerName, hall.ownerName);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hall h1 = new Hall(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine());
        Hall h2 = new Hall(sc.nextLine(), sc.nextLine(), Double.parseDouble(sc.nextLine()), sc.nextLine());
        if (h1.equals(h2)) {
            System.out.println("Halls are same");
        } else {
            System.out.println("Halls are different");
        }
    }
}
