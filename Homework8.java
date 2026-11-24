import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Homework8 {
    public static void main(String[] args) {
        // ID(String)와 비밀번호(String) 쌍을 저장할 HashMap 생성
        Map<String, String> accounts = new HashMap<>();
        accounts.put("myId", "myPass");
        accounts.put("myId2", "myPass2");
        accounts.put("myId3", "myPass3");

        Scanner scanner = new Scanner(System.in);

        System.out.println("ID와 패스워드를 입력해 주십시오.");

        while (true) {
            System.out.print("ID : ");
            // 한 줄을 읽은 뒤 앞뒤 불필요한 공백 제거
            String inputId = scanner.nextLine().trim();

            // 1. 입력된 ID가 해시맵에 존재하는지 확인
            if (!accounts.containsKey(inputId)) {
                System.out.println("입력하신 ID는 존재하지 않습니다. 다시 입력해 주세요.");
                System.out.println("id와 password를 입력해주세요.");
                continue; // 처음부터 다시 ID 입력
            }

            System.out.print("password : ");
            // 비밀번호 입력 후 앞뒤 공백 제거
            String inputPass = scanner.nextLine().trim();

            // 2. 저장된 비밀번호와 입력된 비밀번호가 일치하는지 확인
            String savedPass = accounts.get(inputId);
            if (!savedPass.equals(inputPass)) {
                System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
                System.out.println("id와 password를 입력해주세요.");
                continue; // 다시 로그인 시도
            }

            // 3. ID와 비밀번호가 모두 일치하는 경우
            System.out.println("ID와 비밀번호가 일치합니다.");
            break; // 반복문 종료
        }

        scanner.close();
    }
}
