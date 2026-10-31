// 1. Monitor 클래스
class Monitor {
    private String size;
    private String color;
    private String power;

    // 생성자
    public Monitor(String size, String color, String power) {
        this.size = size;
        this.color = color;
        this.power = power;
    }

    // 모니터 전원 켜기 메소드
    public void turnOn() {
        System.out.println("Turning on the monitor.");
    }

    // 모니터 정보 출력 메소드
    public void printInfo() {
        System.out.println("The spec of the monitor");
        System.out.println("Size: " + size);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

// 2. Computer 클래스
class Computer {
    private String cpu;
    private String memory;
    private String hdd;
    private String color;
    private String power;

    // 생성자
    public Computer(String cpu, String memory, String hdd, String color, String power) {
        this.cpu = cpu;
        this.memory = memory;
        this.hdd = hdd;
        this.color = color;
        this.power = power;
    }

    // 컴퓨터 전원 켜기 메소드
    public void turnOn() {
        System.out.println("Turning on the computer.");
    }

    // 컴퓨터 정보 출력 메소드
    public void printInfo() {
        System.out.println("The spec of the computer");
        System.out.println("CPU: " + cpu);
        System.out.println("Memory: " + memory);
        System.out.println("HDD: " + hdd);
        System.out.println("Color: " + color);
        System.out.println("Power: " + power);
    }
}

// 3. Homework5 클래스 (컴퓨터와 모니터를 포함하는 복합 객체)
public class Homework5 {
    private Computer computer;
    private Monitor monitor;

    // 생성자에서 요구사항에 맞는 부품(Computer, Monitor) 객체 생성 및 조립
    public Homework5() {
        this.computer = new Computer("Core i7", "16GB", "2TB", "White", "500W");
        this.monitor = new Monitor("24 inch", "Black", "45W");
    }

    // PC 전원 켜기 (내부 부품들의 turnOn() 호출)
    public void turnOn() {
        computer.turnOn();
        monitor.turnOn();
    }

    // PC 및 부품 정보 출력 (내부 부품들의 printInfo() 호출)
    public void printInfo() {
        computer.printInfo();
        monitor.printInfo();
    }

    // 메인 실행 메소드
    public static void main(String[] args) {
        // Homework5 객체 생성
        Homework5 myPc = new Homework5();

        // turnOn()과 printInfo() 함수 호출
        myPc.turnOn();
        myPc.printInfo();
    }
}
