// You are using Java

import java.io.*;
import java.util.*;

class User {
    private String name;
    private String mobile;
    private String username;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public User() {
        this.name = null;
        this.mobile = null;
        this.username = null;
        this.password = null;
    }

    public User(String name, String mobile, String username, String password) {
        this.name = name;
        this.mobile = mobile;
        this.username = username;
        this.password = password;
    }

    public String toString() {
        return name + " " + mobile + " " + username + " " + password;
    }
}

class UserBO {
    public void validate(User u) throws WeakPasswordException {
        int i, flag = 0;
        if (u.getPassword().length() >= 10 && u.getPassword().length() <= 20) {
            for (i = 0; i < u.getPassword().length(); i++) {
                if (Character.isDigit(u.getPassword().charAt(i))) {
                    flag = 1;
                    break;
                }
            }
        }
        if (flag == 0) {
            throw new WeakPasswordException("Your password is weak");
        }
    }
}

class WeakPasswordException extends Exception {
    public WeakPasswordException(String s) {
        System.out.println(s);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User u = new User();
        u.setName(sc.nextLine());
        u.setMobile(sc.nextLine());
        u.setUsername(sc.nextLine());
        u.setPassword(sc.nextLine());
        UserBO ubo = new UserBO();
        try {
            ubo.validate(u);
            System.out.println(u);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
