import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        // 키보드 입력을 받기 위해 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        int sum = 0; // 입력받은 정수들의 누적 합을 저장할 변수 초기화

        // 5번 반복하여 정수를 입력받고 합산
        for (int i = 0; i < 5; i++) {
            System.out.print("정수를 입력하세요: ");
            int num = scanner.nextInt(); // 사용자로부터 정수 입력 받기

            sum += num; // 입력받은 정수를 누적 변수에 더함 (sum = sum + num)

            System.out.println("현재까지 입력된 정수의 합은 " + sum + "입니다.");
        }

        // 사용이 끝난 Scanner 자원 해제
        scanner.close();
    }
}