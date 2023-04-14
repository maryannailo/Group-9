import java.util.ArrayList;
import java.util.Arrays;

public class HabitatTiles {
  public static final String[][] forrest1 = {
          {DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol() + " " + DisplayColour.DARKGREEN + " " + " |"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol() + " " + DisplayColour.DARKGREEN + " |"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + "──┘" + DisplayColour.RESET}
  };
  public static final String[][] forrest2 = {
          {DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " "+DisplayColour.DARKGREEN + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.DARKGREEN +" |"+DisplayColour.RESET+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrest3 = {
          {DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " "+DisplayColour.DARKGREEN + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.DARKGREEN +" |"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairie1 = {
          {DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " "+DisplayColour.YELLOW + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.YELLOW +" |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairie2 = {
          {DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " "+DisplayColour.YELLOW + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.YELLOW +" |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairie3 = {
          {DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " +DisplayColour.YELLOW + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " " +DisplayColour.YELLOW +" |"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] river1 = {
          {DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+" "+ DisplayColour.BLUE + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.BLUE +" |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] river2 = {
          {DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+" "+ DisplayColour.BLUE + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.BLUE +" |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] river3 = {
          {DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+" "+ DisplayColour.BLUE + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.BLUE +" |"+DisplayColour.RESET},
          {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountain1 = {
          {DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+" "+ DisplayColour.GREY + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.GREY +" |"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountain2 = {
          {DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+" "+ DisplayColour.GREY + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.GREY +" |"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountain3 = {
          {DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+" "+ DisplayColour.GREY + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.GREY +" |"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetland1 = {
          {DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+" "+ DisplayColour.LIGHTGREEN + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.LIGHTGREEN +" |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetland2 = {
          {DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+" "+ DisplayColour.LIGHTGREEN + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.LIGHTGREEN +" |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetland3 = {
          {DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+" "+ DisplayColour.LIGHTGREEN + " "+ " |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.LIGHTGREEN +" |"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET}
  };

  public static final String[][] forrestandPrairie1 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandPrairie2 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandPrairie3 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandPrairie4 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandPrairie5 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandPrairie6 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.YELLOW+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + " " +DisplayColour.YELLOW + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.YELLOW+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandwetland1 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandwetland2 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandwetland3 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] forrestandwetland4 = {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
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
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandprairie2 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandprairie3 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandprairie4 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandprairie5 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandprairie6 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.LIGHTGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.LIGHTGREEN+"──┘"+DisplayColour.RESET}
  };

  public static final String[][] wetlandandmountain1 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandmountain2 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandmountain3 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandmountain4 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandmountain5 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandmountain6 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.LIGHTGREEN +"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.LIGHTGREEN +"──┘"+DisplayColour.RESET}
  };

  public static final String[][] prairieandmountain1 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandmountain2 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandmountain3 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandmountain4 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandmountain5 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandmountain6 = {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.GREY +"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.GREY+"──┘"+DisplayColour.RESET}
  };

  public static final String[][] wetlandandriver1 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandriver2 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandriver3 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandriver4 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandriver5 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] wetlandandriver6 = {
          {DisplayColour.LIGHTGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver1 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver2 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver3 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver4 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver5 = {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandriver6= {
          {DisplayColour.GREY + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() + " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest1= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN    + "|" + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() + " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest2= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest3= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest4= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest5= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] riverandforrest6= {
          {DisplayColour.DARKGREEN + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver1= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver2= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver3= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver4= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver5= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] prairieandriver6= {
          {DisplayColour.YELLOW + "┌──" + DisplayColour.BLUE+"──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "└──" + DisplayColour.BLUE+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest1= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest2= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest3= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest4= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest5= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };
  public static final String[][] mountainandforrest6= {
          {DisplayColour.GREY + "┌──" + DisplayColour.DARKGREEN+"──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + " "+ " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "└──" + DisplayColour.DARKGREEN+"──┘"+DisplayColour.RESET}
  };

  public static final String[][] starterhabitat1 = {
          {"   " + DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {"   " + DisplayColour.GREY + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+" "+ DisplayColour.GREY + " "+ " |"+DisplayColour.RESET},
          {"   " + DisplayColour.GREY + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.GREY +" |"+DisplayColour.RESET},
          {"   " + DisplayColour.GREY + "└──" + "──┘"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET+ DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " " + DisplayColour.ORANGE+ TilesAndTokens.FOX.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET+ DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET+ DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET+DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };

  public static final String[][] starterhabitat2 = {
          {"   " + DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {"   " + DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+" "+ DisplayColour.LIGHTGREEN + " "+ " |"+DisplayColour.RESET},
          {"   " + DisplayColour.LIGHTGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.LIGHTGREEN +" |"+DisplayColour.RESET},
          {"   " + DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET},
          {DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET+DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET+DisplayColour.YELLOW + "|" + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.BLUE + "|" + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() + " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET+DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.RESET+DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };

  public static final String[][] starterhabitat3 = {
          {"   "+DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {"   "+DisplayColour.DARKGREEN + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol()+ " "+DisplayColour.DARKGREEN + " "+ " |"+DisplayColour.RESET},
          {"   "+DisplayColour.DARKGREEN + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.DARKGREEN +" |"+DisplayColour.RESET},
          {"   "+DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.RESET},
          {DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET+DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET+DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.RED+ TilesAndTokens.SALMON.getSymbol() +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.GREY + "|" + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() + " " + " " +DisplayColour.BLUE + " " + "|"+DisplayColour.RESET+DisplayColour.YELLOW + "|" + " "+ " " + " " +DisplayColour.LIGHTGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.RESET+DisplayColour.YELLOW + "└──" + "──┘"+DisplayColour.RESET}
  };
  public static final String[][] starterhabitat4 = {
          {"   "+DisplayColour.BLUE + "┌──" + "──┐"+DisplayColour.RESET},
          {"   "+DisplayColour.BLUE + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " "+DisplayColour.BLUE + " "+ " |"+DisplayColour.RESET},
          {"   "+DisplayColour.BLUE + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol()+ " "+DisplayColour.BLUE +" |"+DisplayColour.RESET},
          {"   "+DisplayColour.BLUE + "└──" + "──┘"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.RESET+DisplayColour.GREY + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol()+ " " + DisplayColour.BROWN+ TilesAndTokens.BEAR.getSymbol() +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET+DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol()+ " " + DisplayColour.CYAN+ TilesAndTokens.HAWK.getSymbol() +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.YELLOW + "|" + DisplayColour.BLACK+ TilesAndTokens.ELK.getSymbol() + " " + " " +DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET+DisplayColour.LIGHTGREEN + "|" + " "+ " " + " " +DisplayColour.GREY + " " + "|"+DisplayColour.RESET},
          {DisplayColour.DARKGREEN + "└──" + "──┘"+DisplayColour.RESET+DisplayColour.LIGHTGREEN + "└──" + "──┘"+DisplayColour.RESET}

  };
  public static final String[][] starterhabitat5 = {
          {"   " + DisplayColour.YELLOW + "┌──" + "──┐"+DisplayColour.RESET},
          {"   " + DisplayColour.YELLOW + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol() + " " + DisplayColour.YELLOW + " " + " |"+DisplayColour.RESET},
          {"   " + DisplayColour.YELLOW + "|" + DisplayColour.PURPLE + TilesAndTokens.KEY.getSymbol() + " " + DisplayColour.YELLOW + "|"},
          {"   " + DisplayColour.YELLOW + "└──" + "──┘" + DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "┌──" + "──┐"+DisplayColour.RESET + DisplayColour.DARKGREEN + "┌──" + "──┐"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.CYAN + TilesAndTokens.HAWK.getSymbol() + " " + DisplayColour.RED + TilesAndTokens.SALMON.getSymbol() + DisplayColour.BLUE + " " + "|"+DisplayColour.RESET + DisplayColour.GREY + "|" + DisplayColour.BLACK + TilesAndTokens.ELK.getSymbol() + " " + DisplayColour.BROWN + TilesAndTokens.BEAR.getSymbol() + DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.LIGHTGREEN + "|" + DisplayColour.ORANGE + TilesAndTokens.FOX.getSymbol() + " " + " " + DisplayColour.BLUE + " " + "|"+DisplayColour.RESET + DisplayColour.GREY + "|" + " " + " " + " " + DisplayColour.DARKGREEN + " " + "|"+DisplayColour.RESET},
          {DisplayColour.BLUE + "└──" + "──┘" + DisplayColour.RESET + DisplayColour.GREY + "└──" + "──┘" + DisplayColour.RESET}
  };

  public static String[] foxtoken = {String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol())};
  public static String[] elktoken = {String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol())};
  public static String[] hawktoken = {String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol())};
  public static String[] salmontoken = {String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol())};
  public static String[] beartoken = {String.valueOf(TilesAndTokens.FOXTOKEN.getSymbol())};

  public static void printTiles (String[][] tiles){
      for (String[] tile : tiles) {
         for (String s : tile) {
            System.out.print(s);
         }
         System.out.println();
      }
   }

}



