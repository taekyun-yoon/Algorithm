import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());
        int y = Integer.parseInt(br.readLine());
        int quadrant = -1;
        if (x > 0) {
            if (y > 0) {
                quadrant = 1;
            } else {
                quadrant = 4;
            }
        } else {
            if (y > 0) {
                quadrant = 2;
            } else {
                quadrant = 3;
            }
        }
        System.out.println(quadrant);

        br.close();
    }
}