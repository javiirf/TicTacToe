/**
 *
 * Connect4
 * Javier Flores
 * 2/2/2024
 */
import java.awt.desktop.SystemSleepEvent


val FIR_board = FourInARow()

/** The entry main method (the program starts here)  */
fun main() {
    var currentState: Int = GameConstants.PLAYING
    var userInput = "";
    //game loop
    do {
        Thread.sleep(1000)
        FIR_board.printBoard()

        println("Enter Move 0 - 35")
        Thread.sleep(1000)
        userInput = readln()

        if (userInput != "q"){
            FIR_board.setMove(GameConstants.BLUE, userInput.toInt())


        }


        (FIR_board.setMove(GameConstants.RED, FIR_board.computerMove));


        val status = FIR_board.checkForWinner();
        when(status) {
            GameConstants.RED_WON -> {
                println("Computer Won")
                println("You SucK")
                currentState = GameConstants.RED_WON;
            }

            GameConstants.BLUE_WON -> {
                println("You Win!")
                println("Congratulations");
                currentState = GameConstants.BLUE_WON;
            }

            GameConstants.TIE -> {
                println("TIE")
                println("Congratulations")
                currentState = GameConstants.TIE;
            }

        }


        /** TODO implement the game loop
         * 1- accept user move
         * 2- call getComputerMove
         * 3- Check for winner
         * 4- Print game end messages in case of Win , Lose or Tie !
         */
    } while (currentState == GameConstants.PLAYING && userInput != "q")

// repeat if not game-over
}
