package Level02;

import java.util.Scanner;
public class baekjoon_9498 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();

        if(value >= 90 && value <= 100){
            System.out.println("A");
        }else if(value >= 80 && value <= 89){
            System.out.println("B");
        }else if(value >= 70 && value <= 79){
            System.out.println("C");
        }else if(value >= 60 && value <= 69){
            System.out.println("D");
        }else {
            System.out.println("F");
        }
    }
}

/*
* 시험 성적
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	128 MB	61721	36368	32816	60.888%
문제
시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.

출력
시험 성적을 출력한다.

예제 입력 1
100
예제 출력 1
A
출처
문제를 만든 사람: baekjoon
문제의 오타를 찾은 사람: bessapple14
* */