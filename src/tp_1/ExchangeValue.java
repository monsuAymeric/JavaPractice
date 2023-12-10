package tp_1;

public class ExchangeValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int numberOne = 42;
        int numberTwo = 11;

        System.out.print("Avant l'échange : numberOne = " + numberOne + " | numberTwo = " + numberTwo);

        int exchangeValue = numberOne;
        numberOne = numberTwo;
        numberTwo = exchangeValue;

        System.out.print("\n" + "Après l'échange : numberOne = " + numberOne + " | numberTwo = " + numberTwo);
	}

}
