package Level03;

import java.io.*;
public class baekjoon_2438 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try{
            int size = Integer.parseInt(br.readLine());

            for(int i = 1; size >= i;i++){
                for(int j = 1; i >= j; j++ ){
                    bw.write("*");
                }
                bw.write("\n");
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

//    별 찍기 - 1
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	75604	45515	39678	61.901%
//        문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//        입력
//        첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//        출력
//        첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
//
//        예제 입력 1
//        5
//        예제 출력 1
//        *
//        **
//        ***
//        ****
//        *****
//        출처
//        문제를 만든 사람: baekjoon
//        문제의 오타를 찾은 사람: grace0068 hchanhong
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기
