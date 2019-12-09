package Level06;

import java.io.*;
public class baekjoon_4673 {
    public static void main(String[] args){

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int num = 0;
            int[] array = new int[10001];
            String temp = null;

            for(int i = 0; i <= 10000; i++){
                num = i; // 초기화
                temp = Integer.toString(i);

                //각 자리수 더하기로직
                for(int j=0; temp.length() > j; j++){
                    num = num + Integer.parseInt(temp.substring(j,j+1));
                }

                if(num <= 10000){
                    array[num] = 1;
                }
            }
            // 셀프넘버 출력
            for(int i = 0; i <= 10000; i++){
                if(array[i] != 1){
                    bw.write(i + "\n");
                }
            }

            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//    셀프 넘버
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//1 초	256 MB	36484	18904	15279	52.661%
//        문제
//        셀프 넘버는 1949년 인도 수학자 D.R. Kaprekar가 이름 붙였다. 양의 정수 n에 대해서 d(n)을 n과 n의 각 자리수를 더하는 함수라고 정의하자. 예를 들어, d(75) = 75+7+5 = 87이다.
//
//        양의 정수 n이 주어졌을 때, 이 수를 시작해서 n, d(n), d(d(n)), d(d(d(n))), ...과 같은 무한 수열을 만들 수 있다.
//
//        예를 들어, 33으로 시작한다면 다음 수는 33 + 3 + 3 = 39이고, 그 다음 수는 39 + 3 + 9 = 51, 다음 수는 51 + 5 + 1 = 57이다. 이런식으로 다음과 같은 수열을 만들 수 있다.
//
//        33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
//
//        n을 d(n)의 생성자라고 한다. 위의 수열에서 33은 39의 생성자이고, 39는 51의 생성자, 51은 57의 생성자이다. 생성자가 한 개보다 많은 경우도 있다. 예를 들어, 101은 생성자가 2개(91과 100) 있다.
//
//        생성자가 없는 숫자를 셀프 넘버라고 한다. 100보다 작은 셀프 넘버는 총 13개가 있다. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
//
//        10000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//        입력
//        입력은 없다.
//
//        출력
//        10,000보다 작거나 같은 셀프 넘버를 한 줄에 하나씩 증가하는 순서로 출력한다.
//
//        예제 입력 1
//        예제 출력 1
//        1
//        3
//        5
//        7
//        9
//        20
//        31
//        42
//        53
//        64
//        |
//        |       <-- a lot more numbers
//        |
//        9903
//        9914
//        9925
//        9927
//        9938
//        9949
//        9960
//        9971
//        9982
//        9993
//        출처
//        ACM-ICPC > Regionals > North America > Mid-Central Regional > 1998 Mid-Central Regional Programming Contest D번
//
//        문제를 번역한 사람: baekjoon
//        문제의 오타를 찾은 사람: eric00513
//        링크
//        ACM-ICPC Live Archive
//        PKU Judge Online
//        ZJU Online Judge
//        TJU Online Judge
//        HDU Online Judge
//        알고리즘 분류
//        에라토스테네스의 체
//        입문용
//        채점
//        예제는 채점하지 않는다.
//        메모
//        메모 작성하기