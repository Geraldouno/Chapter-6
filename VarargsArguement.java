public class VarargsArguement{
	public static void main(String[] args){
	System.out.println(add(6,20,3,5,7,8,5,9));
		listOfNames("Pearl","Gift","Hope","Geraldine","Stephanie","Anani");
	}
// make the user give you whatever number using sentinel and an array
	public static int add(int...numbers){
		int sum = 0;
		for(int number: numbers){
			sum += number;
		}
		return sum;
	}
	public static void listOfNames(String...names){
		for(String name: names){
			System.out.printf("%s%n", name);
		}
	}
}