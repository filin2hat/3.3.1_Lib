import Classes.AdminLib;
import Classes.Book;
import Classes.Librarian;
import Classes.ReaderSupplier;

public class Main {

    public static void main(String[] args) {

        Book bookOne = new Book("Алые Паруса");
        Book bookTwo = new Book("Философия JAVA");
        Book bookThree = new Book("Помоги себе сам");

        AdminLib administratorAndLibrarian = new AdminLib("Пётр");
        ReaderSupplier readerSupplier = new ReaderSupplier("Николай");
        Librarian librarian = new Librarian("Ольга");

        System.out.println();
        administratorAndLibrarian.orderBook(readerSupplier, bookTwo);
        readerSupplier.giveBook(librarian, bookOne);
        librarian.orderBook(readerSupplier, bookThree);


    }
}
