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
  // Convert TilesAndTokens to String[][]
    public static String[][] convertToDisplay(List<TilesAndTokens> tile) {
        HashMap<String, String[][]> tileMap = new HashMap<>();
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.WETLAND, forestandwetland1);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.FOREST, forestandwetland2);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.WETLAND, forestandwetland3);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.FOREST, forestandwetland4);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.FOREST, forestandwetland5);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.RIVER, riverandforest1);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.FOREST, riverandforest2);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.RIVER, riverandforest3);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.FOREST, riverandforest4);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.RIVER, riverandforest5);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.MOUNTAIN, mountainandforest1);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.FOREST, mountainandforest2);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.MOUNTAIN, mountainandforest3);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.FOREST, mountainandforest4);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.MOUNTAIN, mountainandforest5);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.PRAIRIE, forestandPrairie1);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.FOREST, forestandPrairie2);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.PRAIRIE, forestandPrairie3);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.FOREST, forestandPrairie4);
        tileMap.put(TilesAndTokens.FOREST + "," + TilesAndTokens.PRAIRIE, forestandPrairie5);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.RIVER, wetlandandriver1);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.WETLAND, wetlandandriver2);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.RIVER, wetlandandriver3);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.WETLAND, wetlandandriver4);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.RIVER, wetlandandriver5);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.MOUNTAIN, wetlandandmountain1);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.WETLAND, wetlandandmountain2);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.MOUNTAIN, wetlandandmountain3);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.WETLAND, wetlandandmountain4);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.MOUNTAIN, wetlandandmountain5);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.PRAIRIE, wetlandandprairie1);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.WETLAND, wetlandandprairie2);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.PRAIRIE, wetlandandprairie3);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.WETLAND, wetlandandprairie4);
        tileMap.put(TilesAndTokens.WETLAND + "," + TilesAndTokens.PRAIRIE, wetlandandprairie5);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.MOUNTAIN, mountainandriver1);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.RIVER, mountainandriver2);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.MOUNTAIN, mountainandriver3);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.RIVER, mountainandriver4);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.MOUNTAIN, mountainandriver5);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.PRAIRIE, prairieandriver1);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.RIVER, prairieandriver2);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.PRAIRIE, prairieandriver3);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.RIVER, prairieandriver4);
        tileMap.put(TilesAndTokens.RIVER + "," + TilesAndTokens.PRAIRIE, prairieandriver5);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.PRAIRIE, prairieandmountain1);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.MOUNTAIN, prairieandmountain2);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.PRAIRIE, prairieandmountain3);
        tileMap.put(TilesAndTokens.PRAIRIE + "," + TilesAndTokens.MOUNTAIN, prairieandmountain4);
        tileMap.put(TilesAndTokens.MOUNTAIN + "," + TilesAndTokens.PRAIRIE, prairieandmountain5);

        String[][] display = new String[2][2];
            if (tile.size() == 2) {
                String key = tile.get(0) + "," + tile.get(1);
                display = tileMap.get(key);
            } else if (tile.size() == 1) {
                if (tile.get(0) == TilesAndTokens.FORESTKEY) {
                    display = forest1;
                } else if (tile.get(0) == TilesAndTokens.WETLANDKEY) {
                    display = wetland1;
                } else if (tile.get(0) == TilesAndTokens.RIVERKEY) {
                    display = river1;
                } else if (tile.get(0) == TilesAndTokens.MOUNTAINKEY) {
                    display = mountain1;
                } else if (tile.get(0) == TilesAndTokens.PRAIRIEKEY) {
                    display = prairie1;
                } else if (tile.get(0) == TilesAndTokens.FORESTKEY) {
                    display = forest2;
                } else if (tile.get(0) == TilesAndTokens.WETLANDKEY) {
                    display = wetland2;
                } else if (tile.get(0) == TilesAndTokens.RIVERKEY) {
                    display = river2;
                } else if (tile.get(0) == TilesAndTokens.MOUNTAINKEY) {
                    display = mountain2;
                } else if (tile.get(0) == TilesAndTokens.PRAIRIEKEY) {
                    display = prairie2;
                } else if (tile.get(0) == TilesAndTokens.FORESTKEY) {
                    display = forest3;
                } else if (tile.get(0) == TilesAndTokens.WETLANDKEY) {
                    display = wetland3;
                } else if (tile.get(0) == TilesAndTokens.RIVERKEY) {
                    display = river3;
                } else if (tile.get(0) == TilesAndTokens.MOUNTAINKEY) {
                    display = mountain3;
                } else if (tile.get(0) == TilesAndTokens.PRAIRIEKEY) {
                    display = prairie3;
                }
            }
        return display;
    }

}



