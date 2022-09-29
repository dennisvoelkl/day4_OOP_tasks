package org.example;
import org.example.model.Student;

public class Main {
    public static void main(String[] args) {

        Student chris = new Student();
        Student tobias = new Student();
        Student dennis = new Student();

        chris.nickname = "chris_yooo";
        dennis.nickname = "feivel";
        tobias.nickname = "TOlA09";

        chris.lazinessLevel = 8;
        dennis.lazinessLevel = 5;

        System.out.println("Chris:\s" + chris.lazinessLevel + "\nTobi: " + tobias.lazinessLevel + "\nDennis: " + dennis.lazinessLevel);
        //Hier muss als Ausgabe NICHT Student stehen, sondern das Objekt
        System.out.println(chris);
        System.out.println(dennis);

        System.out.println("Ausgabe ohne set: " + dennis.getUsesHeadphones());
        //System.out.println();
        dennis.setUsesHeadphones(false);
        System.out.println("Ausgabe mit set: " + dennis.getUsesHeadphones());


    }
}