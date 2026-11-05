package POM_With_Pagefactory;

public class Sample1 {
    //1. Variable should be declared globally with access level private
    private int num1;
    private int num2;
    //2. Initialize within a constructor with access level public
    public Sample1(){
     num1=10;
     num2=20;
    }
    //3. Utilize global variables within a method with access level public
    public void sum(){
        System.out.println(num1+num2);
    }
    public void sub(){
        System.out.println(num1-num2);
    }

}
