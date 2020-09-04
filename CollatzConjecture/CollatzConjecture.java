package CollatzConjecture;

import java.util.Scanner;

public class CollatzConjecture {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n=0;
        int i=0;

        System.out.println("\nCollatz Conjecture calculator - Orlando Autiero\n");
        System.out.print("Input --> ");
        n=in.nextInt(); 
        in.close();
        System.out.println();

        while(n>1) {
            i++;
            System.out.println("Step: " +n);
            if(n%2==0) n/=2;
            else n=(n*3)+1;
        }

        System.out.println("\nNumber of steps: " +i);

    }

}