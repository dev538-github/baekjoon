package Level05;

import java.io.*;

public class baekjoon_8958 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            int size = Integer.parseInt(br.readLine());
            String array[] = new String[size];
            for(int i=0; size > i; i++){

                // 문제읽기
                array[i] = br.readLine();

                //OX 문제 점수 카운트하기
                int cnt = 0;
                int score = 0;
                for(int j=0; array[i].length() > j; j++){

                    //OX 점수구분하기
                    if("O".equals(array[i].substring(j,j+1))){
                        score = score +  cnt + 1;
                        cnt++;
                    }else {
                        cnt = 0;
                    }
                }
                //점수
                bw.write(score+ "\n");
            }

            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e ){}
            if(bw!=null)try{bw.close();}catch(IOException e ){}
        }
    }
}

//OX퀴즈
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	34870	18424	16138	55.077%
//        문제
//        "OOXXOXXOOO"와 같은 OX퀴즈의 결과가 있다. O는 문제를 맞은 것이고, X는 문제를 틀린 것이다. 문제를 맞은 경우 그 문제의 점수는 그 문제까지 연속된 O의 개수가 된다. 예를 들어, 10번 문제의 점수는 3이 된다.
//
//        "OOXXOXXOOO"의 점수는 1+2+0+0+1+0+0+1+2+3 = 10점이다.
//
//        OX퀴즈의 결과가 주어졌을 때, 점수를 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 테스트 케이스의 개수가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, 길이가 0보다 크고 80보다 작은 문자열이 주어진다. 문자열은 O와 X만으로 이루어져 있다.
//
//        출력
//        각 테스트 케이스마다 점수를 출력한다.
//
//        예제 입력 1
//        5
//        OOXXOXXOOO
//        OOXXOOXXOO
//        OXOXOXOXOXOXOX
//        OOOOOOOOOO
//        OOOOXOOOOXOOOOX
//        예제 출력 1
//        10
//        9
//        7
//        55
//        30
//        출처
//        ACM-ICPC > Regionals > Asia > Korea > Asia Regional - Seoul 2005 A번
//
//        문제를 번역한 사람: baekjoon
//        문제의 오타를 찾은 사람: jh82582
//        링크
//        ACM-ICPC Live Archive
//        TJU Online Judge
//        메모