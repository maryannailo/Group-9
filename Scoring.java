import java .util.Random;
public class Scoring {
    static Random random = new Random();
    public static void bearScore()
    {
        String[] bScore = new String[]{
                "BEAR SCORE CARD (A)\n" +
                        "Score points shown for total number of Pairs of Bears. A pair of Bears is exactly two Bears adjacent to each other with nmo other adjacent Bears.",
                "BEAR SCORE CARD (B)\n" +
                        "Score 10 points per group of three Bears. Each group must be exactly three adjacent Bears, and may no have any other Bears adjacent to it ",
                "BEAR SCORE CARD (C)\n" +
                        "Score points shown for each group of one, two, or three Bears, depending on size, Each group of Bears may not have any other Bears adjacent to it. Scores a bonus 3 points for having one of each of the three group sizes"};

        System.out.println(bScore[random.nextInt(3)]);
    }

    public static void foxScore()
    {
        String[] fScore = new String[]{
                "FOX SCORE CARD (A)\n" +
                        "Score points shown for each Fox, depending on the number of unique wildlife types adjacent to it. Other adjacent Foxes may be scored as unique when scoring each fox",
                "FOX SCORE CARD (B)\n" +
                        "Score points shown for each Fox, depending on the number of unique pairs of the other wildlife types adjacent to it. Other adjacent Fox pairs do not score. Each pair of other wildlife must be uniquer- the same wildlife may not count for more than one pair, even if four or six of that wildlife are adjacent. Pairs of wildlife do not need to be adjacent to each other.",
                "FOX SCORE CARD (C)\n" +
                        "Score points for each Fox, depending on the number of a single wildlife type adjacent to it. Other adjacent Foxes may not be score."};
        System.out.println(fScore[random.nextInt(3)]);
    }




    public static void elkScore()
    {
        String[] eScore=new String[] {
                "ELK SCORE CARD (A)\n" +
                        "Score points shown for each straight line of adjacent Elk, depending on length of the line. A straight line is defines as orthogonally adjacent. Two lines of ELK may be adjacent to one another, however, each Elk may only count for a single line. Lines do not need to be horizontal ",
                "ELK SCORE CARD (B)\n" +
                        "Score points shown for each contiguous group of adjacent Elk in any shape, depending on size of group.",
                "ELK SCORE CARD (C)\n" +
                        "Score points shown for each group of Elk in each exact shape. Two groups of Elk may be adjacent to one another, however each Elk may only count fora single group. Groups may be rotated."};

        System.out.println(eScore[random.nextInt(3)]);
    }

    public static void hawkScore()
    {
        String[] hScore=new String[] {
                "HAWK SCORE CARD (A)\n" +
                        "Score points shown for total number of Hawks that are not adjacent to any other Hawk.",
                "HAWK SCORE CARD (B)\n" +
                        "Score points shown for each hawk, based on it's line of sight to any other Hawks that are not directly adjacent. Line of sight is not interrupted by a gap in Habitat Tiles, or by other wildlife.",
                "HAWK SCORE CARD (C)\n" +
                        "Score 3 points for each pair of Hawks that share a direct line of sight between them. Each Hawk may only be counted as part of multiple pairs. Line of sight is not interrupter by a gap ion habitat tiles, or by other wildlife."};

        System.out.println(hScore[random.nextInt(3)]);
    }

    public static void salmonScore()
    {
        String[] sScore=new String[] 
                {
                "SALMON SCORE CARD (A)\n" +
                        "Score points shown for each run of Salmon, depending on length of run. A run is defined as a group of adjacent Salmon where each Salmon is adjacent to no more than two other Salmon. A group of three Salmon in a triangle shape may count as a run, but no other Salmon may be attached to this run. Each run of Salmon may not have any other Salmon adjacent to it.",
                "SALMON SCORE CARD (B)\n" +
                        "Score points shown for each run of Salmon, depending on length of run. A run is defined as a group of adjacent Salmon where each Salmon is adjacent to no more than two other Salmon. A group of three salmon in a triangle shape may count as a run, but no other Salmon amy vbe attacked to shi run. Each run of Salmon may not have any other Salmon adjacent to it.",
                "SALMON SCORE CARD (C)\n" +
                        "Score points shown for each Fox, depending on the number of a single wildlife type adjacent to it. Other adjacent Foxes may not be scored.",
        };

        System.out.println(sScore[random.nextInt(3)]);
    }

}
