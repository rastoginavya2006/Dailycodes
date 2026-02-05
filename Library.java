// A university library maintains records of books and their borrowers (students and professors). The library is managed by a Librarian.
// Design a Java program using OOP principles with the following requirements:
// lasses to Create:
// 1.	Book
// o	Fields: bookId, title, author, isIssued
// o	Methods:
// 	issueBook()
// 	returnBook()
// 	displayBookInfo()
// 2.	Person (Base Class)
// o	Fields: personId, name
// o	Methods: displayInfo()
// 3.	Student (inherits from Person)
// o	Fields: courseName, rollNo
// o	Can borrow up to 3 books
// 4.	Professor (inherits from Person)
// o	Fields: departmentName
// o	Can borrow up to 5 books
// 5.	Librarian
// o	Fields: name
// o	Methods:
// 	issueBook(Book b, Person p)
// 	returnBook(Book b, Person p)
// 6.	Library (composition)
// o	Has a list of books
// o	Has a list of registered members (students/professors)


import java.util.*;
class Book{
    int BookId;
    String Title;
    String author;
    Boolean isIssued;
    Book(int BookId,String Title,String author){
        this.author=author;
        this.BookId=BookId;
        this.Title=Title;
    }

}
class Person{
    int personId;
    String name;
    Person(int personId,String name){
        this.name=name;
        this.personId=personId;
    }
    void displayInfo(){
        System.out.println(personId+" : "+name);
    }
}
class Student extends Person{
    static count =0;
    String CourseName;
    int rollNo;
    Student(int personId,String name,String CourseName,int rollNo){
        count++;
        if(count>3){
            System.out.println("Limit exceed");
        }
        else{
        super(personId, CourseName);
        this.CourseName=CourseName;
        this.rollNo=rollNo;
        }
    }


}
class 
public class Library{
    public static void main(String[] args) {
        
    }
}