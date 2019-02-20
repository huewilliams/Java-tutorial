super와 부모생성자
=================
class가 인스턴스화 될 때 생성자가 호출되면서 객체를 초기화 한다.  
이 때 자신의 생성자 보다 부모의 생성자가 먼저 호출된다.  

## 부모생성자 in code
<pre>
pulic class Car{
    public Car(){
        System.out.println("parent default constructor");
    }
}

public class Taxi extends Car{
    public Taxi(){
        System.out.println("Taxi default constructor");
    }
}</pre>

> 😸 : 메인 메소드에서 테스트해보자.
<pre>
public class Test{
    public static void main(String args[]){
        Taxi taxi = new Taxi();
    }
}</pre>

> 😸 : 다음과 같은 결과가 나타난다.

parent default constructor  
Taxi default constructor  

두 가지 성질을 더 알 수 있었다.
* new 연산자로 Taxi 객체를 생성하면, Taxi 객체가 메모리에 올라갈때 부모인
Car도 함께 올라간다. 
* 생성자가 호출될 때 자동으로 부모의 생성자가 호출되면서 부모객체를 초기화한다.  

## super
자기 자신을 가리키는 키워드가 this라면, 부모를 가리키는 키워드는 super이다.  
또한 super()로 부모의 생성자를 호출할 수 있다.

부모의 생성자를 임의로 호출하지 않으면 자동으로 default 생성자가 호출된다.  

super 키워드로 자식에서 부모의 메소드나 필드도 사용할 수 있다.