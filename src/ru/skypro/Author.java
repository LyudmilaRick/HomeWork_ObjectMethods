package ru.skypro;

import java.util.Objects;

public class Author {
    private  final String firstName;
    private  final String lastName;

    public Author(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName  = lastName;
    }
    public String getFullName() {
        return  getFirstName() +" "+ getLastName();
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        //return "Author{" +
        //        "firstName='" + firstName + '\'' +
        //        ", lastName='" + lastName + '\'' +
        //        '}';
        return firstName + '\''+ lastName;
    }

    @Override
    public boolean equals(Object next) {
        if (this == next) return true;
        if (next == null || getClass() != next.getClass()) return false;
        Author author = (Author) next;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
