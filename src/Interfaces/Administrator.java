package Interfaces;

import Classes.Book;

public interface Administrator {
    void overdueNotification(Reader reader, Book book);

    void takeBook(Reader reader, Book book);
}
