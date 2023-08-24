package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {
    public void BothRegister() {
        RegisterTeacher();
        RegisterStudent();
    }

    Scanner teclado = new Scanner(System.in);

    public void RegisterTeacher() {
        /** Instance Teacher */
        Teacher objTeacher = new Teacher();

        /** Get informations */
        System.out.println("===========================================================");
        System.out.println("------------------ Welcome to the School ------------------");
        System.out.print("Hello Teacher, What's your name: ");
        objTeacher.name = teclado.next();
        System.out.print("How old are you? ");
        objTeacher.age = teclado.nextInt();
        System.out.print("What's your E-mail? ");
        objTeacher.email = teclado.next();
        System.out.print("What's your Phone Number? ");
        objTeacher.phoneNumber = teclado.nextLong();
        System.out.print("What's your specialist? ");
        objTeacher.specialist = teclado.next();

        /** Print informations */
        System.out.println("\nTeacher information:");
        System.out.println("Teacher´s Name is: " + objTeacher.name);
        System.out.println("Teacher´s Age is: " + objTeacher.age);
        System.out.println("Teacher´s E-mail is: " + objTeacher.email);
        System.out.println("Teacher´s Phone Number is: " + objTeacher.phoneNumber);
        System.out.println("Teacher´s Specialist is: " + objTeacher.specialist);
        System.out.println("===========================================================");
    }

    public void RegisterStudent() {
        /** Instance Student */
        Student objStudent = new Student();

        /** Get informations */
        System.out.println("\n===========================================================");
        System.out.println("------------------ Welcome to the School ------------------");
        System.out.print("Hello Student, What's your name: ");
        objStudent.name = teclado.next();
        System.out.print("How old are you? ");
        objStudent.age = teclado.nextInt();
        System.out.print("What's your Grade 1? ");
        objStudent.grade1 = teclado.nextInt();
        System.out.print("What's your Grade 2? ");
        objStudent.grade2 = teclado.nextInt();
        System.out.print("What's your Frequency? ");
        objStudent.frequency = teclado.nextInt();

        /** Print informations */
        System.out.println("\nStudent information:");
        System.out.println("Student´s Name is: " + objStudent.name);
        System.out.println("Student´s Age is: " + objStudent.age);
        System.out.println("Student´s Grade 1 is: " + objStudent.grade1);
        System.out.println("Student´s Grade 2 is: " + objStudent.grade2);
        System.out.println("Student´s Frequency is: " + objStudent.frequency);
        System.out.println("===========================================================");
    }

}
