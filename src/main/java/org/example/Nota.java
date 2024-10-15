package org.example;

public class Nota {
    private int numAluno;
    private double mark;
    public Nota(int numAluno,double mark){
        this.numAluno=numAluno;
        this.mark=mark;
    }

    public int getNumAluno() {
        return numAluno;
    }

    public double getMark() {
        return mark;
    }
}
