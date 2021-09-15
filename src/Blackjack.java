
public class Blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		play(0, 21);
	}

	private static int play(int hand1, int hand2) {



			if (hand1 > 21 && hand2 > 21) {
				return 0;

				
			}else {
				
				if (hand2 > hand1) {
				
			if (hand1 < 22 && hand1 > hand2) {
					return hand1;
		}

		if (hand2 < 22 && ) {
			return hand2;

		}
		if (hand1 == hand2) {
			return 0;

		} else {
			return 0;
		}
	}
}


if (hand1 == 0 || hand2 == 0)
	return 0;