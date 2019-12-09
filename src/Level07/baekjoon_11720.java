package Level07;

import java.io.*;
public class baekjoon_11720 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            //데이터 입력
            int size = Integer.parseInt(br.readLine());
            String data = br.readLine();
            int sum = 0;

            // 자립별로 더하기
            for(int i = 0; size > i; i++){
                sum += Integer.parseInt(String.valueOf(data.charAt(i)));
            }

            //데이터 출력
            bw.write(sum + "\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//    숫자의 합
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//1 초	256 MB	58753	26510	23049	47.614%
//        문제
//        N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
//
//        출력
//        입력으로 주어진 숫자 N개의 합을 출력한다.
//
//        예제 입력 1
//        1
//        1
//        예제 출력 1
//        1
//        예제 입력 2
//        5
//        54321
//        예제 출력 2
//        15
//        예제 입력 3
//        25
//        7000000000000000000000000
//        예제 출력 3
//        7
//        예제 입력 4
//        11
//        10987654321
//        예제 출력 4
//        46
//        출처
//        문제를 만든 사람: baekjoon
//        데이터를 추가한 사람: jh05013
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기