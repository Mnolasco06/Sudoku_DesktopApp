package sudoku.buildlogic;

import java.io.IOException;

import sudoku.persistence.LocalStorageImpl;
import sudoku.userinterface.IUserInterfaceContract;
import sudoku.problemdomain.SudokuGame;
import sudoku.problemdomain.IStorage;
import sudoku.computationlogic.GameLogic;
import sudoku.userinterface.logic.ControlLogic;


public class SudokuBuildLogic {

    public static void build(IUserInterfaceContract.View userInterface) throws IOException {
        SudokuGame initialState;
        IStorage storage = new LocalStorageImpl();

        try {
            initialState = storage.getGameData();
        } catch (IOException e) {
            initialState = GameLogic.getNewGame();
            storage.updateGameData(initialState);
        }

        IUserInterfaceContract.EventListener uiLogic
                = new ControlLogic(storage, userInterface);

        userInterface.setListener(uiLogic);
        userInterface.updateBoard(initialState);
    }
}
