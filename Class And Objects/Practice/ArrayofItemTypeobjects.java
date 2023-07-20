// You are using Java

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

    public ItemType() {
        this.name = null;
        this.deposit = 0;
        this.costPerDay = 0;
    }

    public ItemType(String name, double deposit, double costPerDay) {
        this.name = name;
        this.deposit = deposit;
        this.costPerDay = costPerDay;
    }
}

class ItemTypeBO {
    public void searchDetail(String search, ItemType[] items, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (items[i].getName().equalsIgnoreCase(search)) {
                System.out.println(items[i].getName() + " " + items[i].getDeposit() + " " + items[i].getCostPerDay());
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("Searched item Type not found");
        }
    }

    public void display(ItemType[] items, int n) {
        for (ItemType item : items) {
            System.out.println(item.getName() + " " + item.getDeposit() + " " + item.getCostPerDay());
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ItemType[] items = new ItemType[n];
        ItemTypeBO itemTypeBO = new ItemTypeBO();
        for (int i = 0; i < n; i++) {
            items[i] = new ItemType();
            items[i].setName(sc.next());
            items[i].setDeposit(sc.nextDouble());
            items[i].setCostPerDay(sc.nextDouble());
        }
        String search = sc.next();
        itemTypeBO.searchDetail(search, items, n);
        itemTypeBO.display(items, n);
    }
}
