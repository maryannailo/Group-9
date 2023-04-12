import java.util.ArrayList;

public class HabitatTiles {
/*To rotate the tiles try making a method that will swap the colors on each side
*To place the tiles use an array to output the place mats on the board, then use the number to replace it with the tile which is a 2d array
* to place the tokens, only allow the place mats that have a tile on it, then put the token on top.*/
   public static final String[][] forrest1 = {
           {DisplayColour.DARKGREEN + "┌──" + "──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "└──" + "──┘"}
   };
   public static final String[][] forrest2 = {
           {DisplayColour.DARKGREEN + "┌──" + "──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "└──" + "──┘"}
   };
   public static final String[][] forrest3 = {
           {DisplayColour.DARKGREEN + "┌──" + "──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {DisplayColour.DARKGREEN + "└──" + "──┘"}
   };
   public static final String[][] prairie1 = {
           {DisplayColour.YELLOW + "┌──" + "──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + "E"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "└──" + "──┘"}
   };
   public static final String[][] prairie2 = {
           {DisplayColour.YELLOW + "┌──" + "──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "└──" + "──┘"}
   };
   public static final String[][] prairie3 = {
           {DisplayColour.YELLOW + "┌──" + "──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " +DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + "K"+ " " +DisplayColour.YELLOW + " "+ " |"},
           {DisplayColour.YELLOW + "└──" + "──┘"}
   };
   public static final String[][] river1 = {
           {DisplayColour.BLUE + "┌──" + "──┐"},
           {DisplayColour.BLUE + "|" + DisplayColour.BROWN + "B"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "└──" + "──┘"}
   };
   public static final String[][] river2 = {
           {DisplayColour.BLUE + "┌──" + "──┐"},
           {DisplayColour.BLUE + "|" + DisplayColour.CYAN + "H"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "└──" + "──┘"}
   };
   public static final String[][] river3 = {
           {DisplayColour.BLUE + "┌──" + "──┐"},
           {DisplayColour.BLUE + "|" + DisplayColour.RED + "S"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.BLUE + " "+ " |"},
           {DisplayColour.BLUE + "└──" + "──┘"}
   };
   public static final String[][] mountain1 = {
           {DisplayColour.GREY + "┌──" + "──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "└──" + "──┘"}
   };
   public static final String[][] mountain2 = {
           {DisplayColour.GREY + "┌──" + "──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "└──" + "──┘"}
   };
   public static final String[][] mountain3 = {
           {DisplayColour.GREY + "┌──" + "──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BLACK + "E"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.GREY + " "+ " |"},
           {DisplayColour.GREY + "└──" + "──┘"}
   };
   public static final String[][] wetland1 = {
           {DisplayColour.LIGHTGREEN + "┌──" + "──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + "S"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "└──" + "──┘"}
   };
   public static final String[][] wetland2 = {
           {DisplayColour.LIGHTGREEN + "┌──" + "──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + "F"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "└──" + "──┘"}
   };
   public static final String[][] wetland3 = {
           {DisplayColour.LIGHTGREEN + "┌──" + "──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + "H"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {DisplayColour.LIGHTGREEN + "└──" + "──┘"}
   };

   public static final String[][] forrestandPrairie1 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandPrairie2 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandPrairie3 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandPrairie4 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandPrairie5 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.RED+ "S" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandPrairie6 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + " " +DisplayColour.YELLOW + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"}
   };
   public static final String[][] forrestandwetland1 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] forrestandwetland2 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] forrestandwetland3 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] forrestandwetland4 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] forrestandwetland5 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] forrestandwetland6 = {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.CYAN + "H"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandprairie1 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };
   public static final String[][] wetlandandprairie2 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };
   public static final String[][] wetlandandprairie3 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };
   public static final String[][] wetlandandprairie4 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };
   public static final String[][] wetlandandprairie5 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };
   public static final String[][] wetlandandprairie6 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"}
   };

   public static final String[][] wetlandandmountain1 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandmountain2 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandmountain3 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandmountain4 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandmountain5 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };
   public static final String[][] wetlandandmountain6 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"}
   };

   public static final String[][] prairieandmountain1 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };
   public static final String[][] prairieandmountain2 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };
   public static final String[][] prairieandmountain3 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };
   public static final String[][] prairieandmountain4 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };
   public static final String[][] prairieandmountain5 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + "B"+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };
   public static final String[][] prairieandmountain6 = {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.RED+ "S" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + "B"+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"}
   };

   public static final String[][] wetlandandriver1 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.BROWN + "B"+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] wetlandandriver2 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] wetlandandriver3 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] wetlandandriver4 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] wetlandandriver5 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] wetlandandriver6 = {
           {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver1 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver2 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver3 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver4 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver5 = {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandriver6= {
           {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.RED+ "S" + " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest1= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN    + "|" + DisplayColour.ORANGE+ "F" + " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest2= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest3= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest4= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest5= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] riverandforrest6= {
           {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver1= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver2= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver3= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver4= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver5= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + "H"+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] prairieandriver6= {
           {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"}
   };
   public static final String[][] mountainandforrest1= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };
   public static final String[][] mountainandforrest2= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.ORANGE + "F"+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };
   public static final String[][] mountainandforrest3= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };
   public static final String[][] mountainandforrest4= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };
   public static final String[][] mountainandforrest5= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BROWN + "B"+DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };
   public static final String[][] mountainandforrest6= {
           {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BLACK + "E"+DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"}
   };

   public static final String[][] starterhabitat1 = {
           {"   " + DisplayColour.GREY + "┌──" + "──┐"},
           {"   " + DisplayColour.GREY + "|" + DisplayColour.BROWN + "B"+" "+ DisplayColour.GREY + " "+ " |"},
           {"   " + DisplayColour.GREY + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.GREY + " "+ " |"},
           {"   " + DisplayColour.GREY + "└──" + "──┘"},
           {DisplayColour.DARKGREEN + "┌──" + "──┐"+ DisplayColour.BLUE + "┌──" + "──┐"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.ORANGE+ "F" +DisplayColour.LIGHTGREEN + " " + "|"+ DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.DARKGREEN + "|" + DisplayColour.CYAN + "H"+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+ DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"},
           {DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.YELLOW + "└──" + "──┘"}
   };

   public static final String[][] starterhabitat2 = {
           {"   " + DisplayColour.LIGHTGREEN + "┌──" + "──┐"},
           {"   " + DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + "H"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {"   " + DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + "K"+" "+ DisplayColour.LIGHTGREEN + " "+ " |"},
           {"   " + DisplayColour.LIGHTGREEN + "└──" + "──┘"},
           {DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.GREY + "┌──" + "──┐"},
           {DisplayColour.BLUE + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BLACK+ "E" +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.YELLOW + "|" + DisplayColour.BROWN + "B"+ " " + DisplayColour.RED+ "S" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.BLUE + "|" + DisplayColour.RED+ "S" + " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.YELLOW + "└──" + "──┘"}
   };

   public static final String[][] starterhabitat3 = {
           {"   "+DisplayColour.DARKGREEN + "┌──" + "──┐"},
           {"   "+DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + "E"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {"   "+DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.DARKGREEN + " "+ " |"},
           {"   "+DisplayColour.DARKGREEN + "└──" + "──┘"},
           {DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.LIGHTGREEN + "┌──" + "──┐"},
           {DisplayColour.GREY + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.BLUE + " " + "|"+DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.RED+ "S" +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.GREY + "|" + DisplayColour.BLACK+ "E" + " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"},
           {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.YELLOW + "└──" + "──┘"}
   };
   public static final String[][] starterhabitat4 = {
           {"   "+DisplayColour.BLUE + "┌──" + "──┐"},
           {"   "+DisplayColour.BLUE + "|" + DisplayColour.RED + "S"+ " "+DisplayColour.BLUE + " "+ " |"},
           {"   "+DisplayColour.BLUE + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.BLUE + " "+ " |"},
           {"   "+DisplayColour.BLUE + "└──" + "──┘"},
           {DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.GREY + "┌──" + "──┐"},
           {DisplayColour.YELLOW + "|" + DisplayColour.RED + "S"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + "F"+ " " + DisplayColour.CYAN+ "H" +DisplayColour.GREY + " " + "|"},
           {DisplayColour.YELLOW + "|" + DisplayColour.BLACK+ "E" + " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"},
           {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.LIGHTGREEN + "└──" + "──┘"}

   };
   public static final String[][] starterhabitat5 = {
           {"   "+DisplayColour.YELLOW + "*" + "──┐"},
           {"   "+DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + "F"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {"   "+DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + "K"+ " "+DisplayColour.YELLOW + " "+ " |"},
           {"   "+DisplayColour.YELLOW + "└──" + "──┘"},
           {DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.DARKGREEN + "┌──" + "──┐"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + "H"+ " " + DisplayColour.RED+ "S" +DisplayColour.BLUE + " " + "|"+DisplayColour.GREY + "|" + DisplayColour.BLACK + "E"+ " " + DisplayColour.BROWN+ "B" +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE+ "F" + " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"},
           {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.GREY + "└──" + "──┘"}

   };


   public static void printTiles (String[][] tiles){
      for (String[] tile : tiles) {
         for (String s : tile) {
            System.out.print(s);
         }
         System.out.println();
      }
   }
   protected static ArrayList<String[][]> list = new ArrayList<String[][]>();

   public static void main(String[] args){

      list.add(forrest1);
      list.add(forrest2);
      list.add(forrest3);
      list.add(forrestandPrairie1);
      list.add(forrestandPrairie2);
      list.add(forrestandPrairie3);
      list.add(forrestandPrairie4);
      list.add(forrestandPrairie5);
      list.add(forrestandPrairie6);
      list.add(forrestandwetland1);
      list.add(forrestandwetland2);
      list.add(forrestandwetland3);
      list.add(forrestandwetland4);
      list.add(forrestandwetland5);
      list.add(forrestandwetland6);
      list.add(mountainandforrest1);
      list.add(mountainandforrest2);
      list.add(mountainandforrest3);
      list.add(mountainandforrest4);
      list.add(mountainandforrest5);
      list.add(mountainandforrest6);
      list.add(mountainandriver2);
      list.add(mountainandriver3);
      list.add(mountainandriver1);
      list.add(mountainandriver4);
      list.add(mountainandriver5);
      list.add(mountainandriver6);
      list.add(wetlandandprairie1);
      list.add(wetlandandprairie2);
      list.add(wetlandandprairie3);
      list.add(wetlandandprairie4);
      list.add(wetlandandprairie5);
      list.add(wetlandandprairie6);
      list.add(wetlandandmountain1);
      list.add(wetlandandmountain2);
      list.add(wetlandandmountain3);
      list.add(wetlandandmountain4);
      list.add(wetlandandmountain5);
      list.add(wetlandandmountain6);
      list.add(wetlandandriver1);
      list.add(wetlandandriver2);
      list.add(wetlandandriver3);
      list.add(wetlandandriver4);
      list.add(wetlandandriver5);
      list.add(wetlandandriver6);
      list.add(wetland1);
      list.add(wetland2);
      list.add(wetland3);
      list.add(prairie1);
      list.add(prairie2);
      list.add(prairie3);
      list.add(prairieandmountain1);
      list.add(prairieandmountain2);
      list.add(prairieandmountain3);
      list.add(prairieandmountain4);
      list.add(prairieandmountain5);
      list.add(prairieandmountain6);
      list.add(prairieandriver1);
      list.add(prairieandriver2);
      list.add(prairieandriver3);
      list.add(prairieandriver4);
      list.add(prairieandriver5);
      list.add(prairieandriver6);
      list.add(river3);
      list.add(river2);
      list.add(river1);
      list.add(mountain1);
      list.add(mountain2);
      list.add(mountain3);
      list.add(riverandforrest1);
      list.add(riverandforrest2);
      list.add(riverandforrest3);
      list.add(riverandforrest4);
      list.add(riverandforrest5);
      list.add(riverandforrest6);


   printTiles(starterhabitat1);
   }

}


