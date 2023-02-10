public enum Tile {
    FOREST(DisplayColour.DARKGREEN + "  ", TileColour.DARKGREEN),
    WETLAND(DisplayColour.LIGHTGREEN + "    ", TileColour.LIGHTGREEN),
    RIVER(DisplayColour.BLUE + "    ", TileColour.BLUE),
    MOUNTAIN(DisplayColour.GREY + "     ", TileColour.GREY),
    PRAIRIE(DisplayColour.YELLOW + "    ", TileColour.YELLOW);


    private TileColour colour;
    private String symbol;

    Tile (String symbol, TileColour colour) {
        this.symbol = symbol;
        this.colour = colour;
    }

    public TileColour getColour () {
        return colour;
    }
    public String toString(){return symbol;}
}

