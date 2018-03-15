package medium;

/**
 * Created by boyhe on 2018/2/5.
 */
public class CountingBits {

    public int[] countBits(int num) {
        int[] result = new int[num + 1];
        int point = 1;
        for(int i = 1; i < num + 1; i++){
            if(i == point * 2){
                result[i] = 1;
                point *= 2;
            }else {
                result[i] = result[i - point] + 1;
            }
        }
        return result;
    }
}
