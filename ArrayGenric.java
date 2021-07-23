package LearningProblems;

public class ArrayGenric {
	
public static <E> void toPrint(E[] inputArray) {
	for ( E element : inputArray ) {
		System.out.printf("%s",element);
	}
	System.out.println();
}

public static void main(String[] args) {
 
	Integer[]  intArray = {1,2,3,4,5};
	Double[] doubleArray = { 1.1, 2.2, 3.3 };
	Character[] charArray = { 'h' ,'g' ,'j' ,'k' };
	
	ArrayGenric.toPrint(intArray);
	ArrayGenric.toPrint(doubleArray);
	ArrayGenric.toPrint(charArray);
}

}