package BookMarket;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.name = "Последний шанс";
        book1.price = 350;
        book1.publishedDate = 2017;

        Book book2 = new Book();
        book2.name = "Стихи";
        book2.price = 200;
        book2.publishedDate = 2000;
        Book[] bookLibrary = {book1, book2};
        findBook("Стихи", 2000, bookLibrary);
        printLibrary(bookLibrary);
    }

    private static void printLibrary(Book[] bookLibrary) {
        for (Book i : bookLibrary
        ) {
            System.out.printf("книга №: название: %s, год издания: %dг., цена - %dusd \n", i.name, i.publishedDate, i.price);
        }
    }

    private static void findBook(String name, int publishedDate, Book[] bookLibrary) {
        for (Book i:bookLibrary
             ) {
            if (name.equals(i.name)) {
                System.out.println("Книга есть в картотеке");
            } else {
                System.out.println("Книгу добавили в картотеку");
            }
        }
    }
}
