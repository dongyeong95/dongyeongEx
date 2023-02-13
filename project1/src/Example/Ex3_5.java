package Example;

public class Ex3_5 {
        public static void main(String[] args){
            int num = 10;
            System.out.println((num == 0) ? '0':((num > 0 ? "양수" : "음수")));

            /*삼항연산자를 사용하면 2가지 경우의 수를 처리할 수 있다.
            삼항연산자에 삼항연산자를 포함시키면 3가지 경우의 수를 처리할 수 있다.

            num의 값이 0보다 크면, '양수'를 출력하고 끝나지만,

                    num의 값이 0보다 작거나 같으면 괄호안의 삼항연산자가 수행된다.
            여기서 num의 값이 0보다 작으면 '음수'가 출력되고, 그렇지 않으면(num의 값이 0이면) '0'이 출력된다.*/
        }
    }

