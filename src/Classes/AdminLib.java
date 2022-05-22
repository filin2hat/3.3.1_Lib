package Classes;

import Interfaces.Administrator;
import Interfaces.Librarian;
import Interfaces.Reader;
import Interfaces.Supplier;

public class AdminLib extends User implements Administrator, Librarian {
    public AdminLib(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader, Book book) {
        System.out.println("Администратор " + this + " предупредил " + reader + " о просрочке взятой книги: " + book + ".\n");
    }

    @Override
    public void takeBook(Reader reader, Book book) {
        System.out.println("Библиотекарь " + this + " выдал книгу " + book + " читателю: " + reader + ".\n");
    }

    @Override
    public void orderBook(Supplier supplier, Book book) {
        System.out.println("Библиотекарь " + this + " заказал книгу " + book + " у поставщика: " + supplier + ".\n");
    }

}
