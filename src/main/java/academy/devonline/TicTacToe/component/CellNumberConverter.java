package academy.devonline.TicTacToe.component;

import academy.devonline.TicTacToe.model.Cell;

public interface CellNumberConverter {

    Cell toCell(char number);

    char toNumber(Cell cell);
}
