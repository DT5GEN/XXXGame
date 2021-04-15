import java.sql.SQLOutput;
import java.util.Scanner;

public class gameEngine {

    public static final char HUMAN_DOT = 'X';
    public static final char PC_DOT = 'O';
    public static final char EMPTY_DOT = '_';

    public static final Scanner SCANNER = new Scanner(System.in);

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
            System.out.print((y + 1) + "| ");
            for (int x = 0; x < mapSizeX; x++) {
                System.out.print(map[y][x] + " | ");
            }
            System.out.println();
            }

    }


    public static void humanStep(String[] args) {
        int x;
        int y;

        System.out.println(" Введите свои координаты: ");
        x = SCANER.nextInt();
        y = SCANER.nextInt();

        if () {
            map[y][x] = HUMAN_DOT;


        }
    }


    public static void main(String[] args) {

        initMap();
        printMap();

    }

    public static boolean isValidCell (int y, int x) {
        return x >=0 && x < mapSizeX && y >= 0 && y < mapSizeY;

    }

    public static boolean isFreeCell (int y, int x) {
        return map[y][x] == EMPTY_DOT;


    }
}
