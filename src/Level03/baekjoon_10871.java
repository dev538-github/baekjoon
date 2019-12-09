package Level03;

import java.io.*;

public class baekjoon_10871 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String temp[] = br.readLine().split(" ");
            int size = Integer.parseInt(temp[0]);
            int num = Integer.parseInt(temp[1]);

            String array[] = br.readLine().split(" ");

            for(int i=0; size > i; i++){
                if(Integer.parseInt(array[i]) < num){
                    bw.write(array[i]+" ");
                }
            }
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}
//    X보다 작은 수
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	256 MB	52931	29944	25944	57.903%
//        문제
//        정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
//
//        둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
//
//        출력
//        X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.
//
//        예제 입력 1
//        10 5
//        1 10 4 9 2 3 8 5 7 6
//        예제 출력 1
//        1 4 2 3
//        출처
//        문제의 오타를 찾은 사람: jh82582 thinksong1
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기