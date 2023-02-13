package Example;

public class Ex3_6 {
    //3-6. 아래는 화씨(Fahrenheit)를 섭씨(Celcius)로 변환하는 코드이다.
//변환 공식이 'C = 5/9*(F-32)'라고 할 때, 빈 칸에 알맞은 코드를 넣으시오.
// 단, 변환값은 소수점 셋째자리에서 반올림하며, Math.round() 함수를 사용하지 않고 처리할 것!
        public static void main(String[] args){
            int fahrenheit = 100;
            float celcius = (int)(5/9f*(fahrenheit-32)*100+0.5)/100f;
            //먼저 화씨를 섭씨로 바꾸는 공식은 이다 의 결과 '5/9f * (fahrenheit - 32)' . 5/9 는 0이기 때문에 두 피연산자 중 어느 한 쪽을
            // 반드시 float로 하면 실수형태의 결과를 얻을 수 있다 그래서 정수형 리터럴인 9대신 float타입의 리터럴인 9f를 사용하였다.

            System.out.println("Fahrenheit:"+fahrenheit);
            System.out.println("Celcius:"+celcius);
        }
    }
//예상 결과 : Fahrenheit:100, Celcius:37.78

