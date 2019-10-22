package view;

import java.util.Scanner;

public class CarView extends View{

    public void displayOptions(){
        System.out.println("Manage Cars");
        System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET");
        System.out.println("1 \t Add Car");
        System.out.println("2 \t Update Car");
        System.out.println("3 \t Delete Car");
        System.out.println("4 \t Display All Cars");
        System.out.println("5 \t Display cars by maximum price");
        System.out.println("6 \t Display cars by minimum capacity");
        System.out.println("7 \t Display cars by transmission");
        System.out.println("8 \t Display cars by model");
        System.out.println("9 \t Display cars by single car");
        System.out.println("0 \t Back to main menu");   
    }

    public void processOption(Scanner scanner, int choice){
        
    }
}