
// You are using Java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfEvents;
        // System.out.print("Number of events hosted in Codissia: ");
        numberOfEvents = scanner.nextInt();
        System.out.println("Number of events hosted in Codissia is " + numberOfEvents);
        scanner.close();
    }

}