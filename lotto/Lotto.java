package lotto;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by taemi on 2017-07-01.
 */
public class Lotto {

    int[] nums;

    public Lotto(){
    }

    public Lotto(int[] nums){
        this.nums = nums;
        // sort

    }

    // 티켓 갯수에 따라 로또 생성
    public ArrayList genLottos(int Tickets){
        ArrayList result = new ArrayList();
        for (int i = 0; i < Tickets ; i++) {
            result.add(genRandomArray());
        }
        return result;
    }

    // 6개 숫자로 구성된 하나의 로또 생성
    public int[] genRandomArray(){
        int[] result = new int[6];
        for (int i = 0; i < result.length ; i++) {
            double randomvalue = Math.random();
            int random = (int)(randomvalue*45)+1;
            result[i] = random;
        }
        System.out.println(Arrays.toString(result));
        return  result;
    }

    public int[] calCorrects(ArrayList lottos, int[] winNum){
        int[] result = new int[4];
        int three, four, five, six;
        System.out.println(lottos.get(0));
        return result;
    }
}
