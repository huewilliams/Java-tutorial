import java.util.Scanner;

public class Input {
    static Scanner scanner = new Scanner(System.in); //키보드로 입력받을 Scanner 개체 생성

    public static void main(String args[]) {
        String name;
        int age;
        double weight;

        System.out.println("> \uD83D\uDE38 : 이름을 입력해주세요");
        name = scanner.next();
        System.out.println("> \uD83D\uDE38 : 나이를 입력해주세요");
        age = scanner.nextInt();
        System.out.println("> \uD83D\uDE38 : 몸무게를 입력해주세요");
        weight = scanner.nextDouble();

        System.out.println("> \uD83D\uDE38 : "+name+"의 나이는 "+age+"세이고 몸무게는 "+weight+"kg 이다.");
    }
}
