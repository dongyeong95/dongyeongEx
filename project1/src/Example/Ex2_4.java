package Example;

public class Ex2_4 {
    public static void main(String[] args) {

        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
       // byte b = 256;  byte의 범위가 잘못 되었다  초기화 불가능(-128~127)
        // char c = '';  ''안에 반드시 하나의 문자가 필요함
        // char answer = 'no'; // 두개의 문자를 저장할수 없다
        // float f = 3.14 //  float는  리터럴에 점미사 f or F를 붙여야한다
        double d = 1.4e3f;  // float는 4바이트 double는 8바이트라서 값을 넣어서 입출력이 가능하다
    }
}