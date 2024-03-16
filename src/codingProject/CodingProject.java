package codingProject;

public class CodingProject {

	public static void main(String[] args) {
		
		// New array of int called "ages"
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		// Using the indexes of the array to subtract the first element from the last element in the array
		int resultA = ages[ages.length -1] - ages[0];
		System.out.println(resultA);
		
		// New array of int called "ages"
		int[] ages2 = {3, 9, 23, 64, 2, 8, 28, 105};
		// When using the indexes the subtraction works for arrays of different sizes
		int resultB = ages2[ages2.length -1] - ages2[0];
		System.out.println(resultB);
		
		// Loop that iterates through the array "ages" and calculates the sum of all the elements
		int sum = 0;
		for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
		}
		// Calculating the average by dividing the sum by the length of the array
		int average = sum / ages.length;
		System.out.println(average);
		
		
		// New array of String call "names"
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		double sumNames = 0;
		double averageNames = 0;
		
		// Enhanced loop to iterate through the array and sum all the letters of the string
		for (String name : names) {
			sumNames += name.length();
		}
		// Calculating the average by dividing the sum by the length of the array
		averageNames = sumNames / names.length;
		System.out.println(averageNames);
		
		// New variable to set up a counter
		int count = 1;
		String combindedNames = "";
		// Enhanced for loop to iterate through the strings in the "names" array and add each name to the end of the "CombinedNames" array follow by a space
		for (String name : names) {
			combindedNames += name + " ";
			count++;
		}
		System.out.println(combindedNames);
		
		
		
		// How do you access the last element of any array?
		// arrayName[arrayName.length - 1]
		
		
		// How do you access the first element of any array?
		// arrayName[0]
		
		
		// New array of int called "nameLenghts" that is given the number of elements equal to the length of "names" array
		int[] nameLengths = new int[names.length];
		// For loop to iterate through the "names" array and add the length of each element as an element in "nameLengths"
		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		// Enhanced for loop to iterate through "nameLengths" array and sum all the elements
		double sumNameLengths = 0;
		for (int nameLength : nameLengths) {
			sumNameLengths += nameLength;
		}
		System.out.println(sumNameLengths);
		
		
		
		// Uses muliplyStrings method to return "Hello" concatenated to itself 3 times
		System.out.println(multiplyStrings("Hello", 3));
		
		
		
		
		// Uses fullName method to return a String of "Zack Minor"
		System.out.println(fullName("Zack", "Minor"));
		
		
		
		
		// Uses isGreaterThanOneHundred method to return true since 101 is greater than 100
		int[] nums = {100,1};
		System.out.println(isGreaterThanOneHundred(nums));
		
		
		
		// Uses averageArray method to return the average of the elements in array "nums2"
		double[] nums2 = {100.0,1,5,25,89,70};
		System.out.println(averageArray(nums2));
		
		
		
		// Uses compareAverages method to return false because array1 is not greater than array2
		double[] array1 = {100.0,1,5,25,89,70};
		double[] array2 = {500,1,5,25,89,70};
		System.out.println(compareAverages(array1, array2));
		
		
		
		// Uses willBuyDrink method to see if it's hot outside and if money in pocket is greater than 10.50
		System.out.println(willBuyDrink(true, 10.51));
		
		
		// Uses doesStringExist method to check if "Mary" exists in the array "team"
		String[] team = {"Zack", "Jimmy", "Harry"};
		boolean result = doesStringExist(team, "Mary");
		System.out.println(result);


		
		
	}
	
	// Method that returns a String
	// Method takes a String, word, and an int, n, as arguments
	// Method returns the word concatenated to itself n number of times
	public static String multiplyStrings(String word, int n) {
		String result = "";
		for (int i = 1; i <= n; i++) {
			result += word;
		}
		return result;
	}
	
	// Method that returns a String
	// Method takes two Strings, firstName and lastName as arguments
	// Method returns the firstName and lastName concatenated together separated by a space
	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}
	
	// Method returns a boolean
	// Method takes an array of int, sums all the elements of the string
	// Method checks if the sum is greater than 100
	// Method returns true if the sumer is greater than 100
	public static boolean isGreaterThanOneHundred(int[] numbers) {
		int sum = 0;
		boolean isTrue = false;
		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		return sum > 100;
	}
	
	// Method returns a double
	// Method takes an array of double, sums the numbers and returns the sum divided by the length of the array
	public static double averageArray(double[] numbers) {
		double sum = 0;
		for (double number : numbers) {
			sum += number;
		}
		return sum / numbers.length;
	}
	
	// Method returns a boolean
	// Method takes two arrays of double
	// Method finds the sum and average of both arrays
	// Method returns true if the average of array one is greater than array two
	public static boolean compareAverages(double[] nums1, double[]nums2) {
		double sum1 = 0;
		double sum2 = 0;
		for (double num1 : nums1) {
			sum1 += num1;
		}
		for (double num2 : nums2) {
			sum2 += num2;
		}
		double average1 = sum1 / nums1.length;
		double average2 = sum2 / nums2.length;
		return average1 > average2;
	}
	
	
	// Method returns a boolean
	// Method takes a boolean and double
	// Method checks if isHotOutside is true and moneyInPocket is greater than 10.50
	// Method returns true if both arguments are met
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return isHotOutside && moneyInPocket > 10.50;
	}
	
	
	// Method returns a boolean
	// Method takes an array of String and a String
	// Method checks the array, array, to see if it contains the String, s
	// Method returns true if the String, s, exists
	public static boolean doesStringExist(String[] array, String s) {
		boolean result = false;
		for (String input : array) {
			if (s.equals(input)) {
				result = true;
			}
		}
		return result;
	}
	
	
	

}
