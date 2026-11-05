package MethodWithReturnType;

public class Ex2_MethodReturnType {
  public static String ConvertNameToUpperCase(String s1){
       s1=s1.toUpperCase();
       return s1;
  }
  public static int RollNumber(int Rollnumber){
    int R1= 12;
    return R1;
  }

  static void main(String[] args) {
    String s1=ConvertNameToUpperCase("Sushama");
    System.out.println(s1);
    System.out.println("------------");
    System.out.println(ConvertNameToUpperCase("sushama"));
    System.out.println("------------");
    int num=RollNumber(13);
    System.out.println(RollNumber(13));
  }
}
