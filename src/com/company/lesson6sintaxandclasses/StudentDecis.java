package com.company.lesson6sintaxandclasses;

public class StudentDecis {
    public StudentDecis(String numeAtribuit, int idnpAtribuit){
        nume = numeAtribuit;
        this.idnp = idnpAtribuit;
    }

    int idnp;
    String nume;
    boolean dornicSaInvete;

    public void faceTemaPentruAcasa(){
        System.out.println( nume +" are rezultate");
        this.dornicSaInvete = true;
    }
}
