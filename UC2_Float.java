package practiceProblems;

public class UC2_Float {

public static <T extends Comparable<T>> T max(T... elements) {
    T max = elements[0];
    for (T element : elements) {
        if (element.compareTo(max) > 0) {
            max = element;
        }
    }
    return max;
}
public static void main(String args[]) {
	System.out.println(" Max: " + max(Double.valueOf(5.6), Double.valueOf(7.8), Double.valueOf(2.9), Double.valueOf(18.6), Double.valueOf(10.25), Double.valueOf(18.6001)));
	}
}
