package S3_ImpQuestions;
public class Ex7_DiffBetween_final_finally_finalize
{
    public static void main(String[] args)
    {
        final int a=10;
        //a=20;             //can't perform re-initialze
        System.out.println(a);


        String s1="abcd";
        try
        {
            System.out.println(s1.charAt(5));   //risky code
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("StringIndexOutOfBounds Exception handled");
        }
        finally
        {
            System.out.println("running finally block");
        }


        // finalize()
    }
}
