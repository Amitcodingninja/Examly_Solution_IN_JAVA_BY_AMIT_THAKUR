// You are using Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class CallLog implements Comparable<CallLog> {

    String dialledNumber;
    Integer duration;
    String date;

    public CallLog(String dialledNumber, int duration, String date) {
        super();

        this.dialledNumber = dialledNumber;
        this.duration = duration;
        this.date = date;
    }

    @Override
    public int compareTo(CallLog log) {
        return this.duration.compareTo(log.duration);
    }

    @Override
    public String toString() {
        return "DialledNumber : " + dialledNumber + ", Duration : " + duration + ", Date : " + date;
    }

}

class CallLogSorting {

    public static void main(String args[]) {
        List<CallLog> logs = new ArrayList<CallLog>();
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < n; i++) {
            String dialledNumber = sc.nextLine();
            Integer duration = Integer.parseInt(sc.nextLine());
            String date = sc.nextLine();
            logs.add(new CallLog(dialledNumber, duration, date));
        }

        Collections.sort(logs);

        for (int i = 0; i < n; i++) {
            System.out.println(logs.get(i));
        }
    }

}
