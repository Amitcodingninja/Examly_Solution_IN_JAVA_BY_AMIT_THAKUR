// You are using Java

import java.util.*;

class User implements Comparable<User> {
    public User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.username = username;
        this.password = password;
    }

    public User() {
        this.name = null;
        this.mobileNumber = null;
        this.username = null;
        this.password = null;
    }

    private String name;
    private String mobileNumber;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
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

    @Override
    public int compareTo(User u) {
        return this.name.compareTo(u.name);
    }

    public String toString() {
        return name + " " + mobileNumber + " " + username + " " + password;
    }
}

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        User[] u = new User[n];
        ArrayList<User> us = new ArrayList<User>(n);
        for (i = 0; i < n; i++) {
            u[i] = new User();
            u[i].setName(sc.nextLine());
            u[i].setMobileNumber(sc.nextLine());
            u[i].setUsername(sc.nextLine());
            u[i].setPassword(sc.nextLine());
            us.add(u[i]);
        }
        Collections.sort(us, Collections.reverseOrder());
        for (i = 0; i < n; i++) {
            System.out.println(us.get(i));
        }
    }
}
