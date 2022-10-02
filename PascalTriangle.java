package Projects;

import java.util.Scanner;

public class PascalTriangle {

   static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please Enter number of lines");
        int n = scanner.nextInt(), r, j;

        for(int i = 0; i< n; i++){

            for (int k = 0; k <= i-1; k++){
                System.out.println(" ");

            }
            for (int y = 0; y <= i; y++){
                System.out.println(formula(i, y)+ " ");
            }


        }
        System.out.println();





    }

    static int  factorial(int n){
        int f;

        for(f = 1; n>1; n--){
            f*=n;
        }
        return f;
    }

     static int formula(int n, int r){

         return factorial(n) / (factorial(n - r) * factorial(r));


    }





}

