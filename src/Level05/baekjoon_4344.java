package Level05;

import java.io.*;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
public class baekjoon_4344 {
    public static void main(String [] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        DecimalFormat df = new DecimalFormat("0.000%");// 포멧

        try{
            int size = Integer.parseInt(br.readLine());

            for(int i=0; size > i; i++){
                st = new StringTokenizer(br.readLine());
                int num = Integer.parseInt(st.nextToken()); // 학생수
                int socre = 0; // 합계점수
                int array[] = new int[num]; // 점수배열
                double result = 0; // 결과

                // 점수넣기
                for(int j=0; num > j; j++){
                    array[j] = Integer.parseInt(st.nextToken());
                    socre += array[j];
                }

                //평균점수
                int avg = socre / num;
                int cutlineCnt =  0;

                for(int k=0; array.length > k; k++){
                    if(array[k] > avg){
                        cutlineCnt++;
                    }
                }
                // 최종 비율
                // 반올림
                result =  (Math.round((double)cutlineCnt / num * 100000.0)/100000.0);
                bw.write(df.format(result)+"\n");
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

//    평균은 넘겠지
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//1 초	256 MB	51426	19065	16688	38.683%
//        문제
//        대학생 새내기들의 90%는 자신이 반에서 평균은 넘는다고 생각한다. 당신은 그들에게 슬픈 진실을 알려줘야 한다.
//
//        입력
//        첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//        둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//        출력
//        각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.
//
//        예제 입력 1
//        5
//        5 50 50 70 80 100
//        7 100 95 90 80 70 60 50
//        3 70 90 80
//        3 70 90 81
//        9 100 99 98 97 96 95 94 93 91
//        예제 출력 1
//        40.000%
//        57.143%
//        33.333%
//        66.667%
//        55.556%
//        출처
//        Contest > Waterloo's local Programming Contests > 28 September, 2002 D번
//
//        문제를 번역한 사람: busyhuman
//        문제의 오타를 찾은 사람: choiking10 eric00513
//        어색한 표현을 찾은 사람: djm03178
//        링크
//        PKU Judge Online
//        ZJU Online Judge
//        TJU Online Judge
//        메모
//        메모 작성하기