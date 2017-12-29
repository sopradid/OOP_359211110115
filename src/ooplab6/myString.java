package ooplab6;

public class myString {
    public static void main(String[]args){
        char[] c = {'H','e','l','l','o'};
        String strl =new String(c);
          System.out.println(strl);

          String str2 = "Monjira Sopardid";
          System.out.println(str2);

          String srr3 = new String("RMUTSV");
          ///concatenation String
        //type (+)
        String str4 = strl +" "+ str2;
        System.out.println(str4);
        //type (conoat() method)
        String str5= strl. concat(" "+srr3);
        System.out.println(str5);

        //string size
        int length = str4.length();
        System.out.println(length);
        System.out.println(str5.length());

        //String method
        System.out.println(str5.toLowerCase());
        System.out.println(str5.toUpperCase());
        System.out.println(str5.replace('1','s'));
        System.out.println(str5.indexOf('V'));
        ///trim()
        String str6 = " Hello";
        System.out.println(str6.length());
        System.out.println("*"+str6+"*");
        System.out.println("*"+str6.trim()+"*");
    }//main
}///cless
