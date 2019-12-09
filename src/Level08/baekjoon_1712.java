package Level08;

import java.io.*;
public class baekjoon_1712 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String input[] = br.readLine().split(" ");

            long a = Integer.parseInt(input[0]); // 임대료,고정금액
            long b = Integer.parseInt(input[1]); // 생산비용(가변) * cnt
            long c = Integer.parseInt(input[2]); // 판매금액      * cnt

            int cnt = 0;
            do{
                //손익분기점이 존재하지않은경우
                if(b >= c){
                    cnt = -1;
                    break;
                }

                cnt++;
            }while(a + (b * cnt) >= c * cnt);

            bw.write(cnt + "\n");
            bw.flush();

        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }

    }
}
//      손익분기점
//        시간 제한	메모리 제한	제출	정답	맞은 사람	정답 비율
//        0.35 초	128 MB	24703	5910	5265	25.505%
//        문제
//        월드전자는 노트북을 제조하고 판매하는 회사이다. 노트북 판매 대수에 상관없이 매년 임대료, 재산세, 보험료, 급여 등 A만원의 고정 비용이 들며, 한 대의 노트북을 생산하는 데에는 재료비와 인건비 등 총 B만원의 가변 비용이 든다고 한다.
//
//        예를 들어 A=1,000, B=70이라고 하자. 이 경우 노트북을 한 대 생산하는 데는 총 1,070만원이 들며, 열 대 생산하는 데는 총 1,700만원이 든다.
//
//        노트북 가격이 C만원으로 책정되었다고 한다. 일반적으로 생산 대수를 늘려 가다 보면 어느 순간 총 수입(판매비용)이 총 비용(=고정비용+가변비용)보다 많아지게 된다. 최초로 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점(BREAK-EVEN POINT)이라고 한다.
//
//        A, B, C가 주어졌을 때, 손익분기점을 구하는 프로그램을 작성하시오.
//
//        입력
//        첫째 줄에 A, B, C가 빈 칸을 사이에 두고 순서대로 주어진다. A, B, C는 21억 이하의 자연수이다.
//
//        출력
//        첫 번째 줄에 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 손익분기점이 존재하지 않으면 -1을 출력한다.
//
//        예제 입력 1
//        1000 70 170
//        예제 출력 1
//        11
//        노트
//        이 문제에서 설명하는 손익분기점은 회계학에서 정의하는 손익분기점과 다를 수 있다.
//
//        출처
//        문제를 번역한 사람: author5
//        데이터를 추가한 사람: djm03178
//        알고리즘 분류
//        보기
//
//        메모
//        메모 작성하기