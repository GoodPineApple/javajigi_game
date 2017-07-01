package lotto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by taemi on 2017-07-01.
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println("구입금액을 입력해주세요.");
        Scanner scan = new Scanner(System.in);

        int input = scan.nextInt();
        int Tickets = calTickets(input);
        ArrayList lottos = genLottos(Tickets);
    
        System.out.println();
        System.out.println("지난주 당첨번호를 입력해주세요.");
        String correct = scan.next();

        String[] winNumStr = correct.split(",");
        int[] winNum = new int[winNumStr.length];
        for (int i = 0; i < winNumStr.length ; i++) {
            winNum[i] = Integer.parseInt(winNumStr[i]);
        }

        int[] result = calCorrects(lottos, winNum);

        System.out.println();
        System.out.println("당첨 통계");
        System.out.println("-------");
    }

    public static int calTickets(int input){
        int TicketNums = input / 1000;
        return TicketNums;
    }

    // 티켓 갯수에 따라 로또 생성
    public static ArrayList genLottos(int Tickets){
        ArrayList result = new ArrayList();
        for (int i = 0; i < Tickets ; i++) {
            result.add(genRandomArray());
        }
        return result;
    }

    // 6개 숫자로 구성된 하나의 로또 생성
    public static int[] genRandomArray(){
        int[] result = new int[6];
        for (int i = 0; i < result.length ; i++) {
            double randomvalue = Math.random();
            int random = (int)(randomvalue*45)+1;
            result[i] = random;
        }
        System.out.println(Arrays.toString(result));
        return  result;
    }

    public static int[] calCorrects(ArrayList lottos, int[] winNum){
        int[] result = new int[4];
        int three, four, five, six;
        System.out.println(lottos.get(0));
        return result;
    }
}
