package Report5;

public class Ex6_2 {
        public static void main(String[] args){
            Student s = new Student("홍길동", 1, 1, 100, 60, 76);
            s.name = "홍길동";
            s.ban = 1;
            s.no = 1;
            s.kor = 100;
            s.eng = 60;
            s.math = 76;
            System.out.println(" :" + s.name);
            System.out.println(" :" + s.getTotal());
            System.out.println(" :" + s.getAverage());
            String str = s.info();
            System.out.println(str);
        }// 예상 결과 : 홍길동, 1, 1, 100, 60, 76, 236, 78.7
    }

    class Student{
        String name;
        int ban;
        int no;
        int kor;
        int eng;
        int math;

        public Student(String name, int ban, int no, int kor, int eng, int math) {
            this.name = name;
            this.ban = ban;
            this.no = no;
            this.kor = kor;
            this.eng = eng;
            this.math = math;
        }
        int getTotal(){
            return kor+eng+math;        // 6-3
        }
        float getAverage(){
            return (int)(getTotal()/3f * 10 + 0.5f)/ 10f;   //6-3
        }
        public String info() {
            return name
                    +","+ban
                    +","+no
                    +","+kor
                    +","+eng
                    +","+math
                    //+","+(kor+eng+math)   --> 6_2 문제
                    // +","+((int)((kor+eng+math) / 3f * 10 + 0.5f) / 10f)  --> 6_2문제
                    +","+getTotal()  // 6-3
                    +","+getAverage()   // 6-3
                    ;
        }

    }


