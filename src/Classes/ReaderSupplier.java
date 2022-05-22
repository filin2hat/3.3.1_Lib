package Classes;

import Interfaces.Librarian;
import Interfaces.Reader;
import Interfaces.Supplier;

public class ReaderSupplier extends User implements Reader, Supplier {
    public ReaderSupplier(String name) {
        super(name);
    }

    @Override
    public void returnBook(Librarian librarian, Book book) {
        System.out.println("Читатель " + this + " вернул книгу " + book + " " + librarian + ".\n");
    }

    @Override
    public void giveBook(Librarian librarian, Book book) {
        System.out.println("Поставщик " + this + " принес книгу " + book + " " + " для библиотеки.\n");
    }
}
