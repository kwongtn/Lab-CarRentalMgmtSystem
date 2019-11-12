package view;
import java.util.Scanner;

public class CarRentalManagementSystem extends View{
    public void displayOptions(){
        System.out.println("Welcome to Car Rental Management System");
        System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET");
        System.out.println("1 \t Manage Cars");
        System.out.println("2 \t Manage Customers");
        System.out.println("3 \t Manage Rentals");
        System.out.println("0 \t Exit");
    }

    public void processOption(Scanner scanner, int choice) {
        switch (choice) {
            case 1: {
                CarView cv = new CarView();
                cv.displayOptions();
                cv.selectOption(scanner, 9); // I use '0' as escape character

                displayOptions();
                break;

            } case 2: {
                System.out.println("You've selected: Manage Customers");
                break;

            } case 3: {
                System.out.println("You're selected: Manage Rentals");
                break;
            }
        }
    }
    
    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        CarRentalManagementSystem crms = new CarRentalManagementSystem();

        crms.displayOptions();
        crms.selectOption(scanner, 3); // I use '0' as escape character
    }
}