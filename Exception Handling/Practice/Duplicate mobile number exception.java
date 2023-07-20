// You are using Java

import java.io.*;
import java.util.*;

class ContactDetail {
    private String mobile;
    private String alternateMobile;
    private String landLine;
    private String email;
    private String address;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getAlternateMobile() {
        return alternateMobile;
    }

    public void setAlternateMobile(String alternateMobile) {
        this.alternateMobile = alternateMobile;
    }

    public String getLandLine() {
        return landLine;
    }

    public void setLandLine(String landLine) {
        this.landLine = landLine;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ContactDetail() {
        this.mobile = null;
        this.alternateMobile = null;
        this.landLine = null;
        this.email = null;
        this.address = null;
    }

    public ContactDetail(String mobile, String alternateMobile, String landLine, String email, String address) {
        this.mobile = mobile;
        this.alternateMobile = alternateMobile;
        this.landLine = landLine;
        this.email = email;
        this.address = address;
    }
}

class ContactDetailBO {
    public void validate(String mobile, String AlternateMobile) throws DuplicateMobileNumberException {
        if (mobile.compareTo(AlternateMobile) == 0) {
            throw new DuplicateMobileNumberException("Mobile number and alternate mobile number are same");
        } else {
            System.out.println("Correct Details");
        }
    }
}

class DuplicateMobileNumberException extends Exception {
    public DuplicateMobileNumberException(String s) {
        System.out.println(s);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactDetail c = new ContactDetail();
        c.setMobile(sc.nextLine());
        c.setAlternateMobile(sc.nextLine());
        c.setLandLine(sc.nextLine());
        c.setEmail(sc.nextLine());
        c.setAddress(sc.nextLine());
        ContactDetailBO cbo = new ContactDetailBO();
        try {
            cbo.validate(c.getMobile(), c.getAlternateMobile());
        } catch (Exception d) {
            System.out.println(d);
        }
    }
}
