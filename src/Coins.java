
public class Coins {

	public static void main(String[] args) {

		int fifty = 5000;
		int twenty = 2000;
		int ten = 1000;
		int five = 500;
		int two = 200;
		int one = 100;
		int fiftyp = 50;
		int twentyp = 20;
		int tenp = 10;
		int fivep = 5;
		int twop = 2;
		int onep = 1;

//		This is the price charged
		double price = 2.95;
		
		double pricex = (price * 100);
		int pricep = (int) pricex;
//		
//		This is the amount the customer gives
		double tendered = 20.00;
		double tenderedx = (tendered * 100);
		int tenderedp = (int) tenderedx;

		double change = (tendered - price);
		int changep = (tenderedp - pricep);

//use integers to define how many of each
		System.out.println("You bought an item costing " + "£" + price + "p and tendered £" + tendered +"p for it. You will receive the following change");
		
		int nooffifties = (changep / fifty);
		int remchangep1=(changep-(nooffifties*fifty));
		if (nooffifties >0) {
		System.out.println(nooffifties + " x £50 note");
		}	
		int nooftwenties = (remchangep1 / twenty);
		int remchangep2=(remchangep1-(nooftwenties*twenty));
		if (nooftwenties >0) {
				System.out.println(nooftwenties + " x £20 note");
		}
	
		int nooftens = (remchangep2 / ten);
		int remchangep3=(remchangep2-(nooftens*ten));
		if (nooftens >0) {
		System.out.println(nooftens + " x £10 note");	
		}
	
		int nooffives = (remchangep3 / five);
		int remchangep4=(remchangep3-(nooffives*five));
		if (nooffives >0) {
		System.out.println(nooffives + " x £5 note");	
		}	
	
		int nooftwos = (remchangep4 / two);
		int remchangep5=(remchangep4-(nooftwos*two));
		if (nooftwos >0) {
		System.out.println(nooftwos + " x £2 coin");	
		}	
	
		int noofones = (remchangep5 / one);
		int remchangep6=(remchangep5-(noofones*one));
		if (noofones >0) {
		System.out.println(noofones + " x £1 coin");	
		}	
	
	
		
		int nooffiftyp = (remchangep6 / fiftyp);
		int remchangep7=(remchangep6-(nooffiftyp*fiftyp));
		if (nooffiftyp >0) {
		System.out.println(nooffiftyp + " x 50p coin");	
		}	
		
		int nooftwentyp = (remchangep7 / twentyp);
		int remchangep8=(remchangep7-(nooftwentyp*twentyp));
		if (nooftwentyp >0) {
		System.out.println(nooftwentyp + " x 20p coin");	
		}		
		
		int nooftenp = (remchangep8 / tenp);
		int remchangep9=(remchangep8-(nooftenp*tenp));
		if (nooftenp >0) {
		System.out.println(nooftenp + " x 10p coin");	
		}		
		
		int nooffivep = (remchangep9 / fivep);
		int remchangep10=(remchangep9-(nooffivep*fivep));
		if (nooffivep >0) {
		System.out.println(nooffivep + " x 5p coin");	
		}		
		
		int nooftwop = (remchangep10 / twop);
		int remchangep11=(remchangep10-(nooftwop*twop));
		if (nooftwop >0) {
		System.out.println(nooftwop + " x 2p coin");	
		}
		
		int noofonep = (remchangep11 / onep);
		int remchangep12=(remchangep11-(noofonep*onep));
		if (noofonep >0) {
		System.out.println(noofonep + " x 1p coin");	
		}
		
		System.out.println("Your total change is £" + change + "p");
		
	}

}
