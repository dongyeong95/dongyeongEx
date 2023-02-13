package Example;

public class Ex3_2 {
    public static void main(String[] args) {
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2); // true || false 가 되서 or연산자는  하나가 값이 있으면 무조건 참이다
        System.out.println(y += 10 - x++); //13 x++ 후위형이라서 값에 증가되지 않는다 그래서 15-2 = 13이다
        System.out.println(x += 2); //위의 문제값에 결과값이 나와서 x의 값은 +1 증가한다 그러므로 답은 5다 x +=2 는 x=x+2이다
        System.out.println(!('A' <= c && c <= 'Z')); //A= 65 Z=90  true &&true  느낌표 부정연산자...! 답은 false 거짓이다
        System.out.println('C' - c); //아스키 코드 C는 c('A')= 아스키코드 A값이다  67- 65 =2
         System.out.println('5' - '0');// 5-0는 5다
        System.out.println(c + 1); //66('B') c('A') 정수형 리터럴 값때문에 아스키코드 65값을 가져온다
        System.out.println(++c);  //66 선행연산자
        System.out.println(c++); //66  후위연산자
        System.out.println(c); //C 후위연산자의 값이  나중에 일어난값에 + 1 된다 정답은 C

    }
}