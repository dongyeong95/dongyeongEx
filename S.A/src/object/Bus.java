package object;

import object.Movable;
import object.Vehicle;

import java.util.Objects;

public class Bus extends Vehicle implements Movable {
    private int maxPassenger; // 최대 승객수
    private int currentPassenger; // 현재 승객수
    private int fare; // 요금
    private String busNumber; // 버스 번호
    private int fuelLevel; // 주유량
    private int currentSpeed; // 현재 속도
    private String status; // 상태 (운행, 차고지 행)

    public Bus(int maxPassenger, int fare, String busNumber) {
        this.maxPassenger = 30;
        this.fare = fare;
        this.busNumber = busNumber;
        this.currentPassenger = 0;
        this.fuelLevel = 50;
        this.currentSpeed = 0;
        this.status = "운행 중";
    }

    public static void main(String[] args) {
        Bus bus = new Bus(50, 1000, "1234"); // 객체 생성
        System.out.println("버스 번호: " + bus.busNumber); // 버스 번호 출력
        bus.drive(); // 운행 시작
        bus.boardPassenger(30); // 30명 탑승
        bus.changeStatus(); // 차고지 행
        bus.boardPassenger(20); // 20명 탑승
        bus.changeStatus(); // 운행 중
        bus.changeSpeed(50); // 속도 변경
        bus.move(); // 이동
        bus.refuel(100);
       /* System.out.println("잔여 승객수: " + bus.getCurrentPassenger() + "명");
        System.out.println("요금: " + bus.getFare() + "원");*/

    }

    private void changeSpeed(int i) {
        if (status.equals("운행 중")) {

            if (currentSpeed + i > 0) currentSpeed += i;
            else currentSpeed = 0;


            System.out.println("현재 속도 : " + currentSpeed);
            fuelLevel -= 10;
            System.out.println("현재 연료량 :" + fuelLevel);
            if (fuelLevel < 0) {

                fuelLevel = 0;
                changeStatus();


            }

        }
    }

    private int getFare() {
        return fare;
    }

    private int getCurrentPassenger() {
        return currentPassenger;
    }

    public void refuel(int amount) {

        int newFuelLevel = this.fuelLevel + amount;
        if (newFuelLevel > 100) {
            System.out.println("연료가 가득 찼습니다.");
            this.fuelLevel = 100;
        } else {
            System.out.println(amount + "리터 주유를 했습니다. 현재 연료량: " + newFuelLevel);
            this.fuelLevel = newFuelLevel;
        }
    }

    public void drive() {
        if (this.fuelLevel < 10) {
            System.out.println("주유가 필요합니다.");
            return;
        }
        System.out.println("운행을 시작합니다.");
        this.status = "운행 중";
    }

    public void changeStatus() {
        if (this.status.equals("운행 중")) {
            this.status = "차고지 행";
            System.out.println("차고지로 향합니다.");
        } else {
            this.status = "운행 중";
            System.out.println("목적지로 향합니다.");
        }
    }

    public void boardPassenger(int numPassenger) {
        if (Objects.equals(this.status, "운행 중") && (this.currentPassenger + numPassenger) <= this.maxPassenger) {
            System.out.println(numPassenger + "명 승객이 탑승했습니다.");
            this.currentPassenger += numPassenger;
        } else {
            System.out.println("탑승할 수 없습니다.");
        }
    }

    @Override
    public void move() {
        if (this.status.equals("운행 중")) {
            System.out.println("현재 속도: " + this.currentSpeed);
        } else {
            System.out.println("주행 중이 아닙니다.");
        }
    }
}
