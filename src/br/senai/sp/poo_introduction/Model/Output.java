package br.senai.sp.poo_introduction.Model;

public class Output {

    public void PrintTeacher(Teacher objTeacher) {

        /** Print informacoes */
        System.out.println("\nTeacher information:");
        System.out.println("Teacher´s Name is: " + objTeacher.name);
        System.out.println("Teacher´s Age is: " + objTeacher.age);
        System.out.println("Teacher´s E-mail is: " + objTeacher.email);
        System.out.println("Teacher´s Phone Number is: " + objTeacher.phoneNumber);
        System.out.println("Teacher´s Specialist is: " + objTeacher.specialist);
        System.out.println("===========================================================");
    }

    public void PrintStudent(Student objStudent) {

        /** Print informacoes */
        System.out.println("\nStudent information:");
        System.out.println("Student´s Name is: " + objStudent.name);
        System.out.println("Student´s Age is: " + objStudent.age);
        System.out.println("Student´s Grade 1 is: " + objStudent.grade1);
        System.out.println("Student´s Grade 2 is: " + objStudent.grade2);
        System.out.println("Student´s Frequency is: " + objStudent.frequency);
        System.out.println("===========================================================");
    }

}