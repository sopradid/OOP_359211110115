package ooplab6;

import java.util.StringTokenizer;

public class myStrToken {
    public static void main(String[] args) {
 //       StringTokenizer
        String msg = "Hello Welcome MT RMUTSV 2017";
        StringTokenizer myToken = new StringTokenizer(msg);
        //countTokens()
        System.out.println(myToken.countTokens());
    }//main
}//class
