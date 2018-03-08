package warppersheetno2;

import java.util.Random;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Warppersheetno2 {

    public static void main(String[] args) {
        int count = 0;
        int num, rand;

        Scanner scan = new Scanner(System.in);
        Random r = new Random();
        rand = r.nextInt(100);
      
        System.out.println("enter username");
        String name = scan.nextLine();
         System.out.println(rand);
        
       
           do {
            count++;
           System.out.println("please enter a number");
        num = scan.nextInt();
            if (num > rand) {
                System.out.println("Your guess is too high!");
            } else if( num < rand) {
                System.out.println("Your guess is too low!");
            } else {
                System.out.println("You got it!");
            }
        }
        while (num != rand);
        FileWriter fw = null;
        PrintWriter pw = null;
        try {

            fw = new FileWriter("REPORT.txt");
            pw = new PrintWriter(fw);
            pw.println("the username is \n" + name  + "\n the number of attempts \n" + count);
            pw.close();

        } catch (IOException e) {
        } 

    }
}
