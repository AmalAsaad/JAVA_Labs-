/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper3;
import java.util.Random;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;



/**
 *
 * @author Essraa
 */
public class test extends Analyzable {
    int [] arr= new int [100];

    public test( int n) {
        Random r = new Random();
        for(int i =0;i<100;i++){
        arr[i] =r.nextInt(n);
        
        }
    }
     public void save( String  file){ try{
      PrintWriter p =new PrintWriter(new FileWriter(file));
        p.println("Average  = " + getAvareage());
        p.println("Lowest  = " + getLowest());
        p.println("Highest  = " + getHighest());
            System.out.println("Average  = " + getAvareage());
        System.out.println("Lowest  = " + getLowest());
        System.out.println("Highest  = " + getHighest());
           p.close();
    
    }
    catch(IOException  e){
        System.out.println("Error");
    
    }
    
    
    }
    @Override
    public float getAvareage(){
    float sum=0;
      for (int a : arr) {
            sum+=a;
        }
        return sum/arr.length;
    
    }
    @Override
    public int getHighest(){
    int n =arr[0];
    for(int a:arr){
    if(n<a)
        n=a;
    }
    
    return n;
    }
    @Override
    public int getLowest(){

    
      int m=arr[0];
    for(int a:arr){
    if(m>a)
        m=a;
    }
    
    return  m;}
}
