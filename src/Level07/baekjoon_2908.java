package Level07;

import java.io.*;
import java.util.StringTokenizer;
public class baekjoon_2908 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try{
            String beforeA,beforeB;
            int afterA,afterB;


            StringTokenizer st = new StringTokenizer(br.readLine());

            beforeA = st.nextToken();
            beforeB = st.nextToken();

            afterA = Integer.parseInt(beforeA.substring(2,3) + beforeA.substring(1,2) + beforeA.substring(0,1));
            afterB = Integer.parseInt(beforeB.substring(2,3) + beforeB.substring(1,2) + beforeB.substring(0,1));

            bw.write(Math.max(afterA,afterB) + "\n");

            bw.flush();
        }catch(IOException e){
            e.printStackTrace();
        }finally{
            if(br!=null)try{br.close();}catch(IOException e){}
            if(bw!=null)try{bw.close();}catch(IOException e){}
        }

    }
}
