package Level05;

import java.io.*;
public class baekjoon_1546 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int size;
        String temp[];
        int max = Integer.MIN_VALUE;
        double sum = 0;
        try{

        size = Integer.parseInt(br.readLine());
        temp = br.readLine().split(" ");

        //최고점수구하기
        for(int i=0; size > i;i ++){
            max = Math.max(max,Integer.parseInt(temp[i]));
        }

        // 점수조작
        for(int i=0; size > i; i ++){
            sum += (Double.parseDouble(temp[i]) / max) * 100;
        }

        bw.write(sum / size + "\n");
        bw.flush();

        }catch(IOException e){
            e.printStackTrace();;
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }

    }
}
//    평균 스페셜 저지
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        2 초	128 MB	46857	22211	18393	47.983%
//        문제
//        세준이는 기말고사를 망쳤다. 세준이는 점수를 조작해서 집에 가져가기로 했다. 일단 세준이는 자기 점수 중에 최댓값을 골랐다. 이 값을 M이라고 한다. 그리고 나서 모든 점수를 점수/M*100으로 고쳤다.
//
//        예를 들어, 세준이의 최고점이 70이고, 수학점수가 50이었으면 수학점수는 50/70*100이 되어 71.43점이 된다.
//
//        세준이의 성적을 위의 방법대로 새로 계산했을 때, 새로운 평균을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 시험 본 과목의 개수 N이 주어진다. 이 값은 1000보다 작거나 같다. 둘째 줄에 세준이의 현재 성적이 주어진다. 이 값은 100보다 작거나 같은 음이 아닌 정수이고, 적어도 하나의 값은 0보다 크다.
//
//        출력
//        첫째 줄에 새로운 평균을 출력한다. 정답과의 절대/상대 오차는 10-2까지 허용한다.
//
//        예제 입력 1
//        3
//        40 80 60
//        예제 출력 1
//        75.00
//        예제 입력 2
//        3
//        10 20 30
//        예제 출력 2
//        66.666667
//        예제 입력 3
//        4
//        1 100 100 100
//        예제 출력 3
//        75.25
//        예제 입력 4
//        5
//        1 2 4 8 16
//        예제 출력 4
//        38.75
//        예제 입력 5
//        2
//        3 10
//        예제 출력 5
//        65.00
//        출처
//        문제를 번역한 사람: baekjoon
//        데이터를 추가한 사람: ho94949 jh05013
//        빠진 조건을 찾은 사람: powdragon1
//        메모