package Level07;

import java.io.*;
public class baekjoon_1152 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{

            String inputData = br.readLine().trim();
            if(inputData.isEmpty()){
                bw.write("0"); // 공백만 들어가는경우를 체크해야하는듯함 // 오답처리됨
            }else {
                bw.write(inputData.split(" ").length + "\n");
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

//    단어의 개수
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//2 초	128 MB	100440	24868	18458	25.060%
//        문제
//        영어 대소문자와 띄어쓰기만으로 이루어진 문자열이 주어진다. 이 문자열에는 몇 개의 단어가 있을까? 이를 구하는 프로그램을 작성하시오. 단, 한 단어가 여러 번 등장하면 등장한 횟수만큼 모두 세어야 한다.
//
//        입력
//        첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문자열이 주어진다. 이 문자열의 길이는 1,000,000을 넘지 않는다. 단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다. 또한 문자열의 앞과 뒤에는 공백이 있을 수도 있다.
//
//        출력
//        첫째 줄에 단어의 개수를 출력한다.
//
//        예제 입력 1
//        The Curious Case of Benjamin Button
//        예제 출력 1
//        6
//        예제 입력 2
//        Mazatneunde Wae Teullyeoyo
//        예제 출력 2
//        3
//        예제 입력 3
//        Teullinika Teullyeotzi
//        예제 출력 3
//        2
//        출처
//        문제를 만든 사람: author5
//        빠진 조건을 찾은 사람: djm03178 his130
//        데이터를 추가한 사람: jh05013
//        내용을 추가한 사람: jh05013
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기