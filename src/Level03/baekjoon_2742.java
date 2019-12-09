package Level03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class baekjoon_2742 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int size = Integer.parseInt(br.readLine());

            for(int i=size; i > 0 ; i-- ){
                bw.write(i+"\n");
            }
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){};
            if(bw!=null)try{bw.close();}catch(IOException e){};
        }
    }
}

//    기찍 N 성공
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	59062	37728	34278	65.544%
//        문제
//        자연수 N이 주어졌을 때, N부터 1까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
//
//        출력
//        첫째 줄부터 N번째 줄 까지 차례대로 출력한다.
//
//        예제 입력 1
//        5
//        예제 출력 1
//        5
//        4
//        3
//        2
//        1
//        출처
//        문제를 만든 사람: baekjoon
//        잘못된 데이터를 찾은 사람: rory143
//        비슷한 문제
//        2741번. N 찍기
//        알고리즘 분류
//        출력
//        메모
