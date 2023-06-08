import java.util.Arrays;
public class prog1 {
	public static int[] removeDuplicates(int[] arr) {
		return Arrays.stream(arr).distinct().toArray();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,4,5};
		System.out.println(Arrays.toString(arr));
		int[] distinct = removeDuplicates(arr);
		System.out.println(Arrays.toString(distinct));
	}

}
