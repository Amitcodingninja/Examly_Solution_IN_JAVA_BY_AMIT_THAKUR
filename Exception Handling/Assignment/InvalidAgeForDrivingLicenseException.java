// You are using Java

import java.util.Scanner;

class InvalidAgeForDrivingLicenseException extends Exception {

    String expDescription;

    InvalidAgeForDrivingLicenseException(String expDescription) {

        super(expDescription);
    }
}

class InvalidMarkForDrivingLicenseException extends Exception {

    String expDescription;

    InvalidMarkForDrivingLicenseException(String expDescription) {

        super(expDescription);
    }
}

class RegisterForDrivingLicenseDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int userAge = Integer.parseInt(scanner.nextLine());
        int mark = Integer.parseInt(scanner.nextLine());

        try {

            if (userAge < 0) {

                throw new InvalidAgeForDrivingLicenseException("Invalid age");
            } else if (userAge < 18) {

                throw new InvalidAgeForDrivingLicenseException("Age should be more than 18 years old");
            } else if ((mark < 0) || (mark >= 100)) {
                throw new InvalidMarkForDrivingLicenseException("Invalid mark");
            }

            else if (mark < 80) {
                throw new InvalidMarkForDrivingLicenseException("Mark should be more than 80");
            }
            System.out.println("Approved");
        } catch (InvalidAgeForDrivingLicenseException iafdlex) {
            System.out.println(iafdlex);
        } catch (InvalidMarkForDrivingLicenseException imfdlex) {
            System.out.println(imfdlex);
        }

    }
}
