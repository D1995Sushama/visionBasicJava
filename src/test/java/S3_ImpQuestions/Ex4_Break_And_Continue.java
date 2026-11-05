package S3_ImpQuestions;

public class Ex4_Break_And_Continue
{
    public static void main(String[] args) {

//        breakKeyword();
        continueKeyword();

    }


    public static void continueKeyword()
    {
        for(int i=1; i<=10; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i);
        }
    }


    public static void breakKeyword()
    {
        for(int i=1; i<=10; i++)
        {
            System.out.println(i);

            if(i==5)
            {
                break;
            }
        }
    }

}
