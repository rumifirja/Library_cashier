/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

/**
 *
 * @author user
 */
public class BookLending {
    private Student selectedStudent;
    private Book selectedBook;
    private final int amount;
    
    //implementasi enkapsulasi 
    public Student getSelectedStudent(){
        return selectedStudent;
    }
    
    public void setSelectedStudent(Student selectedStudent){
        this.selectedStudent=selectedStudent;
    }
    
    public Book getSelectedBook(){
        return selectedBook;
    }
    
    public void setSelectedBook(Book selectedBook){
        this.selectedBook=selectedBook;
    }
    
    public int getAmount(){
        return amount;
    }
    
    public BookLending(Student selectedStudent, Book selectedBook, int amount){
        this.selectedStudent=selectedStudent;
        this.selectedBook=selectedBook;
        this.amount=amount;
    }
}
