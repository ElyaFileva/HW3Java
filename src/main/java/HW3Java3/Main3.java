package HW3Java3;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Book> bookList = createList(n);
        System.out.println("bookList = " + bookList);
        HashSet<String> nameBooks = new HashSet<>();

        for (Book book : bookList) {
            if (book.getSurnameOfAuthor().toUpperCase().contains("А") &&
                    book.getYear() >= 2010 && book.primePagesCount() == true)
                nameBooks.add(book.getName());
        }
        System.out.println("nameBooks = " + nameBooks);

    }

    private static ArrayList<Book> createList(int n) {
        ArrayList<Book> resultList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            Book book1 = new Book("Война и мир", "Толстой", 1000, 2010, random.nextInt(1, 2000));
            Book book2 = new Book("Преступление и наказание", "Достоевский", 1100, 2016, random.nextInt(1, 2000));
            Book book3 = new Book("Маленький принц", "Экзюпари", 700, 2020, random.nextInt(1, 2000));
            Book book4 = new Book("Крестный отец", "Пьюзо", 3000, 1999, random.nextInt(1, 2000));
            resultList.add(book1);
            resultList.add(book2);
            resultList.add(book3);
            resultList.add(book4);
        }
        return resultList;
    }
}
