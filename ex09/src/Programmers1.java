import java.util.Arrays;

public class Programmers1 {
}
class Solution {
    public int[] solution(int n, int k) {

        int star = 1;
        int[] result = new int[n+1];
        for(int i = 0;  result < n; i++){
            result[i] = k* (k * star);
            star++;
        }
        return result;
    }
}
