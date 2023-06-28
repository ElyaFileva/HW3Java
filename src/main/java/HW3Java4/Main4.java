package HW3Java4;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> arrayList = createList(n);
        System.out.println("arrayList = " + arrayList);
        System.out.println("Collections.max(arrayList) = " + Collections.max(arrayList));
        System.out.println("Collections.min(arrayList) = " + Collections.min(arrayList));
        double average = arrayList.stream().mapToDouble(Integer::intValue).sum() / arrayList.size();
        System.out.println("average = " + average);
    }

    private static ArrayList createList(int n) {
        ArrayList<Integer> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            resultList.add(random.nextInt(1, 10));
        }
        return resultList;
    }
}