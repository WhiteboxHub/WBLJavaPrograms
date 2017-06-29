package OOPsConcepts;

class Bank {
	int getRateOfInterest() {
		return 0;
	}
}

class Chase extends Bank {
	int getRateOfInterest() {
		return 8;
	}
}

class Bofa extends Bank {
	int getRateOfInterest() {
		return 7;
	}
}

class Wells extends Bank {
	int getRateOfInterest() {
		return 9;
	}
}

public class OverridingMethod {
	public static void main(String args[]) {
		Chase s = new Chase();
		Bofa i = new Bofa();
		Wells a = new Wells();
		System.out.println("Chase Rate of Interest: " + s.getRateOfInterest());
		System.out.println("BofAmerica Rate of Interest: " + i.getRateOfInterest());
		System.out.println("Wells Fargo Rate of Interest: " + a.getRateOfInterest());
	}
}
