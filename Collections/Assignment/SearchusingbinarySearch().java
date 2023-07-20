// You are using Java

import java.util.*;

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        ArrayList<String> names = new ArrayList<String>(n);
        for (i = 0; i < n; i++) {
            names.add(sc.nextLine());
        }
        String search = sc.nextLine();
        Collections.sort(names);
        for (i = 0; i < n; i++) {
            System.out.print(names.get(i) + " ");
        }
        int index = Collections.binarySearch(names, search);
        System.out.println();
        System.out.println(index);
    }
}
