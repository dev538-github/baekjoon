package Level05;

import java.io.*;
import java.util.stream.IntStream;

public class baekjoon_3052 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String temp[] = new String[10];
        int array[] = new int [10]; // 나머지값
        IntStream stream ;
        final int num = 42; // 42 고정값

        try{
            for(int i=0; 10 > i; i++){
                temp[i] = br.readLine();
                array[i] = Integer.parseInt(temp[i]) % num;
            }

            //나머지 중복제거
            stream = IntStream.of(array).distinct();

            bw.write(stream.count()+"\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}

        }
    }
}

//나머지
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	12900	8238	7518	66.797%
//        문제
//        두 자연수 A와 B가 있을 때, A%B는 A를 B로 나눈 나머지 이다. 예를 들어, 7, 14, 27, 38을 3으로 나눈 나머지는 1, 2, 0, 2이다.
//
//        수 10개를 입력받은 뒤, 이를 42로 나눈 나머지를 구한다. 그 다음 서로 다른 값이 몇 개 있는지 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄부터 열번째 줄 까지 숫자가 한 줄에 하나씩 주어진다. 이 숫자는 1,000보다 작거나 같고, 음이 아닌 정수이다.
//
//        출력
//        첫째 줄에, 42로 나누었을 때, 서로 다른 나머지가 몇 개 있는지 출력한다.
//
//        예제 입력 1
//        39
//        40
//        41
//        42
//        43
//        44
//        82
//        83
//        84
//        85
//        예제 출력 1
//        6
//        힌트
//        39, 40, 41, 42, 43, 44, 82, 83, 84, 85를 42로 나눈 나머지는 39, 40, 41, 0, 1, 2, 40, 41, 0, 1이다. 서로 다른 값은 모두 6개가 있다.
//
//        출처
//        Contest > Croatian Open Competition in Informatics > COCI 2006/2007 > Contest #1 1번
//
//        문제를 번역한 사람: baekjoon
//        알고리즘 분류
//        보기
//
//        메모