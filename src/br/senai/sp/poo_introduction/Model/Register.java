package br.senai.sp.poo_introduction.Model;

import java.util.Scanner;

public class Register {
    /** Declara Boolean*/
    boolean flag = true;

    /** Instance Teacher */
    Teacher objTeacher = new Teacher();

    /** Instance Student */
    Student objStudent = new Student();

    /** Instance Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instance Output */
    Output objOutput = new Output();

    public void BothRegister() {
        flag = false;
        RegisterTeacher();
        RegisterStudent();
    }

    public void RegisterTeacher() {

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

        if (flag){
            objOutput.PrintTeacher(objTeacher);
        }

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

        if (flag){
            objOutput.PrintStudent(objStudent);
        }

    }

}
