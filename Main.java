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

    static Scanner scan = new Scanner(System.in);

    public int[][] createMatrix(int row_count,int col_count){
        return new int[row_count][col_count];
    }

    public int[][] fillMatrix(int[][] matrix){

        int noRows = matrix.length;
        int noCols = matrix[0].length;

        for(int i = 0;i<noRows;i++){
            for(int j=0;i<noCols;j++){
                System.out.println("\nEnter Element For Index matrix[" + i + "][" + j + "] : ");
                int element = scan.nextInt();
                matrix[i][j] = element;
            }
        }

        return matrix;
    }
}