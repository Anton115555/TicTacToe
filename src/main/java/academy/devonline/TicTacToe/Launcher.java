package academy.devonline.TicTacToe;

import academy.devonline.TicTacToe.component.*;
import academy.devonline.TicTacToe.component.keypad.DesktopNumericKeypadCellNumberConverter;

public final class Launcher {

    public static void main(final String[] args) {
        final CellNumberConverter cellNumberConverter = new DesktopNumericKeypadCellNumberConverter ( );
        final Game game = new Game (
                new DataPrinter ( ), new ComputerMove ( ), new UserMove ( ), new WinnerVerifier ( ), new CellVerifier ( )
        );
        game.play ( );

    }
}