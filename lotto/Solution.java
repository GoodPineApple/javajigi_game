package lotto;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        numbers.contains(3);


        // lotto를 한번에 하나씩 생성하고 lotto는 메인에서 관리하기.
        for (int i = 0; i < Tickets ; i++) {
        }
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


}
