package MethodWithReturnType;

public class Ex4_MethodReturn {
    public int add(int a,int b){
        int add=a+b;
        return add;
    }
    public static int mul(int a,int b){
        int mul=a*b;
        return mul;
    }

    static void main(String[] args) {
        Ex4_MethodReturn s1=new Ex4_MethodReturn();
        int s3= s1.add(20,20);
        System.out.println(s3);
        System.out.println(s1.add(20,20));
        System.out.println("---------------");
        int s2=mul(10,10);
        System.out.println(s2);
        System.out.println(mul(10,10));


    }
}
