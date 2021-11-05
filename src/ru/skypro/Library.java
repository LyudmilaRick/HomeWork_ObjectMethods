package ru.skypro;
import java.util.Arrays;

public class Library {
    private final Book[] bookArray;


    public Library(int sizeArray) {
        this.bookArray = new Book[sizeArray];
    }
    @Override
    public String toString() {
        //return "Library{" +
        //        "bookArray=" + Arrays.toString(bookArray) +
        //        '}';
        StringBuilder sbResult = new StringBuilder();
        for (int i = 0; i < bookArray.length; ++i) {
            if(bookArray[i] == null){
                break;
            }
            sbResult.append(bookArray[i].toString() + "\n");
        }
        return sbResult.toString();
    }
    public void addNewBook(Book book) {
        // найти первую пустую ячейку
        int freePosition = findFreePosition(bookArray);
        if (freePosition == -1) {
            throw new RuntimeException("Для новых книг не осталось места");
        }
        // Добавить книгу
        bookArray[freePosition] = book;
    }

    public int findFreePosition(Book[] array) {
        // найти первую пустую ячейку
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return i;
            }
        }
        return -1;
    }

    public void printBookDetail(String bookName) {
        // 4.a Напечатать информацию о книге по ее названию, которое приходит в метод в качестве параметра.
        //  4.a.1 найти книгу в библиотеке
        Book book = findBook(bookName);
        //  4.a.2 Напечатать
        printMyBook(book);
    }

    public void changeBookYear(String nameBook, int year) {
        // 5.a Изменить год публикации книги по ее названию.
        //  4.a.1 найти книгу в библиотеке
        Book book = findBook(nameBook);
        //  5.a.2 Изменить год
        changeYear(book, year);
    }

    private Book findBook(String name) {
        for (int i = 0; i < bookArray.length; i++) {
            if (bookArray[i].getBookName().equals(name)) {
                return bookArray[i];
            }
        }
        return null;
    }

    private void printMyBook(Book card) {
        System.out.print(card.getBookName() + " by ");
        System.out.print(card.getAuthor().getFullName() + " was published in ");
        System.out.println(card.getPublicationYear());
    }

    private void changeYear(Book book, int year) {
        book.setPublicationYear(year);
    }
}
