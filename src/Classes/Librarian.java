package Classes;

import Interfaces.Supplier;

public class Librarian extends User implements Interfaces.Librarian {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Библиотекарь " + this + " заказал книгу " + book + " у поставщика: " + supplier + ".\n");
    }
}
