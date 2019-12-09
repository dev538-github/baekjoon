package Level07;

import java.io.*;
public class baekjoon_11654 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            // 입력받기
            String inputData = br.readLine();
            // 입력데이터 ASCII로 표현하기
            byte[] byteText = inputData.getBytes();

            // 출력
            bw.write(byteText[0]+"\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();

        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//    아스키 코드
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//      1 초	256 MB	26409	21240	19310	82.272%
//        문제
//        알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.
//
//        입력
//        알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.
//
//        출력
//        입력으로 주어진 글자의 아스키 코드 값을 출력한다.
//
//        예제 입력 1
//        A
//        예제 출력 1
//        65
//        예제 입력 2
//        C
//        예제 출력 2
//        67
//        예제 입력 3
//        0
//        예제 출력 3
//        48
//        예제 입력 4
//        9
//        예제 출력 4
//        57
//        예제 입력 5
//        a
//        예제 출력 5
//        97
//        예제 입력 6
//        z
//        예제 출력 6
//        122
//        출처
//        문제를 만든 사람: baekjoon
//        문제의 오타를 찾은 사람: eric00513
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기