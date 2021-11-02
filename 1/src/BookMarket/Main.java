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

        Book book3 = new Book();
        book3.name = "Стихи2";
        book3.price = 100;
        book3.publishedDate = 1800;

        Book[] bookLibrary = new Book[2];
        System.out.println(bookLibrary.length);
        addBook(bookLibrary, book1);
        addBook(bookLibrary, book2);
        addBook(bookLibrary, book3);

        isBookInLibrary(bookLibrary, book1);
        printLibrary(bookLibrary);
    }

    private static void addBook(Book[] bookLibrary, Book book) {
        if (!isBookInLibrary(bookLibrary, book)) {
            for (int i = 0; i < bookLibrary.length; i++) {
                if (bookLibrary[i] == null) {
                    bookLibrary[i] = book;
                    System.out.println("Книга добавлена в картотеку");
                    break;
                }
                if (i == bookLibrary.length - 1) { // тк индекс с 0
                    System.out.println("Картотека переполнена");
                }
            }
        }
    }

    private static void printLibrary(Book[] bookLibrary) {
        for (int i = 0; i < bookLibrary.length; i++) {
            if (bookLibrary[i] != null) {
                System.out.printf("книга №%d: название: %s, год издания: %dг., цена - %dusd \n", i + 1, bookLibrary[i].name, bookLibrary[i].publishedDate, bookLibrary[i].price);
            }
        }
    }

    protected static boolean isBookInLibrary(Book[] bookLibrary, Book book) {
        for (Book i : bookLibrary
        ) {
            if (i != null && book.name.equals(i.name) && book.publishedDate == i.publishedDate) {
                System.out.println("Книга есть в картотеке");
                return true;
            }
        }
        System.out.println("Книги нет в картотеке");
        return false;
    }
}
