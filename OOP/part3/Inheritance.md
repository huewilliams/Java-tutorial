상속
===
상속은 단어의 의미 그대로 자식이 부모가 가진 것을 물려받는 것이다.

## IS A 관계
* 택시는 자동차다.  
* 강아지는 동물이다.  

와 같이 부모 자식 간의 클래스의 관계를 정의할 수 있다.  
영어로 해석하면 taxi `is a` Car 과 같이 말할 수 있으므로 이런 관계를
`IS-A` 관계라고 한다.

## 상속 in code
> 😸 : 실제로 상속을 자바 코드에서 어떻게 사용하는지 알아보자.  

Car 클래스를 상속받는 Taxi 클래스를 만들어보았다.  
<pre>
public class Car{
    
}

public class Taxi extends Car{

}</pre>
위와 같이 클래스 이름 뒤에 `extends` 키워드를 적고 상속받을 부모 클래스의 
이름을 적으면 부모클래스가 가진 것들을 상속받을 수 있다.  

부모 클래스에게 상속 받은 것들은 자식 클래스에서 사용할 수 있다.
> 😸 : 위의 문장을 예시로 증명해보자.

> Car 클래스에 hello() 메소드 추가
<pre>
public class Car{
    public void hello(){
        System.out.println("World");
    }
}</pre>
> Car 클래스를 상속받은 Taxi 클래스 사용
<pre>
public class Test{
    public static void main(String args[]){
        Taxi taxi = new Taxi();
        taxi.hello();       
    }
}</pre>
위와 같이 상속받은 자식클래스는 부모 클래스의 메소드도 사용할 수 있다.

> 자식 클래스에 메소드 추가
<pre>
public class Taxi{
    public void sum(int a,int b){
        System.out.println(a+b);
    }
}</pre>
이제 Taxi 클래스는 Car 클래스보다 많은 기능을 가지게 되었다.  
이렇게 부모가 가지고 있는 메소드외에 추가로 메소드를 선언하는 것을 확장하였다고
표현한다.
## 다중 상속
다중 상속은 클래스가 동시에 하나 이상의 클래스를 상속받는 것을 뜻한다.  
C++, 파이썬 등의 언어들은 다중 상속을 지원하지만 자바는 다중상속을 지원하지 
않는다.  
