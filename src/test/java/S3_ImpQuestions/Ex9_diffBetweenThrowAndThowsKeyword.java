package S3_ImpQuestions;
public class Ex9_diffBetweenThrowAndThowsKeyword {
    public static void main(String[] args) throws Exception {

        Thread.sleep(2000);

        checkAge(5);
    }

    public static void checkAge(int age) throws Exception
    {
        if (age < 18)
        {
            throw new Exception("Age must be 18 or older.");
        }
    }


}
