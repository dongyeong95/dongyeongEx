package Example2;

public class Ex4_1 {
    public static void main(String[] args) {

    //int형 변수 x가 10보다 크고 20보다 작을 때 true인 조건식
      //int x = 12;
      //System.out.println( x > 10 && x <20);

    //char형 변수 ch가 공백이나 탭이 아닐 때 true인 조건식
        // char ch = ' ';
        // System.out.println(ch == ' ' || ch == '\n');


    //char형 변수 ch가 'x' 또는 'X'일 때 true인 조건식
       // char ch = 'x';
        //System.out.println(ch == 'x' || ch == 'X');

    //char형 변수 ch가 숫자('0'~'9')일 때 true인 조건식
//        char  ch  = '0';
//        System.out.println('0' <= ch && ch <= '9');

    //char형 변수 ch가 영문자(대문자 또는 소문자)일 때 true인 조건식
        char ch = 'a';
        System.out.println(('A'<= ch && ch<='Z')||('a'<= ch && ch<='z'));
    //int형 변수 year가 400으로 나눠떨어지거나 또는 4로 나눠떨어지고 100으로 나눠떨어지지 않을때 true인 조건식
        int year = '0';
        System.out.println(year%400 == 0 || year % 4 == 0 && year%100 !=0);
    //boolean형 변수 powerOn이 false일 때 true인 조건식
        boolean powernOn = false;
        System.out.println(!powernOn);

//문자열 참조변수 str이 "yes"일 때 true인 조건식
    String str = "yes";
        System.out.println(str);
 }
}
