import java.util.Scanner;

public class tictactoe{
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                board[row][col]= ' ';
            }
        }
        char player='X';
        boolean gameover=false;
        Scanner scanner = new Scanner(System.in);

        while(!gameover){
            print(board);
            System.out.print("player " + player + "  enter;");

            int row =scanner.nextInt();
            int col =scanner.nextInt();
            System.out.println();

            if(board[row][col] == ' '){
                // giving value in box
                board[row][col] = player;
                gameover = haveone(board,player);
                if(gameover){
                    System.out.println("player" + player + " has won");
                }
                else{
                    player = (player =='X')? 'O':'X';
                }

            }
            else{
                System.out.println("invalid or game over");
            }
        }
        print(board);

    }
    public static boolean haveone(char[][] board,char player){
        for(int row=0;row<3;row++){
            if(board[row][0] ==player && board[row][1] ==player && board[row][2] ==player)
            return true;
        }
        for(int col=0;col<3;col++){
            if(board[0][col] ==player && board[1][col] ==player && board[2][col] ==player)
            return  true;
        }
        if(board[0][0] ==player && board[1][1] ==player && board[2][2] ==player)
       { return  true;}
        if(board[0][2] ==player && board[1][1] ==player && board[2][0] ==player)
       { return  true;}

        return false;
    }

    public static void print(char[][] board){
        for(int row=0;row<3;row++){
            for(int col=0;col<3;col++){
                System.out.print(board[row][col]+" |");
            }
            System.out.println();
    }

}
}
    
    

