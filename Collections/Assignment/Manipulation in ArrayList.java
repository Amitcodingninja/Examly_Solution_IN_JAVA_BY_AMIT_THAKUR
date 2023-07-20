// You are using Java

import java.util.*;

class Hall {
    private String name;
    private String contactNumber;
    private Double costPerDay;
    private String ownerName;

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

    public Double getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(Double costPerDay) {
        this.costPerDay = costPerDay;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Hall() {
        this.name = null;
        this.contactNumber = null;
        this.costPerDay = (double) 0;
        this.ownerName = null;
    }

    public Hall(String name, String contactNumber, Double costPerDay, String ownerName) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.costPerDay = costPerDay;
        this.ownerName = ownerName;
    }
}

class HallBO {
    public List<Hall> getHallList() {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        Hall[] h = new Hall[n];
        ArrayList<Hall> ha = new ArrayList<Hall>(n);
        for (i = 0; i < n; i++) {
            h[i] = new Hall();
            h[i].setName(sc.nextLine());
            h[i].setContactNumber(sc.nextLine());
            h[i].setCostPerDay(Double.parseDouble(sc.nextLine()));
            h[i].setOwnerName(sc.nextLine());
            ha.add(h[i]);
        }
        return ha;
    }

    public void display(List<Hall> ha) {
        System.out.printf("%-20s%-20s%-20s%-20s\n", "Name", "Contact Number", "Cost per Day", "Owner Name");
        for (int i = 0; i < ha.size(); i++) {
            System.out.format("%-20s%-20s%-20s%-20s\n", ha.get(i).getName(), ha.get(i).getContactNumber(),
                    ha.get(i).getCostPerDay(), ha.get(i).getOwnerName());
        }
    }

}

class Main {
    public static void main(String[] args) {
        List<Hall> ha = new ArrayList<Hall>();
        HallBO hbo = new HallBO();
        Scanner sc = new Scanner(System.in);
        ha = hbo.getHallList();
        hbo.display(ha);
    }
}
