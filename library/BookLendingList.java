/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
/**
 *
 * @author user
 */
public class BookLendingList {
    
    public ArrayList<BookLending>list;
    
    public BookLendingList(){
        list = new ArrayList<>();
    }
    
    public void addBookLending(Student student, Book book, int amount){ //memberikann nilai atau inisiasi data ist
        list.add(new BookLending(student, book, amount));
    }
    
    //method output bookLending
    public void bookLendingOutput(){
        System.out.println("Borrower: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getSelectedStudent().getStudentName() + "\t"
                    + list.get(i).getSelectedBook().getBookName() + "\t"
                    + list.get(i).getAmount());
            System.out.println("-------------------------------------");
        }
    }
}

// public = enkapsulasi 
// setelah public void adalah method 