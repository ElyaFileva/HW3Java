package HW3Java;

import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int maxPrice = 0;
        List<Product> productList = createList(n);
        System.out.println("productList = " + productList);

        for (int i = 0; i < productList.size(); i++) {
            if ((productList.get(i).getCultivar() == 1 || productList.get(i).getCultivar() == 2) &&
                    productList.get(i).getName().toLowerCase().contains("высший") &&
                    productList.get(i).getPrice() > maxPrice) {
                maxPrice = productList.get(i).getPrice();
            }
        }
        System.out.println("maxPrice = " + maxPrice);
    }

    private static ArrayList<Product> createList(int n) {
        ArrayList<Product> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Product product1 = new Product("кукуруза", 1000, random.nextInt(1, 5));
            Product product2 = new Product("Высший мука", 3000, random.nextInt(1, 5));
            Product product3 = new Product("мороженое высший знак", 90, random.nextInt(1, 5));
            Product product4 = new Product("хлеб высший сорт", 100, random.nextInt(1, 5));
            Product product5 = new Product("булугур высший сорт", 1000, random.nextInt(1, 5));
            resultList.add(product1);
            resultList.add(product2);
            resultList.add(product3);
            resultList.add(product4);
            resultList.add(product5);
        }
        return resultList;
    }
}
