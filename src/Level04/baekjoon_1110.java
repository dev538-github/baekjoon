package Level04;

import java.io.*;

public class baekjoon_1110 {
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num1,num2,sum;
        int cnt = 0;

        String temp ="";

        try{
            String num = br.readLine();
            String result = num;

            if(Integer.parseInt(result) < 10){
                num =  "0" + num;
                result = "0" + result;
            }

            while(true){
                // 반복횟수 증가하기
                cnt++;

                // 최초 1회
                num1 = Integer.parseInt(result.substring(0,1));
                num2 = Integer.parseInt(result.substring(1,2));

                if((sum = num1 + num2) < 10){
                    temp = "0" + Integer.toString(sum);
                }else {
                    temp = Integer.toString(sum);
                }

                result = num2 + temp.substring(1,2);

                // 조건에 맞으면 정지
                if(num.equals(result)){
                    break;
                }
            }

            // 결과
            bw.write(cnt + " \n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!= null)try{br.close();}catch(IOException e){};
            if(bw!= null)try{bw.close();}catch(IOException e){};
        }
    }
}

//    더하기 사이클
//    시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//2 초	128 MB	53163	25851	22155	49.736%
//        문제
//        0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
//
//        26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
//
//        위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//
//        N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//
//        출력
//        첫째 줄에 N의 사이클 길이를 출력한다.
//
//        예제 입력 1
//        26
//        예제 출력 1
//        4
//        예제 입력 2
//        55
//        예제 출력 2
//        3
//        예제 입력 3
//        1
//        예제 출력 3
//        60
//        출처
//        문제를 번역한 사람: baekjoon
//        어색한 표현을 찾은 사람: doju
//        문제의 오타를 찾은 사람: eric00513
//        데이터를 추가한 사람: jh05013
//        알고리즘 분류
//        보기
//
//        메모