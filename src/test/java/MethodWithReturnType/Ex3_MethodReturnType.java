package MethodWithReturnType;

public class Ex3_MethodReturnType {
    public static int add(int num1,int num2){
        int add=num1+num2;
        return add;
    }
    public static String Name(String name){
        name= name.toUpperCase();
        return name;
    }

    static void main(String[] args) {
        int s1=add(10,12);
        System.out.println(s1);
        System.out.println(add(10,12));
        System.out.println("---------");
        String s2= Name("Sushama");
        System.out.println(s2);
        System.out.println(Name("Sushama"));
    }
}
