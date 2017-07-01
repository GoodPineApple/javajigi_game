package numbers;

import java.util.Scanner;

/**
 * Created by taemi on 2017-07-01.
 */
public class Solution {
    public static void main(String[] args) {
        double randomvalue = Math.random();
        int goal = (int)(randomvalue * 100) + 1;
        System.out.println("숫자 맞추기 게임에 오신 것을 환영합니다.");
        System.out.println("숫자를 입력해 주세요(0~100)");
        Scanner scan = new Scanner(System.in);
        int cycleCnt = 1;
        for (int i = 0; i < cycleCnt; i++) {
            int input = scan.nextInt();
            if(goal<input){
                System.out.println(input + "보다 작아요.");
            } else if(goal>input){
                System.out.println(input + "보다 커요.");
            } else {
                System.out.println(cycleCnt + "번만에 맞췄습니다!");
            }
        }
        System.out.println("플레이해주셔서 감사합니다.");
    }
}
