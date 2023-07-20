// You are using Java

import java.util.Scanner;

class AgeNotWithInRangeException extends Exception {
    public String toString() {
        return ("Age is not between 15 and 21");
    }
}

class NameNotValidException extends Exception {
    public String toString() {
        return ("Name is not Valid");
    }
}

class Student {
    int roll, age;
    String name, course;

    Student() {
        roll = 0;
        name = null;
        age = 0;
        course = null;
    }

    Student(int r, String n, int a, String c) {
        roll = r;
        course = c;
        int l, temp = 0;
        l = n.length();
        for (int i = 0; i < l; i++) {
            char ch;
            ch = n.charAt(i);
            if (ch < 'A' || ch > 'Z' && ch < 'a' || ch > 'z')
                temp = 1;
        }

        try {
            if (temp == 1) {
                name = n;
                throw new NameNotValidException();
            } else
                name = n;
        } catch (NameNotValidException e2) {
            System.out.println(e2);
        }

        try {
            if (a >= 15 && a <= 21)
                age = a;
            else {
                age = a;

                throw new AgeNotWithInRangeException();
            }
        } catch (AgeNotWithInRangeException e1) {
            System.out.println(e1);
        }
    }

    void display() {

        System.out.println(roll + " " + name + " " + age + " " + course);
    }
}

class StudentDemo {
    public static void main(String args[]) {
        Scanner br = new Scanner(System.in);

        int roll = Integer.parseInt(br.nextLine());

        String name = br.nextLine();

        int age = Integer.parseInt(br.nextLine());

        String course = br.nextLine();
        Student s = new Student(roll, name, age, course);
        s.display();
    }
}
