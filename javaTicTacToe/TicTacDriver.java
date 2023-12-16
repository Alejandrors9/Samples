package quest2;
import java.util.Scanner;
public class TicTacDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cin = new Scanner(System.in);
		int playerIn = 0;
		int currPlayer = 1;
		String currPlayerSymb = "O";
		TicTacClass game = new TicTacClass();
		
		System.out.println(game);
		System.out.println("O goes first.");
		
		while (game.notFull() && game.checkWin() == false) {
			if (currPlayer%2 == 1) {
				currPlayerSymb = "O";
			}
			else {
				currPlayerSymb = "X";
			}
			System.out.println("Enter the number where you want to play your symbol: ");
			playerIn = cin.nextInt();
			if (game.playerMove(playerIn,currPlayerSymb)) {
				currPlayer++;
			}
			else {
				System.out.println("Space is already taken");
			}
			System.out.println(game);
		}
		if (game.checkWin()) {
			System.out.println(currPlayerSymb +" is the winner!");
		}
		else {
			System.out.println("Tie Game!");
		}
		cin.close();
	}

}
