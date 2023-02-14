package Example2;

public class Ex5_1 {
    public static void main(String[] args) {
        //5-1. 다음은 배열을 선언하거나 초기화한 것이다. 잘못된 것을 고르고 그 이유를 설명하세요.
        // int[] arr[];
        //  int[] arr = {1,2,3,};
        // int[] arr = new int[5];
        //  int[] arr = new int[5]{1,2,3,4,5}; // 두번째 대괄호안에 배열의 크기를 지정 못함 괄호{} 데이터 개수에 따라 자동결정(x)
        // int arr[5]; // 선언할때 배열의 크기를 못정한다(x)
        //int[] arr[] = new int[3][];

        //5-2. 다음과 같은 배열이 있을 때, arr[3].length의 값은?
        int[][]arr ={
                {5,5,5,5,5},
                {10,10,10},
                {20,20,20,20},
                {30,30}
        };

    }
}
