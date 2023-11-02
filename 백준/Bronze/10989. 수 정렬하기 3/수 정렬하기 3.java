import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] value = new int[10001];
        for (int i = 0 ; i< N; i++){
            value[Integer.parseInt(br.readLine())] ++;
        }

        for (int i =0; i< 10001; i++){
            while (value[i] > 0){
                sb.append(i).append("\n");
                value[i]--;
            }
        }
        br.close();
        System.out.println(sb);
    }
}