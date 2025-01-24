import java.util.Arrays;

public class UsingArraysClass{
	public static void main(String[] args){
		int[] numbers = {6,19,2,29,1,30,8,3,12,4};

		Arrays.sort(numbers);
		//Arrays.sort(numbers, 4,9); to specify the specific range to sort from
		int index  = Arrays.binarySearch(numbers,30);// for binary method
		
		System.out.printf("The index numbers off 30 is:%d%n",index);
		System.out.println("====================================");
		
		int[] arr1 = {1,6,3};// for  the equal mathod
		int[] arr2 = {1,2,3};
		boolean isEqual = Arrays.equals(arr1, arr2);
		
		System.out.printf("%b%n", isEqual);
		
		//filling an array
		int[] MyArrays = new int[5];
		
		Arrays.fill(MyArrays,20);
		
		//copying array
		int[] original = {1,2,3};
		int[] copy = Arrays.copyOf(original, 5);
		
		//converting arrays to Strings
		String[] copyArray = Arrays.toString(original, 5);
		
		System.out.printf("%s%n", copyArray);
		System.out.println("====================================");

		
		for(int compunent : MyArrays){
			System.out.printf("%d%n",compunent);
		}
		System.out.println("====================================");

		for(int element : numbers){
			System.out.printf("%d%n",element);
			
		}
		for(int value : copy){
			System.out.printf("%d%n",value);
		}
	}
}