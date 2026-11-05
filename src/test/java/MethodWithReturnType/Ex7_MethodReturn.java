package MethodWithReturnType;

public class Ex7_MethodReturn {
    public static String Stdname(String name ){
         name=name .toUpperCase();
        return name;
    }
    public String dob(String DOB){
        return DOB;
    }
    public static int hight(int h){
        return h;
    }
    public static int weight(int w){
        return w;
    }

    static void main(String[] args) {
        Ex7_MethodReturn s1=new Ex7_MethodReturn();
        String s2=s1.dob("14 Aug 1995");
        System.out.println(s2);
        System.out.println(s1.dob("14 Aug 1995"));
        System.out.println("----------------");
        String s3= Stdname("Nandkishor Ghongate");
        System.out.println(s3);
        System.out.println(Stdname("Nandkishor Ghongate"));
        System.out.println("-----------------------");
        int s5=weight(60);
        System.out.println(s5);
        System.out.println(weight(60));
    }
}
