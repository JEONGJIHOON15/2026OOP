import java.util.Scanner;

public class Homework4 {

    // 1. 재귀 호출(Recursive Call)을 이용한 최대공약수(GCD) 메서드
    public static int gcd(int m, int n) {
        // [조건 2] n이 0이면 m이 최대공약수이므로 m을 반환하고 종료 (기초 조건, Base Case)
        if (n == 0) {
            return m;
        }

        // [조건 3] 첫 번째 인자: m과 n 중 작은 수
        //         두 번째 인자: 큰 수를 작은 수로 나눈 나머지
        int min = (m < n) ? m : n;
        int max = (m > n) ? m : n;

        // 작은 수(min)와 큰 수 % 작은 수(max % min)를 인자로 넣어 재귀 호출
        return gcd(min, max % min);
    }

    // 2. 반복문(Iteration)을 이용한 최대공약수(GCD) 메서드
    public static int gcdIterative(int m, int n) {
        // n이 0이 될 때까지 반복 실행
        while (n != 0) {
            int min = (m < n) ? m : n;
            int max = (m > n) ? m : n;

            // m에는 두 수 중 작은 수를 할당
            // n에는 큰 수를 작은 수로 나눈 나머지를 할당
            m = min;
            n = max % min;
        }

        // n이 0이 되었을 때의 m 값이 최대공약수
        return m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. 콘솔에서 두 정수 입력받기
        System.out.print("두 수를 입력하세요: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        // 2. 재귀 호출 알고리즘으로 최대공약수 계산 및 출력
        int result = gcd(a, b);
        System.out.println("두 수의 최대공약수는 " + result + "입니다.");

        // 3. 자원 해제
        scanner.close();
    }
}