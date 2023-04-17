package chapter10;

class Employee {

    String name;
    int age;
    int height;
    int weight;
    char bloodType;
    String email;

    public Employee(String name, int age, int height, int weight, char bloodType, String email) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.bloodType = bloodType;
        this.email = email;
    }

    @Override
    public String toString() {
        return name + ", " + age + ", " + height + ", " + weight + ", " + bloodType + ", " + email; 
    }
}

public class Test1 {
    public static void main(String[] args) {
        
        int[] a = new int[10];
        Employee[] eset = new Employee[10];
        eset[0] = new Employee("Hong", 11, 130, 50, 'A', "nonelove2@gmail.com");
        eset[1] = new Employee("Kim", 12, 140, 60, 'B', "nonelove3@gmail.com");
        eset[2] = new Employee("Lee", 13, 150, 70, 'O', "nonelove4@gmail.com");
        eset[3] = new Employee("Jo", 14, 160, 80, 'A', "nonelove5@gmail.com");

//        for(Employee e : eset) {
//            System.out.println(e.toString());
//        }
        
        for(int i=0; i<4; i++) {
            System.out.println(eset[i].toString());
        }

        System.out.println("-".repeat(50));
        // 새로운 인스턴스를 2번 인덱스에 넣고 싶다.
        // 그냥 아래처럼 실행하면 기존의 2번 인덱스의 인스턴스는 없어짐.
        // eset[2] = new Employee("choi", 14, 160, 80, 'A', "nonelove5@gmail.com");
        
        // 기존의 2번 인덱스와 이후의 데이터를 하나씩 뒤로 옮겨야 한다.
        eset[4] = eset[3];
        eset[3] = eset[2];
        // 이후 2번 인덱스에 새로운 데이터 삽입
        eset[2] = new Employee("choi", 14, 160, 80, 'A', "nonelove5@gmail.com");

        for(int i=0; i<5; i++) {
            System.out.println(eset[i].toString());
        }


    }
}
