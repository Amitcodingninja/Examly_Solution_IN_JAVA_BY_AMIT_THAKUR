// You are using Java

import java.util.Scanner;

class Country {
    String name;
    String countryCode;
    String isdCode;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getIsdCode() {
        return isdCode;
    }

    public void setIsdCode(String isdCode) {
        this.isdCode = isdCode;
    }
}

class CountryMain {
    public static void main(String args[]) {
        Scanner myObj = new Scanner(System.in);
        String name = myObj.nextLine();
        String countryCode = myObj.nextLine();
        String isdCode = myObj.nextLine();
        Country myCountry = new Country();
        myCountry.setName(name);
        myCountry.setCountryCode(countryCode);
        myCountry.setIsdCode(isdCode);
        System.out.println("Country Name : " + myCountry.getName());
        System.out.println("Country Code : " + myCountry.getCountryCode());
        System.out.println("ISD Code : " + myCountry.getIsdCode());
        myObj.close();
    }
}
