
public class CarRentalManagementSystem{
    public static void main(String args[]){
        System.out.println("Welcome to Car Rental Management System");
        System.out.println("YEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEET");
        System.out.println("1 \t Manage Cars");
        System.out.println("2 \t Manage Customers");
        System.out.println("3 \t Manage Rentals");
        System.out.println("0 \t Exit");

        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            choice = -1;
            while (choice < 0 || choice > 3){
                System.out.print("Please enter an option: ");
                choice = scanner.nextInt();

                if(choice < 0 || choice > 3){
                    System.out.println("Invalid option, please try again.");
                }
            }

            switch (choice) {
                case 1: {
                    System.out.println("You've selected: Manage Cars");
                    break;
                }

                case 2 : {
                    System.out.println("You've selected: Manage Customers");
                    break;
                }

                case 3 : {
                    System.out.println("You're selected: Manage Rentals");
                    break;
                }
            }


        } while (choice != 4);
    }
}