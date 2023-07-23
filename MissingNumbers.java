package arrayslinkedlist;

public class MissingNumber {
	static void missingElement(int arr[],int n) {
		
		int diff = arr[0];
		for(int i = 0;i<n;i++) {
			
			if(arr[i]-i != diff) {
				
				while(diff < arr[i]-i) {
					System.out.print((i + diff)+" ");
					diff += 1;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 5, 6, 8, 10, 11, 14};
		int n = arr.length;
		missingElement(arr,n);
		
		}

	}


