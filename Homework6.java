// 1. 공통 속성(code, name)을 가지는 부모 클래스 Course
class Course {
    protected String code; // 자식 클래스에서 접근할 수 있도록 protected 지정
    protected String name;

    // 생성자: 과목 코드와 과목명을 초기화
    public Course(String code, String name) {
        this.code = code;
        this.name = name;
    }
}

// 2. Course를 상속받는 OfflineCourse 클래스
class OfflineCourse extends Course {

    // 부모 생성자를 호출하여 code와 name 초기화
    public OfflineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩 (Offline 형식)
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Offline";
    }
}

// 3. Course를 상속받는 OnlineCourse 클래스
class OnlineCourse extends Course {

    // 부모 생성자를 호출하여 code와 name 초기화
    public OnlineCourse(String code, String name) {
        super(code, name);
    }

    // toString() 메서드 오버라이딩 (Online 형식)
    @Override
    public String toString() {
        return "Code: " + code + ", Name: " + name + ", Type: Online";
    }
}

// 4. 실행을 담당하는 메인 클래스 (파일명과 동일해야 함)
public class Homework6 {
    public static void main(String[] args) {
        OfflineCourse course1 = new OfflineCourse("HAEA9201", "Object Oriented Programming");
        OnlineCourse course2 = new OnlineCourse("HAFL0012", "C Programming 1");

        // 객체를 출력할 때 자동으로 toString() 메서드가 호출됨
        System.out.println(course1);
        System.out.println(course2);
    }
}