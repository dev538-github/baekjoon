package Level07;

import java.io.*;
public class baekjoon_1157 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{

            int maxCnt = Integer.MIN_VALUE;
            char result = '?';

            // 데이터 입력, 대문자로변경
            String inputData = br.readLine();

            // 앞파벳크기만큼 생성
            int[] charCnt = new int[26];

            // 각 글자 갯수를 arr 배열에 저장
            for(int i=0; inputData.length() > i; i++) {
                int idx = Character.toUpperCase(inputData.charAt(i)) - 'A';
                charCnt[idx]++;
            }

            for(int i=0; 26 > i; i++){
                if(charCnt[i] > maxCnt){
                    result = (char) (i + 65);
                    maxCnt = charCnt[i];
                }else if(charCnt[i] == maxCnt){
                    result = '?';
                }
            }
            //결과 출력
            bw.write(result + "\n");
            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//    단어 공부
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//      2 초	128 MB	44723	16733	13463	38.041%
//        문제
//        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 단, 대문자와 소문자를 구분하지 않는다.
//
//        입력
//        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
//
//        출력
//        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
//
//        예제 입력 1
//        Mississipi
//        예제 출력 1
//        ?
//        예제 입력 2
//        zZa
//        예제 출력 2
//        Z
//        예제 입력 3
//        z
//        예제 출력 3
//        Z
//        예제 입력 4
//        baaa
//        예제 출력 4
//        A
//        출처
//        문제를 만든 사람: author5
//        데이터를 추가한 사람: jh05013
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기