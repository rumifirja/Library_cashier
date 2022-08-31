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
public class StudentList {

    public ArrayList<Student> list;

    public StudentList() {
        list = new ArrayList<>(); //inisiasi data list (memberi nilaii pada array)
        list.add(new Student("Camelia", "Tulung Agung", "0813", true, 01));
        list.add(new Student("Khansa", "Tulung Agung", "0851", true, 02));
    }

    
    //mencari student berdasarkan id
    public Student findStudent(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getStudentId()==id){
                return list.get(i);
            }
        }
        return null;
    }
    
    //disable status peminjaman student
    public void disableStudent(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getStudentId()==id){
                list.get(i).setStatus(false);
            }
        }
    }
    
    //enable status peminjaman student
    public void enableStudent(int id){
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getStudentId()==id){
                list.get(i).setStatus(true);
            }
        }
    }
}
