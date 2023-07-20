// You are using Java


import java.util.*;

class Main {
    public static void main(String[] args) {
        int i, n;
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        HashMap<String, Integer> map = new HashMap<>(n);
        for (i = 0; i < n; i++) {
            String name = sc.nextLine();
            int roll = Integer.parseInt(sc.nextLine());
            map.put(name, roll);
        }
        System.out.println(map);
        String search = sc.nextLine();
        map.remove(search);
        System.out.println(map);
    }
}
