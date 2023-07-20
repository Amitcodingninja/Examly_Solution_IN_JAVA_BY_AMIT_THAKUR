// You are using Java

import java.util.Scanner;
import java.util.Objects;

class User {
    private String name;
    private String username;
    private String password;
    private String mobileNumber;

    public User(String name, String username, String password, String mobileNumber) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
    }

    public User() {
        this(null, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(mobileNumber, user.mobileNumber);

    }

    @Override
    public String toString() {
        return "Name: " + name + "\nUsername: " + username + "\nPassword: " + password + "\nMobile Number: "
                + mobileNumber;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u1 = new User();
        User u2 = new User();
        u1.setName(sc.nextLine());
        u1.setUsername(sc.nextLine());
        u1.setPassword(sc.nextLine());
        u1.setMobileNumber(sc.nextLine());
        u2.setName(sc.nextLine());
        u2.setUsername(sc.nextLine());
        u2.setPassword(sc.nextLine());
        u2.setMobileNumber(sc.nextLine());
        if (u1.equals(u2)) {
            System.out.println("User 1 and User 2 are equal");
        } else {
            System.out.println("User 1 and User 2 are not equal");
        }

    }
}