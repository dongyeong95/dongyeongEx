package Example;

public class Ex3_4 {
    public static void main(String[] args){
        int numOfApples = 123; // 사과의 개수
        int sizeOfBucket = 10; // 바구니의 크기(바구니에 담을 수 있는 사과의 개수)
        int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket > 0 ? 1 : 0); // 모든 사과를 담는데 필요한 바구니의 수

        //사과의 개수(numOfApples)를 바구니의 크기(sizeOfBucket)으로 나눗셈연산(/)을 하면
        //사과를 담는데 필요한 바구니의 수(numOfBucket)를 구할 수 있다.
        //정수 간의 나눗셈 연산의 특징은 반올림을 하지 않고 버림을 한다는 것이다.
        //예를 들어 125/10의 결과는 13이 아니라 12가 된다.
        System.out.println("필요한 바구니의 수 :"+numOfBucket);
    }
}
