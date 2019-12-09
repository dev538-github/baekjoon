package Level03;

import java.util.Scanner;
public class baekjoon_8393 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int sum = 0;

        for(int i=0; i <= num; i++){
            sum += i;
        }

        System.out.println(sum);
    }
}

//합
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	47871	34118	30702	72.650%
//        문제
//        n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//        출력
//        1부터 n까지 합을 출력한다.
//
//        예제 입력 1
//        3
//        예제 출력 1
//        6
//        출처
//        Contest > Algorithmic Engagements > PA 2006 0-1번
//
//        문제를 번역한 사람: baekjoon
//        메모