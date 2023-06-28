package HW3Java2;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Product2> productList = createList(n);
        System.out.println("productList = " + productList);
        int cultivarSearch = scanner.nextInt();
        List<Integer> productPrice = new ArrayList<>();
        HashSet<String> productName = new HashSet<>();

        for (Product2 product2 : productList) {
            if (product2.getCultivar() == cultivarSearch)
                productPrice.add(product2.getPrice());
        }
        int minPrice = Collections.min(productPrice);
        System.out.println("minPrice = " + minPrice);

        for (Product2 product2 : productList) {
            if (product2.getPrice() == minPrice && product2.getCultivar() == cultivarSearch)
                productName.add(product2.getName());
        }
        System.out.println("productName = " + productName);
    }

    private static ArrayList<Product2> createList(int n) {
        ArrayList<Product2> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Product2 product1 = new Product2("кукуруза", "Россия", 100, 100, random.nextInt(1, 3));
            Product2 product2 = new Product2("мука", "Белоруссия", 100, 2000, random.nextInt(1, 3));
            Product2 product3 = new Product2("греча", "Украина", 100, 100, random.nextInt(1, 3));
            resultList.add(product1);
            resultList.add(product2);
            resultList.add(product3);
        }
        return resultList;
    }
}
