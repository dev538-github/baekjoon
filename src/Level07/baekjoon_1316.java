package Level07;

import java.io.*;
public class baekjoon_1316 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            // 개수
            int size = Integer.parseInt(br.readLine());
            int cnt = 0;

            // 입력받을 개수만큼 반
            for(int i = 0; size > i; i++){
                String text = br.readLine();

                // 그룹단어일시 값 증가
                if(groupCnt(text)) cnt++;
            }

            bw.write(cnt + "\n");


        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }

    }

    /**
     * @Desc : 입력받은 문자가 그룹카운트인지 확인하여 true/false로 return
     * @param param
     * @return boolean
     */
    public static boolean groupCnt(String param){

        int alphabetNumber[] = new int[26];
        String beforeChar = "";

        for(int j = 0; param.length() > j; j++){

            int idx = Character.toLowerCase(param.charAt(j)) - 'a';
            alphabetNumber[idx]++;

            // 이전 문자와 다른경우
            if(!beforeChar.equals(Character.toString(param.charAt(j))) && alphabetNumber[idx] > 1){
                return false;
            }

            // 이전문자 저장
            beforeChar = Character.toString(param.charAt(j));
        }
        return true;
    }
}

//    그룹 단어 체커
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        2 초	128 MB	23233	11645	10193	51.634%
//        문제
//        그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.
//
//        단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 둘째 줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.
//
//        출력
//        첫째 줄에 그룹 단어의 개수를 출력한다.
//
//        예제 입력 1
//        3
//        happy
//        new
//        year
//        예제 출력 1
//        3
//        예제 입력 2
//        4
//        aba
//        abab
//        abcabc
//        a
//        예제 출력 2
//        1
//        출처
//        문제를 번역한 사람: baekjoon
//        데이터를 추가한 사람: jh05013
//        문제의 오타를 찾은 사람: joonas
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기