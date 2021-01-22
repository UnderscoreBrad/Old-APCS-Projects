/*
THIS IS FOR APCS
APCS WITH THE HANLEY

Three Hanleys for the Elven-kings under the sky,
Seven for the Dwarf-lords in their halls of stone,
Nine for Mortal Men doomed to die,
One for the Dark Lord on his dark throne
In the Land of Mordor where the Shadows lie.

One Hanley to rule them all, One Hanley to find them,
One Hanley to bring them all and in the darkness bind them
In the Land of Mordor where the Shadows lie.

We've had a great year but now it's time to yeet out.

Project Author:         Brad Estus
Project Group/Topic:    APCS
Project Type:           FINAL EXAM
Date Completed:         10 June 2019
Date Due:               11 June 2019
 */

public class ConnectFour {

    private int[][] gameSpace = new int[6][7];
    private int turnNumber;

    public ConnectFour() {
        for (int y = 0; y < 6; y++) {
            for (int x = 0; x < 7; x++) {
                gameSpace[y][x] = -1;
            }
        }
        turnNumber = 0;
    }

    public boolean takeTurn(int x) {
        turnNumber++;
        if (x >= 0 && x < 7) {
            for (int i = 0; i < gameSpace.length; i++) {
                if (gameSpace[i][x] == -1) {
                    gameSpace[i][x] = turnNumber % 2;
                    return true;
                }
            }
        }
        turnNumber--;
        return false;

    }

    public int checkWin() {
        for (int r = 0; r < gameSpace.length; r++) {
            for (int c = 0; c < gameSpace[0].length; c++) {
                int check = gameSpace[r][c];
                if (check != -1) {
                    if (c + 3 < gameSpace[0].length && check == gameSpace[r][c + 1] && check == gameSpace[r][c + 2] && check == gameSpace[r][c + 3]) {
                        return turnNumber % 2;
                    }
                    if (r + 3 < gameSpace.length) {
                        if (check == gameSpace[r + 1][c] && check == gameSpace[r + 2][c] && check == gameSpace[r + 3][c]) {
                            return turnNumber % 2;
                        }
                        if (c + 3 < gameSpace[0].length && check == gameSpace[r + 1][c + 1] && check == gameSpace[r + 2][c + 2] && check == gameSpace[r + 3][c + 3]) {
                            return turnNumber % 2;
                        }
                        if (c - 3 >= 0 && check == gameSpace[r + 1][c - 1] && check == gameSpace[r + 2][c - 2] && check == gameSpace[r + 3][c - 3]) {
                            return turnNumber % 2;
                        }
                    }
                }
            }
        }
        if (turnNumber == 42) {
            return -2;
        }
        return -1;
    }
}
