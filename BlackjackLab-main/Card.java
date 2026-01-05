public class Card
{
	public static final String FACES[] = {"ZERO","ACE","TWO","THREE","FOUR",
			               "FIVE","SIX","SEVEN","EIGHT","NINE","TEN","JACK","QUEEN","KING"};

		String suit;
		int face;

	public Card(String s, int f) {
		suit = s;
		face = f;
	}

	public void setSuit(String s) {
		suit = s;
	}

	public void setFace(int f) {
		face = f;
	}

	public String getSuit() {
		return suit;
	}

	public int getFace() {
		return face;
	}

	public String toString() {
		return FACES[face] + " of " + suit;
	}
}