public class Bot
{
    public static int getTurnChoice()
    {
        return (Math.random() <= 0.5) ? 1 : 2;

    }


    public static String getCullChoice()
    {
        String answer = "";
        switch((Math.random() <= 0.5) ? 1 : 2)
        {
            case 1:
                answer = "y";


            case 2:
                answer = "n";


        }
        return answer;
        
    }
}
