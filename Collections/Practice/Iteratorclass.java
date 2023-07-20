// You are using Java

import java.util.*;

class Stall {
    private String name;
    private String detail;
    private String type;
    private String ownerName;

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

    public Stall() {
        this.name = null;
        this.detail = null;
        this.type = null;
        this.ownerName = null;
    }

    public Stall(String name, String detail, String type, String ownerName) {
        this.name = name;
        this.detail = detail;
        this.type = type;
        this.ownerName = ownerName;
    }

    public String toString() {
        return name + " " + detail + " " + type + " " + ownerName;
    }
}

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<Stall> s = new ArrayList<Stall>(n);
        Stall[] st = new Stall[n];
        for (i = 0; i < n; i++) {
            st[i] = new Stall();
            st[i].setName(sc.nextLine());
            st[i].setDetail(sc.nextLine());
            st[i].setType(sc.nextLine());
            st[i].setOwnerName(sc.nextLine());
            s.add(st[i]);
        }
        Iterator iterator = s.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
