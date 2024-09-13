import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[10];
        int sum2 = 0;
        int sum3 = 0;
        int cnt = 0;

        for(int i = 0; i < 10; i++){
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            if ((i+1) % 2 == 0) {
                sum2 += arr[i];
            }
            if ((i+1) % 3 == 0) {
                sum3 += arr[i];
                cnt++;
            }
        }

        double avg3 = (double) sum3 / cnt;
    
        System.out.printf("%d %.1f", sum2, avg3);
    }
}

// 크기가 10인 정수로 이루어진 수열이 주어졌을 때, 다음 2개의 값을 출력하는 프로그램을 작성해보세요.

// 짝수 번째로 입력된 값의 합
// 3의 배수 번째로 입력된 값의 평균

// 합과 평균을 공백을 사이에 두고 출력합니다. 평균은 반올림하여 소수 첫째 자리까지 출력합니다.

// 입출력 예제
// 예제1
// 입력:

// 1 2 3 4 5 6 7 8 9 10
// 출력:

// 30 6.0