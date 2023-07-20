// You are using Java

import java.util.*;

class StallCategory {
    public String name;
    public String detail;

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

    public StallCategory() {
        System.out.println("Using Default Constructor");
    }

    public StallCategory(String name, String detail) {
        System.out.println("Using Parameterized Constructor");
        this.name = name;
        this.detail = detail;

        System.out.println(this.name);
        System.out.println(this.detail);
    }
}

class Main {
    public static void main(String[] args) {
        StallCategory obj = new StallCategory();
        Scanner sc = new Scanner(System.in);
        obj.name = sc.nextLine();
        obj.detail = sc.nextLine();
        obj.setName(obj.name);
        obj.setDetail(obj.detail);
        StallCategory obj1 = new StallCategory(obj.name, obj.detail);
    }
}
