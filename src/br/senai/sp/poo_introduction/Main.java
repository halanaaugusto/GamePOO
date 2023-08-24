package br.senai.sp.poo_introduction;

import br.senai.sp.poo_introduction.Model.Register;
import br.senai.sp.poo_introduction.Model.Student;
import br.senai.sp.poo_introduction.Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;

        /** Instance Register */





        /** Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------- Welcome to the System School --------------------");
        System.out.println("Do you want to search teacher or student? [1- Teacher, 2- Student, 3- Ambos]: ");
        choice = teclado.nextInt();

        if (choice==1){
            Register teacher = new Register();
            teacher.RegisterTeacher();
        } else if (choice==2){
            Register student = new Register();
            student.RegisterStudent();
        } else if (choice==3){
            Register Both = new Register();
            Both.BothRegister();
        }


    }
}
