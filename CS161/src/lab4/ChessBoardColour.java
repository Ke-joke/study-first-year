package CS161.src.lab4;

class ChessBoardColour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChessBoardColour cbc=new ChessBoardColour();
		cbc.checkColour('f',1);
		cbc.checkColour('G',7);
		cbc.checkColour('J',1);
	}
	private void checkColour(char letter,int number) {
		letter=Character.toUpperCase(letter);
		
		if(letter=='A'||letter=='C'||letter=='E'||letter=='G') {
			if(number%2!=0) {
				System.out.println("Dark");
			}
			else if(number%2==0) {
				System.out.println("Light");	
			}
		}
		else if(letter=='B'||letter=='D'||letter=='F'||letter=='H') {
			if(number%2!=0) {
				System.out.println("Light");
			}
			else if(number%2==0) {
				System.out.println("Dark");
			}
		}
		else {
			System.out.println("Wrong Code!");
		}
	}

}
