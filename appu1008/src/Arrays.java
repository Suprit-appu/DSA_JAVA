
public class Arrays {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4};
		System.out.println(Arr);
		
		int start = 0;
		int end = arr.length;
		
		while (start < end)
		{
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
	}

}
