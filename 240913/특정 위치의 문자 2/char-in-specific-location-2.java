import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
            if (i == 1 || i == 4 || i == 7) {
                System.out.print(arr[i] + " ");
            }
        }

    }
}