// 1. 공통 속성과 추상 메서드를 정의하는 부모 추상 클래스 Printer
abstract class Printer {
    protected String model;         // 모델명
    protected int printedCount;     // 현재까지의 출력 매수 (초기값 0)
    protected int availableCount;   // 출력 가능 매수 (남은 잉크/토너 양)

    // 생성자: 모델명과 초기 출력 가능 매수를 받아 초기화
    public Printer(String model, int availableCount) {
        this.model = model;
        this.printedCount = 0;      // 처음에는 0매 출력 상태
        this.availableCount = availableCount;
    }

    // 자식 클래스에서 반드시 구현해야 하는 추상 메서드
    public abstract boolean print();
}

// 2. Printer를 상속받는 잉크젯 프린터 클래스
class InkjetPrinter extends Printer {

    // 부모 생성자 호출
    public InkjetPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // 출력 가능 매수가 0인 경우 (잉크 부족)
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 잉크 부족.");
            return false;
        }
        // 출력 가능 매수가 1 이상인 경우 (정상 인쇄)
        else {
            printedCount++;   // 출력 매수 1 증가
            availableCount--; // 남은 가능 매수 1 감소
            return true;
        }
    }
}

// 3. Printer를 상속받는 레이저 프린터 클래스
class LaserPrinter extends Printer {

    // 부모 생성자 호출
    public LaserPrinter(String model, int availableCount) {
        super(model, availableCount);
    }

    @Override
    public boolean print() {
        // 출력 가능 매수가 0인 경우 (토너 부족)
        if (availableCount == 0) {
            System.out.println(model + ": " + (printedCount + 1) + "매째 인쇄 실패 - 토너 부족.");
            return false;
        }
        // 출력 가능 매수가 1 이상인 경우 (정상 인쇄)
        else {
            printedCount++;   // 출력 매수 1 증가
            availableCount--; // 남은 가능 매수 1 감소
            return true;
        }
    }
}

// 4. 실행을 담당하는 메인 클래스
public class Homework7 {
    public static void main(String[] args) {
        // 객체 생성 (잉크젯: 7500매, 레이저: 1500매)
        InkjetPrinter inkjet = new InkjetPrinter("Brother DCP-T730DW", 7500);
        LaserPrinter laser = new LaserPrinter("Canon MFC643Cdw", 1500);

        // 잉크가 다 닳을 때까지(false를 반환할 때까지) 반복 인쇄
        while (inkjet.print());

        // 토너가 다 닳을 때까지 반복 인쇄
        while (laser.print());
    }
}
