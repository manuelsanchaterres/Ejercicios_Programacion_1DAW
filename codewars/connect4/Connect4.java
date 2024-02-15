package connect4;

class Connect4 {

    private int currentPlayer;
    private int movesCounter;
    public static int[][] grid;
    Connect4(int currentPlayer, int movesCounter,int[][] grid){

        this.currentPlayer = currentPlayer;
        this.movesCounter = movesCounter;
        this.grid = grid;
    }

    String play(int column) {

        if (checkColumnFull(grid,column)){
            return "Column full!";
        }else {
            grid = insertDisc(currentPlayer,grid, column);
            /* if minimum movements is 7 then you can check for winning conditions 
            as player1 will already have played 4 discs*/
            if (movesCounter>= 7 && checkWin(grid,column)){
                System.out.println("Player" + currentPlayer + "wins");
                return "Game has finished!";
    
            }else {
    
                return "Player" + currentPlayer + " has a turn";
            }
            
        }


    }
    static boolean checkColumnFull(int[][] grid,int column){
        boolean isColumFull = true;

        for (int i = 5; i >=0; i--) {
            
            if (grid[i][column] == 0){

                isColumFull = false;
                break;
            }
        }
        return isColumFull;
    }

    static int[][] insertDisc(int currentPlayer,int[][] grid, int column){

        for (int i = 5; i >=0; i--) {
            
            if (grid[i][column] == 0){

                grid[i][column] = currentPlayer;
                break;
            }
        }
        return grid;
    }

    static boolean checkWin(int[][] grid, int column){

        return false;
    }






      
}
