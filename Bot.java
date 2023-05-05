public class Bot
{
    public static int getTurnChoice()
    {
        return (Math.random() <= 0.5) ? 1 : 2;

    }


    public static String getCullChoice()
    {
        switch((Math.random() <= 0.5) ? 1 : 2)
        {
            case 1:
                return "y";


            case 2:
                return "n";


        }


    }
}
