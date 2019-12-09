package Level01;

import java.util.Scanner;

public class baekjoon_10998 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a*b);

    }
}

//    A×B
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//    1 초	256 MB	52831	40084	37486	77.141%
//    문제
//    두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
//
//    입력
//    첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//    출력
//    첫째 줄에 A×B를 출력한다.
//
//    예제 입력 1
//    1 2
//    예제 출력 1
//    2
//    예제 입력 2
//    3 4
//    예제 출력 2
//    12
//    출처
//    문제를 만든 사람: baekjoon
//    비슷한 문제
//    1000번. A+B
//    1001번. A-B
//    1008번. A/B
//    2558번. A+B - 2
//    10950번. A+B - 3
//    10951번. A+B - 4
//    10952번. A+B - 5
//    10953번. A+B - 6
//    11021번. A+B - 7
//    11022번. A+B - 8
//    15740번. A+B - 9
//    15792번. A/B - 2
//    알고리즘 분류
//    보기
//
//    메모
