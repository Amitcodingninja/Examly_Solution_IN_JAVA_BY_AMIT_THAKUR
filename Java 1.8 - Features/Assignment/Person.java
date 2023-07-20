// You are using Java

import java.util.Scanner;

class Person {
    String name;
    String emailid;
    String mobileNumber;

    public Person() {
        super();

    }

    @Override
    public String toString() {
        return "Name : " + name + "\nEmail : " + emailid + "\nMobile Number : " + mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

}

class PersonMain {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);

        String name = myObj.nextLine();
        String emailid = myObj.nextLine();
        String mobileNumber = myObj.nextLine();

        Person one = new Person();
        one.setName(name);
        one.setEmailid(emailid);
        one.setMobileNumber(mobileNumber);

        System.out.println(one);

        myObj.close();

    }
}
