package Example2;

import java.util.Scanner;

public class Ex4_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int answer = (int)(Math.random() * 100) + 1;
        int input = 0; //사용자입력을 저장할 공간
        int count = 0; //시도횟수를 세기위한 변수

        while(input != answer){
            System.out.println("1과 100사이의 값을 입력하세요.");
            input = scanner.nextInt();
            if(input > answer){
                System.out.println("더 작은 수를 입력하세요.");
            }else{
                System.out.println("더 큰수를 입력하세요.");
            }
            count++;
        }
        System.out.println("맞췄습니다.\n시도횟수는 " + count + "번입니다.");
    }
}

