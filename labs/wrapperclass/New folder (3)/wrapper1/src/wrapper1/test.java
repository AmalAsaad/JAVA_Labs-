/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper1;

import java.util.Scanner;
public class test {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
     System.out.println("Enter a user name");
       String id = s.nextLine();
       System.out.println("Enter a Password");
        String pass = s.nextLine();
      
       if(Wrapper1.checkBoth(id, pass)){
           System.out.println("Correct");
        }
       else{
           System.out.println("In correct");
       }
        
}
}