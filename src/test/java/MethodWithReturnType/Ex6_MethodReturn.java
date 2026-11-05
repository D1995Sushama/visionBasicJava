package MethodWithReturnType;

public class Ex6_MethodReturn {
    public static int age(int a){
       int agecriteria =a;
        return agecriteria;
    }
    public String friName(String name){
        String s1= name;
        return s1;
    }
    public char bloodg(char g){
        char bloodgroup=g;
        return bloodgroup;
    }

    static void main(String[] args) {
        int s1=age(30);
        System.out.println(s1);
        System.out.println(age(30));
        System.out.println("----------------------");
        Ex6_MethodReturn s2=new Ex6_MethodReturn();
        String s3= s2.friName("Niku");
        System.out.println(s3);
        System.out.println(s2.friName("Niku"));
        System.out.println("-----------------");
        char s4=s2.bloodg('o');
        System.out.println(s4);
        System.out.println(s2.bloodg('o'));


    }
}
