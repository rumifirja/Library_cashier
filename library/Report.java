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
public class Report {

    public void getReport(ArrayList<Student> list, String x) {
        
        System.out.println("--- Students ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getStudentId() + "\t"
                    + list.get(i).getStudentName() + "\t"
                    + list.get(i).getAddress() + "\t"
                    + list.get(i).getPhoneNumber() + "\t"
                    + list.get(i).getStatus());
            System.out.println("-----------------------------------------------");
        }
         
    }
     
     public void getReport(ArrayList<Book> list, int x) {
         
        System.out.println("--- Book List ---");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getBookId() + "\t"
                    + list.get(i).getBookName() + "\t\t"
                    + list.get(i).getBookPrice() + "\t"
                    + list.get(i).getBookStock());
            System.out.println("-------------------------------------");
        }
    }
     
     public void getReport(ArrayList<Librarian> list) {
         
        System.out.println("--- Librarians ----");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getLibrarianId() + "\t"
                    + list.get(i).getLibrarianName() + "\t"
                    + list.get(i).getAddress() + "\t"
                    + list.get(i).getPhoneNumber());
            System.out.println("------------------------------");
        }
    }
}
