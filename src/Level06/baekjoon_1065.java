package Level06;

import java.io.*;
public class baekjoon_1065 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int third, second, first;
            int cnt = 0;

            // 입력받기
            int num = Integer.parseInt(br.readLine());
            int temp;

            //99 이하 한수
            if(num <= 99){
                cnt = num;

            // 100 이상 한수 구하기
            }else{
                cnt  = 99;

                //한수 구하기
                for(int i = 1; num >= 99 + i; i++){

                    temp = 99 + i;

                    third = temp / 100;
                    second = temp % 100 / 10;
                    first = temp % 100 % 10 / 1;

                    if(third - second == second - first) cnt++;
                }

            }

            bw.write(cnt + "\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();

        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//        한수
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        2 초	128 MB	37953	17934	15478	47.955%
//        문제
//        어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//
//        출력
//        첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
//
//        예제 입력 1
//        110
//        예제 출력 1
//        99
//        예제 입력 2
//        1
//        예제 출력 2
//        1
//        예제 입력 3
//        210
//        예제 출력 3
//        105
//        예제 입력 4
//        1000
//        예제 출력 4
//        144
//        출처
//        문제를 번역한 사람: baekjoon
//        데이터를 추가한 사람: jh05013
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기
