package BasicPrograms;

public class SumTest {

	public static void main(String[] args) {
//		WAP to find sum of 10 integers and print the sum with a proper SOP statement.
//		using for loop 
		
		int [] arr= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("Sum of Ten integers :"+sum);
		
	}

}
