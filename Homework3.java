import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        // 키보드 입력을 처리하기 위한 Scanner 객체 생성
        Scanner scanner = new Scanner(System.in);

        // 1. 입력받을 정수의 개수 입력받기
        System.out.print("몇 개의 수를 입력할 예정인가요? ");
        int count = scanner.nextInt();

        // 2. 입력받은 개수(count) 크기만큼 정수 배열 동적 생성
        int[] numbers = new int[count];

        // 3. 공백으로 구분된 정수들을 개수만큼 입력받아 배열에 순서대로 저장
        System.out.print("수를 입력하세요: ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // 4. 최소값과 최대값을 저장할 변수를 배열의 0번째 요소 값으로 초기화
        //    (배열의 첫 번째 값을 기준으로 삼고 탐색 진행)
        int min = numbers[0];
        int max = numbers[0];

        // 5. 배열의 1번째 요소부터 마지막 요소까지 순회하면서 최소값과 최대값 갱신
        for (int i = 1; i < count; i++) {
            // 현재 탐색 중인 요소(numbers[i])가 기존 min보다 작으면 min 갱신
            if (numbers[i] < min) {
                min = numbers[i];
            }

            // 현재 탐색 중인 요소(numbers[i])가 기존 max보다 크면 max 갱신
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        // 6. 최종 구한 최대값과 최소값 출력
        System.out.println("최대값: " + max);
        System.out.println("최소값: " + min);

        // 자원 해제
        scanner.close();
    }
}