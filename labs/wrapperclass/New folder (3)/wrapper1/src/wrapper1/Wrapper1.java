/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wrapper1;

import java.util.StringTokenizer;


public class Wrapper1 {
     public static boolean checkBoth(String id, String pass) {
        return vlidateId(id) && validatePassword(pass);
    }

   static boolean vlidateId(String id) {
        char[] list = new char[id.length()];
        list = id.toCharArray();
        if (id.endsWith("helwan.edu.eg")) {
            if (Character.isLetter(list[0])) {
                StringTokenizer dd = new StringTokenizer(id, "@");
                String temp = dd.nextToken();
                if (temp.length() < 12) {
                    return true;
                }

            }

        }
        return false;
    }

   static boolean  validatePassword(String pass) {
        boolean checkl = false, checku = false, checkd = false;
        char[] list = new char[pass.length()];
        list = pass.toCharArray();
        if (pass.length() >= 6) {
            for (int i = 0; i < list.length; i++) {
                if (Character.isDigit(list[i]) == true) {
                    checkd = true;
                }
                if (Character.isLowerCase(list[i]) == true) {
                    checkl = true;
                }
                if (Character.isUpperCase(list[i]) == true) {
                    checku = true;
                }
            }
      if(checkd==true &&checkl==true&&checku==true){
      
      }
        }

        return false;
    }

    

}
