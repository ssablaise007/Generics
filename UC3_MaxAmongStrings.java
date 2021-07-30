package practiceProblems;

public class UC3_MaxAmongStrings {
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
		System.out.println("String Max: " + max(" BayerischeMotorenWerkeAG", "Mango", "Apple", "Pomegranate", "Guava", "Blackberry", "Cherry", "Orange", "Date"));
		}
	}

