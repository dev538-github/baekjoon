package Level05;

import java.io.*;
import java.util.StringTokenizer;
public class baekjoon_10818 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int size = Integer.parseInt(br.readLine());
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            int num = 0;

            StringTokenizer st = new StringTokenizer(br.readLine()," ");



            for(int i=0; i < size; i++ ){
                num = Integer.parseInt(st.nextToken());

                min = Math.min(min,num);
                max = Math.max(max,num);
            }

            bw.write(min + " " + max);
            bw.flush();


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//최소, 최대 성공
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	256 MB	28906	13262	11004	47.593%
//        문제
//        N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
//
//        예제 입력 1
//        5
//        20 10 35 30 7
//        예제 출력 1
//        7 35
//        출처
//        문제를 만든 사람: baekjoon
//        데이터를 추가한 사람: topology
//        메모
//        메모 작성하기