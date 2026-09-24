import java.util.Scanner;

// 학생 정보를 저장하고 관리하는 Student 클래스
class Student {
    // 멤버 변수 (필드)
    private int studentId;   // 학번 (정수형)
    private String name;     // 이름 (문자열)
    private String major;    // 전공 (문자열)
    private long phone;      // 전화번호 (숫자로 저장, 010...은 int 범위인 21억을 넘으므로 long 사용)

    // 기본 생성자
    public Student() {}

    // 학번 Getter & Setter
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    // 이름 Getter & Setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // 전공 Getter & Setter
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // 전화번호 Getter & Setter
    public long getPhone() {
        return phone;
    }
    public void setPhone(long phone) {
        this.phone = phone;
    }

    // 전화번호 숫자를 "010-xxxx-xxxx" 포맷 문자열로 변환하는 메소드
    public String getFormattedPhone() {
        // 숫자를 문자열로 변환 (예: 1053559999L -> "1053559999")
        String str = Long.toString(this.phone);

        // 맨 앞의 0이 제거되어 10자리 문자열로 들어온 경우 앞자리에 '0'을 보장해줌 ("01053559999")
        if (str.length() == 10) {
            str = "0" + str;
        }

        // substring을 이용한 하이픈(-) 삽입
        // str이 "01053559999" 일 때:
        // str.substring(0, 3) -> "010"
        // str.substring(3, 7) -> "5355"
        // str.substring(7)    -> "9999"
        return str.substring(0, 3) + "-" + str.substring(3, 7) + "-" + str.substring(7);
    }
}

// 실행을 담당하는 Homework2 클래스 (파일명과 동일)
public class Homework2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 3명의 학생 객체를 저장할 배열 생성
        Student[] students = new Student[3];

        // 1. 키보드로부터 3명의 학생 정보 입력받기
        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            // 띄어쓰기 구분으로 입력받으므로 scanner.next() 사용
            int studentId = Integer.parseInt(scanner.next()); // 학번 (문자열 -> int)
            String name = scanner.next();                     // 이름 (문자열)
            String major = scanner.next();                    // 전공 (문자열)
            long phone = Long.parseLong(scanner.next());      // 전화번호 (문자열 -> long)

            // Student 객체 생성 및 Setter를 통한 값 설정
            students[i] = new Student();
            students[i].setStudentId(studentId);
            students[i].setName(name);
            students[i].setMajor(major);
            students[i].setPhone(phone);
        }

        // 2. 입력된 학생들의 정보 출력
        System.out.println("입력된 학생들의 정보는 다음과 같습니다.");
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "번째 학생: " +
                    students[i].getStudentId() + " " +
                    students[i].getName() + " " +
                    students[i].getMajor() + " " +
                    students[i].getFormattedPhone());
        }

        scanner.close();
    }
}