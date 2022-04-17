package lec5.task2;

import commons.ArrayStartTools;

public class ChessDesk {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        String[][] chessDesk = new String[8][8];
        creatChessDesk(chessDesk);
        arrayTools.arrayPrint(chessDesk);
    }

    public static String[][] creatChessDesk(String[][] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = "W";
                    } else {
                        array[i][j] = "B";
                    }
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    if (j % 2 == 0) {
                        array[i][j] = "B";
                    } else {
                        array[i][j] = "W";
                    }
                }
            }
        }
        return array;
    }
}
