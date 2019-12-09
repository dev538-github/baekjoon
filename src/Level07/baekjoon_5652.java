package Level07;

import java.io.*;
public class baekjoon_5652 {
    public static void main(String[] args){

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{

            String number = br.readLine();
            int time = 0;

            for(int i=0; number.length() > i; i++){
                char daieol = number.charAt(i);

                if(daieol >= 65 && daieol <= 67){ // 2
                    time += 3;
                }else if(daieol >= 68 && daieol <= 70){ // 3
                    time += 4;
                }else if(daieol >= 71 && daieol <= 73){ // 4
                    time += 5;
                }else if(daieol >= 74 && daieol <= 76){ // 5
                    time += 6;
                }else if(daieol >= 77 && daieol <= 79){ // 6
                    time += 7;
                }else if(daieol >= 80 && daieol <= 83){ // 7
                    time += 8;
                }else if(daieol >= 84 && daieol <= 86){ // 8
                    time += 9;
                }else if(daieol >= 87 && daieol <= 90){ // 9
                    time += 10;
                }else if(daieol == 1){
                    time += 2;
                }else if(daieol == 0){
                    time += 11;
                }
            }

            bw.write(time + "\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }
    }
}

//        다이얼
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        1 초	128 MB	19824	11326	10290	57.920%
//        문제
//        상근이의 할머니는 아래 그림과 같이 오래된 다이얼 전화기를 사용한다.
//
//        전화를 걸고 싶은 번호가 있다면, 숫자를 하나를 누른 다음에 금속 핀이 있는 곳 까지 시계방향으로 돌려야 한다. 숫자를 하나 누르면 다이얼이 처음 위치로 돌아가고, 다음 숫자를 누르려면 다이얼을 처음 위치에서 다시 돌려야 한다.
//
//        숫자 1을 걸려면 총 2초가 필요하다. 1보다 큰 수를 거는데 걸리는 시간은 이보다 더 걸리며, 한 칸 옆에 있는 숫자를 걸기 위해선 1초씩 더 걸린다.
//
//        상근이의 할머니는 전화 번호를 각 숫자에 해당하는 문자로 외운다. 즉, 어떤 단어를 걸 때, 각 알파벳에 해당하는 숫자를 걸면 된다. 예를 들어, UNUCIC는 868242와 같다.
//
//        할머니가 외운 단어가 주어졌을 때, 이 전화를 걸기 위해서 필요한 시간을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 알파벳 대문자로 이루어진 단어가 주어진다. 단어는 2글자~15글자로 이루어져 있다.
//
//        출력
//        첫째 줄에 다이얼을 걸기 위해서 필요한 시간을 출력한다.
//
//        예제 입력 1
//        UNUCIC
//        예제 출력 1
//        36
//        출처
//        Contest > Croatian Open Competition in Informatics > COCI 2012/2013 > Contest #6 1번
//
//        문제를 번역한 사람: baekjoon
//        잘못된 번역을 찾은 사람: jung2381187
//        문제의 오타를 찾은 사람: pskalyber
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기