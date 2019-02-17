키보드로 입력받기
==========
java.util.Scanner 네임 스페이스에서 입력을 담당하는 Scanner 를 제공함.  
Scanner 개체를 생성할 때 인자로 System.in 이라는 스트림 개체를 전달하면 키보드로
입력받을 수 있는 개체가 만들어진다.  
<pre>import java.util.Scanner;

public class Program{
    static Scanner scanner = new Scanner(System.in); // 입력 개체 생성
}</pre>
   
생성한 Scanner 개체를 참조하는 변수 scanner로 Scanner 객체의 메소드를 호출 가능  

## 문자열 입력받기  
문자열을 입력받을 때는 next 메서드를 사용한다.  
<pre>String str;

System.out.println("문자열 입력");

str = scanner.next();</pre>

## 정수 입력받기  
정수를 입력 받을 때는 nextInt 메서드를 사용한다.  
<pre>int num;

System.out.println("숫자 입력");

num = scanner.nextInt();</pre>

## 실수 입력받기  
실수를 입력받을 때는 nextDouble 메서드를 사용한다.
<pre>double num;

System.out.println("실수 입력");

num = scanner.nextDouble();</pre>
> 😸 : 자바에서 실수는 기본적으로 double 형이다.