package quest2;

public class TicTacClass {
	private String[][]board = {
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}
	};

	public boolean playerMove(int n, String playerSymb) {
		int row = (n-1)/3;
		int column = (n-1)%3;
		

		if (board[row][column] != "X" && board[row][column] != "O") {
			board[row][column] = playerSymb;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean checkWin() {
		if (board[0][0] == board[0][1] && board[0][2] == board[0][1]) {
			return true;
		}
		else if (board[1][0] == board[1][1] && board[1][2] == board[1][1]) {
			return true;
		}
		else if (board[2][0] == board[2][1] && board[2][2] == board[2][1]) {
			return true;
		}
		
		else if (board[0][0] == board[1][0] && board[2][0] == board[1][0]) {
			return true;
		}
		else if (board[0][1] == board[1][1] && board[2][1] == board[1][1]) {
			return true;
		}
		else if (board[0][2] == board[1][2] && board[2][2] == board[1][2]) {
			return true;
		}
		
		else if (board[0][0] == board[1][1] && board[2][2] == board[1][1]) {
			return true;
		}
		else if (board[2][0] == board[1][1] && board[0][2] == board[1][1]) {
			return true;
		}
		else {
			return false;
		}
	}

	
	public boolean notFull() {
		int counter = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (board[i][j] == "X" || board[i][j] == "O") {
					counter++;
				}
			}
		}
		if (counter != 9) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		String theB = "";
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				theB += board[i][j];
				theB += "\t";
			}
			theB += "\n";
		}
		return theB;
	}
}
