import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        
        System.out.println("-----------------------------------");
        System.out.println("|------- Matrix Operations -------|");
        System.out.println("-----------------------------------");

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("\n-------- Main Menu --------");

            System.out.println("\n1. Matrix Addition");
            System.out.println("0. Exit");

            System.out.print("\n_ : ");
            String choice = scan.next();

            int choice_int = 0;
            
            try {

                choice_int = Integer.parseInt(choice);
                
            } catch (NumberFormatException e) {

                System.out.println("\nPLease Enter Integer Number");

            }

            if (choice_int == 1){
                System.out.println("\n\nMatrix Addition");
            }

            else if(choice_int == 0){
                System.out.println("\nProgram Exited -");
                break;
            }

            else{
                System.out.println("\nInvalid Input");
            }
        }
    }
}

class Matrix{

}