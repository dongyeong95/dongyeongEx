package Example2;

public class Ex5_2 {
    public static void main(String[] args) {

        int[][] arr = {
                {5, 5, 5, 5, 5},
                {10, 10, 10},
                {20, 20, 20, 20},
                {30, 30}
                //  arr[3].length는 arr[3]이 가리키는 배열의 크기를 의미한다.

                // 위의 그림에서 arr[3]이 가리키는 배열은 0x500번지에 있는 배열이며 크기는 2이다.

                // 그래서 arr[3].length의 값은 2가 된다.

                //  참고로 arr.length의 값은 4이고, arr[0].length의 값은 5, arr[1].length의 값은 3, arr[2].length의 값은 4이다.
                // {30,30} 여기가 array[3]이다 ..!  그러므로 2

        };
    }
}