package MethodWithReturnType;

public class Ex1_MethodReturnType {//void->return type ->return nothing
    public static int add(int a,int b) {
        int addValue = (a + b);
        return addValue;
    }
    public int sub(int a,int b){
        int subValue=(a-b);
        return subValue;
    }
    public static void main(String[] args) {
        int n3=add(12,13);
        System.out.println(n3);
        System.out.println(n3*n3);
        System.out.println(add(12,55));
        System.out.println("-------------");
        Ex1_MethodReturnType s1=new Ex1_MethodReturnType();
                 int n4=s1.sub(6,5);
        System.out.println(n4);
        System.out.println(n4*n4);
        System.out.println(s1.sub(12,6));
    }
}
