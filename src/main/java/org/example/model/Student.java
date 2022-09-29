package org.example.model;

public class Student {
    public boolean morningGrouch; // true oder false
    private Boolean usesHeadphones; //true oder false & NULL als Objekt der Klasse boolean
    public int lazinessLevel = 10; //von 1 -10 max Faulheit
    public String nickname;
    //Konstruktor
    public Student(){
        System.out.println("Ich bin ein Konstruktor");
    }
    //Aufgabe 2
    //Schreibe ein eMethode toString() welche alle Eigenschaften zurückgibt
    public String toString(){
        return morningGrouch + "\n" + usesHeadphones +"\n" + lazinessLevel +"\n" + nickname +"\n";
    }

    public Boolean getUsesHeadphones(){
        return usesHeadphones;
    }

    public void setUsesHeadphones(boolean b){
        this.usesHeadphones = b;
    }


}
