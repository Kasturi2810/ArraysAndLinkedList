import java.util.*;
public class test {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            Deque deque = new ArrayDeque<>();
            
            HashSet<Integer> hs = new HashSet<>();
            int n = in.nextInt();
            int m = in.nextInt();
            int cnt = 0 ;
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();
            }
            
            for(int i = 0 ; i < n ; i++){
                deque.add(arr[i]);
                if(deque.size()>m){
                    Object removed = deque.removeFirst();
                    if(!deque.contains(removed)){
                        hs.remove(removed);
                    }
                }
                hs.add(arr[i]);
                if(hs.size()>cnt){
                    cnt = hs.size();
                }
            }
            System.out.println(cnt);
        }
    }



