package arrayslinkedlist;
import java.util.*;
public class Cumulative {

	public static void main(String[] args)  {
		int arrNum[] = {5,3,4,2,0,8};
		try {
            cumulativeMultiple(arrNum);
        } 
		catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
  }
	public static void cumulativeMultiple(int[] arrNum) {
    if (arrNum.length == 0) {
            throw new ArithmeticException("Array must not be empty.");
    }
    int temp = 1;
    for(int i = 0;i<arrNum.length;i++) {
      arrNum[i] = temp*arrNum[i];
		  temp = arrNum[i];
		}
      System.out.println("arrNum = " + Arrays.toString(arrNum));
    }
}
