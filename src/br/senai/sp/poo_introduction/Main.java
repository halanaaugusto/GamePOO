package br.senai.sp.poo_introduction;

import br.senai.sp.poo_introduction.Model.Register;
import br.senai.sp.poo_introduction.Model.Student;
import br.senai.sp.poo_introduction.Model.Teacher;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice;

        /** Instance Scanner */
        Scanner teclado = new Scanner(System.in);

        System.out.println("-------------------- Welcome to the System School --------------------");
        System.out.print("Do you want to search teacher or student? [1- Teacher, 2- Student, 3- Ambos]: ");
        choice = teclado.nextInt();

        Register objRegister = new Register();

        if (choice==1){
           objRegister.RegisterTeacher();
        } else if (choice==2){
            objRegister.RegisterStudent();
        } else if (choice==3){
            objRegister.BothRegister();
        } else {
            System.out.println("Opção inválida");
        }


    }
}
