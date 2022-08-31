/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Library {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variable untuk mengondisikan apakah program masih jalam atau berhenti
        boolean stay = true;
        //inputan user
        Scanner input = new Scanner(System.in);

        //array list siswa, petugas, buku (object yang berisi list)
        StudentList studentLists = new StudentList();
        Report report = new Report();
        LibrarianList librarianLists = new LibrarianList();
        BookList bookLists = new BookList();

        ArrayList<BookLending> bookLendingLists = new ArrayList<>();

        OUTER:
        while (stay) { //selama "stay" program akan terus berjalan menampilkan tampilan menu
            //tampilan menu
            System.out.println("1. Student List");
            System.out.println("2. Librarian List");
            System.out.println("3. Book List");
            System.out.println("4. Book Lending");
            System.out.println("5. Book Return");
            System.out.println("6. Exit");
            System.out.println("pilih menu");

            int option = input.nextInt();
            switch (option) {
                case 1 -> // (1) akan menampilan student list
                    //studentLists.studentOutput();
                    report.getReport(studentLists.list, "x");
                case 2 -> // (2) akan menampilkan librarian list
                    //librarianLists.librarianOutput();
                    report.getReport(librarianLists.list);
                case 3 -> // (3) akan menampilkan book list
                    //bookLists.bookOutput();
                    report.getReport(bookLists.list, 0);
                case 4 -> { // (4) untuk meminjam buku
                    System.out.println("Student ID: ");
                    int selectedStudentId = input.nextInt();
                    Student selectedStudent = studentLists.findStudent(selectedStudentId);
                    if (selectedStudent != null) {
                        //jika ditemukan siswa berdasarkan id yang dimaksukkan
                        if (selectedStudent.getStatus()) {
                            //jika siswa aktif
                            System.out.println("Masukkan jumlah buku yang akan dipinjam");
                            int bookAmount = input.nextInt();

                            //loop sejumlah buku yang dipinjam
                            for (int i = 0; i < bookAmount; i++) {
                                System.out.println("Masukkan id buku ke-" + (i + 1));
                                int selectedBookId = input.nextInt();
                                Book selectedBook = bookLists.findBook(selectedBookId);
                                if (selectedBook != null) {
                                    //jika ditemukan berdasarkan id buku

                                    //masukkan ke daftar peminjaman
                                    bookLendingLists.add(new BookLending(selectedStudent, selectedBook, 1));

                                    //mengurangi stock
                                    bookLists.stockReducing(selectedBookId);
                                }
                            }

                            //disable status student
                            studentLists.disableStudent(selectedStudentId);

                            //Output BookLendingList
                            System.out.println("--- Record List ---");
                            System.out.println("Book Tittle\t \tBorrower");
                            System.out.println("");
                            for (int i = 0; i < bookLendingLists.size(); i++) {
                                System.out.println(bookLendingLists.get(i).getSelectedBook().getBookName() + "\t \t" + bookLendingLists.get(i).getSelectedStudent().getStudentName());
                                System.out.println("----------------------------------");
                            }
                        } else {
                            //jika status siswa tidak aktif
                            System.out.println("You doesn't allowed to borrow any book");
                        }
                    } else {
                        //jika tidak ditemukan siswa berdasarkan id yang dimasukkan
                        System.out.println("Id not found");
                    }
                }
                case 5 -> {
                    System.out.println("Student ID: ");
                    int selectedStudentId = input.nextInt();
                    Student selectedStudent = studentLists.findStudent(selectedStudentId);
                    if (selectedStudent != null) {
                        //jika ditemukan siswa berdasarkan id yang dimaksukkan
                        if (selectedStudent.getStatus()) {
                            //jika siswa aktif
                            System.out.println("Tidak ada buku yang perlu dikembalikan");
                            
                        } else {
                            //jika status siswa tidak aktif
                            System.out.println("Masukkan jumlah yang buku dipinjam");
                            int bookAmount = input.nextInt();

                            //loop buku yang dipinjam
                            for (int i = 0; i < bookAmount; i++) {
                                System.out.println("Masukkan id buku ke-" + (i + 1));
                                int selectedBookId = input.nextInt();
                                Book selectedBook = bookLists.findBook(selectedBookId);
                                if (selectedBook != null) {
                                    //jika ditemukan berdasarkan id buku

                                    //masukkan ke daftar peminjaman
                                    bookLendingLists.add(new BookLending(selectedStudent, selectedBook, 1));

                                    //menambah stock
                                    bookLists.stockReturn(selectedBookId);
                                }
                            }
                            
                            //enable status student 
                            studentLists.enableStudent(selectedStudentId);
                            
                            //Output Record Student
                            System.out.println("--- Your record List ---");
                            System.out.println("Book Tittle\t \tBorrower");
                            System.out.println("");
                            for (int i = 0; i < bookLendingLists.size(); i++) {
                                System.out.println(bookLendingLists.get(i).getSelectedBook().getBookName() + "\t \t" + bookLendingLists.get(i).getSelectedStudent().getStudentName());
                                System.out.println("----------------------------------");
                            }
                        }
                    } else {
                        //jika tidak ditemukan siswa berdasarkan id yang dimasukkan
                        System.out.println("Id not found");
                    }
                }
                case 6 -> { //(6) akan menghentikan program
                    break OUTER;
                }
                default -> {
                }
            }
        }
    }

}
