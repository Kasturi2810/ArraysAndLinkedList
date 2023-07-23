package arrayslinkedlist;
public class SingularSocks {
	public static void singleSocks(int arr[],int n) {
		
		int max = Integer.MIN_VALUE;
		for(int i : arr) {
			if(i > max) {
				max = i;
			}
		}
		int unique[] = new int[max+1];
		for(int num : arr) {
			unique[num]++;
		}
		int occ = 0;
		for(int i =0;i<=max;i++) {
			if(unique[i] >0) {
				int c = unique[i] %2;
		
				if(c !=0 ) {
					occ = occ + c;
				}
			}
		}
		System.out.println(occ);
	}
  public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 20, 20, 10, 10, 30, 50, 10, 20};
		int n = arr.length;
		singleSocks(arr,n);

	}

}
