package org.example;

import java.util.ArrayList;

public class UC {
    private String nameUC;
    private ArrayList<Nota> marks;
    private int totalStudents=0;

    public UC(String nameUC) {
        this.nameUC = nameUC;
    }
    public void insertMarkUC(int numStudent,double mark){
        this.totalStudents++;
        this.marks.add(new Nota(numStudent,mark));
    }
    public double searchStudent(int numStudent){
       for(Nota nota : marks ){
           if(nota.getNumAluno()==numStudent){
               return nota.getMark();
           }else {
               return -1;
           }
       }
        return -1;
    }
    public double averageUC(){
        double sum=0;
        for(Nota nota : marks){
            sum+= nota.getMark();
        }
        return sum;
    }
    public boolean isApproved(int numStudent){
        if(searchStudent(numStudent)>=9.5){
           return true;
        }else {
            return false;
        }
    }

}
