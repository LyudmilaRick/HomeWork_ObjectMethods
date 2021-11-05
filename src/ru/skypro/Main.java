package ru.skypro;

public class Main {

    public static void main(String[] args) {
        Author nameAuthor1 = new Author("Дональд", "Кнут");
        Author nameAuthor2 = new Author("Дональд", "Кнут");
        Author nameAuthor3 = new Author("Брюс", "Шнайдер");
        Book firstBook  = new Book("Искусство программирования", nameAuthor1, 2000);
        Book secondBook = new Book("Искусство программирования", nameAuthor2, 2002);
        Book thirdBook  = new Book("Искусство программирования том3", nameAuthor1, 2000);
        Book fourthBook = new Book("Прикладная криптография", nameAuthor3, 2002);
        // ru.skypro.Book@7229724f - result ot System.out.println
        System.out.println("==============================");
        System.out.println("Лучшие авторы. Тройка лидеров :");
        System.out.println(nameAuthor1);
        System.out.println(nameAuthor2);
        System.out.println(nameAuthor3);
        System.out.println("Проверка equal: " + nameAuthor1.equals(nameAuthor2));
        System.out.println("Проверка equal by hashCode: " + (nameAuthor1.hashCode() == nameAuthor2.hashCode()));
        System.out.println("Проверка equal: " + nameAuthor1.equals(nameAuthor3));
        System.out.println("Проверка equal by hashCode: " + (nameAuthor1.hashCode() == nameAuthor3.hashCode()));
        System.out.println("==============================");
        System.out.println("Лучшие книги по программированию:");
        System.out.println(firstBook);
        System.out.println(secondBook);
        System.out.println(thirdBook);
        System.out.println("Проверка equal: " + firstBook.equals(secondBook));
        System.out.println("Проверка equal by hashCode: " + (firstBook.hashCode() == secondBook.hashCode()));
        System.out.println("Проверка equal: " + firstBook.equals(thirdBook));
        System.out.println("Проверка equal by hashCode: " + (firstBook.hashCode() == thirdBook.hashCode()));
        // Добавить книги в библиотеку
        System.out.println("==============================");
        Library libraryMe = new Library(25);
        libraryMe.addNewBook(firstBook);
        libraryMe.addNewBook(secondBook);
        libraryMe.addNewBook(thirdBook);
        libraryMe.addNewBook(fourthBook);
        // ru.skypro.Library@4e50df2e - from default method
        System.out.println("Каталог :");
        System.out.println(libraryMe);
    }
}
