package Level02;

import java.util.Scanner;
public class baekjoon_10817 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        [방벙1 if문 만으로 비교하기]
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        if(num1 > num2) {
            if(num1 > num3) {
                if(num2 > num3){
                    System.out.println(num2);
                }else{
                    System.out.println(num3);
                }
            }else{
                System.out.println(num1);
            }
        }else {
            if(num2 > num3) {

                if(num1 > num3){
                    System.out.println(num1);
                }else {
                    System.out.println(num3);
                }
            }else {
                System.out.println(num2);
            }

        }
//        [방법2 for문 반복문으로 사용하기]
//        int array[] = new int[3];
//        int tmp = 0;
//        for(int i=0; array.length > i; i++){
//            array[i] = scanner.nextInt();
//        }

//        for(int i=0; i < 3; i++){
//            for(int j=0; j < 2; j++){
//
//                if(array[j] > array[j+1]){
//                    tmp = array[j];
//                    array[j] = array[j+1];
//                    array[j+1] = tmp;
//                }
//
//            }
//        }

//        for(int i=0; array.length > i; i++){
//            System.out.println(array[i]);
//        }
//        System.out.println(array[1]);

    }

}

/*
* 세 수
시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
1 초	256 MB	70865	31490	27832	46.690%
문제
세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)

출력
두 번째로 큰 정수를 출력한다.

예제 입력 1
20 30 10
예제 출력 1
20
예제 입력 2
30 30 10
예제 출력 2
30
예제 입력 3
40 40 40
예제 출력 3
40
예제 입력 4
20 10 10
예제 출력 4
10
출처
문제를 만든 사람: baekjoon
메모
* */