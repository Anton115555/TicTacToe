package academy.devonline.TicTacToe.component;

import academy.devonline.TicTacToe.model.Cell;
import academy.devonline.TicTacToe.model.GameTable;

public class DataPrinter {

    public void printMappingTable() {
        System.out.println ("-------------");
        System.out.println ("| 7 | 8 | 9 |");
        System.out.println ("-------------");
        System.out.println ("| 4 | 5 | 6 |");
        System.out.println ("-------------");
        System.out.println ("| 1 | 2 | 3 |");
        System.out.println ("-------------");
    }

    public void printGameTable(final GameTable gameTable) {
        for (int i = 0; i < 3; i++) {
            System.out.println ("-------------");
            for (int j = 0; j < 3; j++) {
                System.out.print ("| " + gameTable.getSign (new Cell (i, j)) + " ");
            }
            System.out.println ("|");
        }
        System.out.println ("-------------");
    }
}