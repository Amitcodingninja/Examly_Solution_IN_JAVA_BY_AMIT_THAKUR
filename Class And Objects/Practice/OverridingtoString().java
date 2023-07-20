// You are using Java

import java.util.Scanner;

class Address {
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private int pincode;

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;

    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public Address(String addressLine1, String addressLine2, String city, String state, int pincode) {
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }

    public Address() {
        this(null, null, null, null, 0);
    }

    @Override
    public String toString() {
        return addressLine1 + "\n" + addressLine2 + "\n" + city + "\n" + state + "\n" + pincode;
    }
}

class Main {
    public static void main(String[] args) {
        Address a = new Address();
        Scanner sc = new Scanner(System.in);
        a.setAddressLine1(sc.nextLine());
        a.setAddressLine2(sc.nextLine());
        a.setCity(sc.next());
        a.setState(sc.next());
        a.setPincode(sc.nextInt());
        Address a1 = new Address(a.getAddressLine1(), a.getAddressLine2(), a.getCity(), a.getState(), a.getPincode());
        System.out.println(a1);
    }
}