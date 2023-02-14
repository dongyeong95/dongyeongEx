package Example2;

public class Ex4_6 {
    public static void main(String[] args) {
        for (int d=1;d<=6; d++){
            for(int da=1;da<=6; da++){
                if(d +da==6)
                    System.out.println("(" + d + "," + da +")");
            }
            System.out.println();
        }

    }
}


