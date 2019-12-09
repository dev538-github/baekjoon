package Level05;

import java.io.*;
public class baekjoon_2577 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int array[] = {0,0,0,0,0,0,0,0,0,0};

        try{
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            int c = Integer.parseInt(br.readLine());

            String result = Integer.toString(a * b * c);

            for(int i = 0; result.length() > i; i++){
                switch(result.substring(i,i+1)) {
                    case "0" :  array[0] += 1; break;
                    case "1" :  array[1] += 1; break;
                    case "2" :  array[2] += 1; break;
                    case "3" :  array[3] += 1; break;
                    case "4" :  array[4] += 1; break;
                    case "5" :  array[5] += 1; break;
                    case "6" :  array[6] += 1; break;
                    case "7" :  array[7] += 1; break;
                    case "8" :  array[8] += 1; break;
                    case "9" :  array[9] += 1; break;
                }
            }

            for(int i = 0; array.length > i; i++){
                bw.write(array[i]+"\n");
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

//    숫자의 개수
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//1 초	128 MB	36310	22880	19405	63.771%
//        문제
//        세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
//
//        예를 들어 A = 150, B = 266, C = 427 이라면
//
//        A × B × C = 150 × 266 × 427 = 17037300 이 되고,
//
//        계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
//
//        입력
//        첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 1,000보다 작은 자연수이다.
//
//        출력
//        첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
//
//        예제 입력 1
//        150
//        266
//        427
//        예제 출력 1
//        3
//        1
//        0
//        2
//        0
//        0
//        0
//        2
//        0
//        0
//        출처
//        Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2006 > 초등부 2번
//
//        문제의 오타를 찾은 사람: pineapple
//        잘못된 데이터를 찾은 사람: tncks0121
//        알고리즘 분류
//        보기
//
//        메모