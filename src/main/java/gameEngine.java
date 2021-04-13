public class gameEngine {

    public static final char HUMAN_DOT = 'X';
    public static final char PC_DOT = 'O';
    public static final char EMPTY_DOT = '_';

    public static char  [][] map;
    public static int mapSizeX;
    public static int mapSizeY;

    public static void initMap() {
        mapSizeX = 3;
        mapSizeY = 3;
        map = new char[mapSizeY][mapSizeX];

        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                map[y][x] = EMPTY_DOT;
            }
        }
    }

    public static void printMap() {
        for (int y = 0; y < mapSizeY; y++) {
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
            }

    }


    public static void main(String[] args) {

        initMap();
        printMap();

    }
}
