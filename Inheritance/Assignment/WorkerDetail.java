// You are using Java

import java.util.Scanner;

class WorkerDetail {
    int c, s;
    String n;
    float h;

    void setSalary(int x, String y, int z) {
        c = x;
        n = y;
        s = z;
    }

    void showDetail() {
        System.out.println("Code :" + c);
        System.out.println("Name : " + n);
        System.out.println("Salary " + s);
    }

    void getHra() {
        h = (float) s * 60 / 100;
        System.out.println("HRA :" + h);
    }
}

class OfficerSal extends WorkerDetail {
    float d;

    void getDA() {
        d = (float) s * 98 / 100;
        System.out.println("DA :" + d);
    }
}

class ManagerSal extends OfficerSal {
    float ca, g;

    void getCA() {
        ca = (float) s * 20 / 100;
        System.out.println("City Allowance :" + ca);
    }

    void getgross() {
        g = s + h + d + ca;
        System.out.println("Gross Salary :" + g);
    }
}

class MultilevelMain {
    public static void main(String args[]) {
        ManagerSal m = new ManagerSal();
        Scanner myObj = new Scanner(System.in);
        int code = Integer.parseInt(myObj.nextLine());
        String name = myObj.nextLine();
        int sal = Integer.parseInt(myObj.nextLine());
        m.setSalary(code, name, sal);
        m.showDetail();
        m.getHra();
        m.getDA();
        m.getCA();
        m.getgross();
    }
}