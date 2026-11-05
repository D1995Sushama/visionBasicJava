package MethodWithReturnType;

public class Friday {
    public static int add(int a,int b){
        int addvalue=a+b;
        return addvalue;

    }
    public int mul(int a,int b){
        int mulvalue=a*b;
        return mulvalue;
    }
    public String name(String s1){
        s1=s1.toUpperCase();
        return s1;
    }
    public String name1(String s2){
        s2=s2.toLowerCase();
        return s2;
    }

    static void main(String[] args) {
        int sum=add(12,13);
        System.out.println(sum);
        System.out.println(add(12,13));
        System.out.println("--------------------");
        Friday f1=new Friday();
        f1.mul(12,12);
        int multiply=f1.mul(12,13);
        System.out.println(multiply);
        System.out.println("-------------------------");
        String stdname= f1.name("Sushama");
        System.out.println(stdname);
        System.out.println(f1.name("sushama"));
        String sirname= f1.name1("DESHMUKH");
        System.out.println(sirname);
        System.out.println(f1.name1("DESHMUKH"));

    }
}



