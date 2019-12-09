package Level03;

import java.io.*;

public class baekjoon_2439 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int size = Integer.parseInt(br.readLine());

            for(int i=1; size >= i; i++ ){

                for(int j=1; size >= j; j++){

                    if(size - j >= i){
                        bw.write(" ");
                    }else {
                        bw.write("*");
                    }
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

//    별 찍기 - 2
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	64989	37460	33658	59.289%
//        문제
//        첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//        하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
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
//            *
//           **
//          ***
//         ****
//        *****
//        출처
//        문제를 만든 사람: baekjoon
//        문제의 오타를 찾은 사람: namnamseo
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기
//

