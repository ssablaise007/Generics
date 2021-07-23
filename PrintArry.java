package LearningProblems;

public class PrintArry<T> {
	private T[]  inputArray;
	public PrintArry(T[] inputArray) {
		this.inputArray = inputArray;
	}
public void toPrint() {
	PrintArry.toPrint(this.inputArray);
}
public static <E> void toPrint(E[] inputArray) {
	for(E element : inputArray) {
		System.out.printf("%s",element);
	}
	System.out.println();
}
public static void main(String[] args ) {
	Integer[]  intArray = {1,2,3,4,5};
	Double[] doubleArray = { 1.1, 2.2, 3.3 };
	Character[] charArray = { 'h' ,'g' ,'j' ,'k' };
	new PrintArry(intArray).toPrint();
	PrintArry.toPrint(doubleArray);
	PrintArry.toPrint(charArray);
}
}
