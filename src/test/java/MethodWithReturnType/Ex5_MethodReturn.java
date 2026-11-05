package MethodWithReturnType;

public class Ex5_MethodReturn {
    public static String friname(String s1){
         String friendname = s1.toUpperCase();
         //s1=s1.toLowerCase();
        return friendname;
    }
    public static String family(String s2){
      String family =s2.toUpperCase();
        //s2=s2.toLowerCase();
        return family ;
    }
    public int fammem(int a){
       int familymember =a;
        return familymember;
    }

    static void main(String[] args) {
        String s1=friname("Nanadkishor");
        System.out.println(s1);
        System.out.println(friname("Nandkishor"));
        System.out.println("----------");
        String s2=family("Deshmukh");
        System.out.println(s2);
        System.out.println(family("Deshmukh"));
        System.out.println("-----------");
        Ex5_MethodReturn s3=new Ex5_MethodReturn();
       int s4= s3.fammem(5);
       System.out.println(s4);
        System.out.println(s3.fammem(5));

    }
}
