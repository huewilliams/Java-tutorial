접근제어자
========
OOP에서는 캡슐화 과정에서 멤버의 접근 수준을 지정할 수 있다.  
Java언어는 다음과 같은 접근 제어자가 있디.  
1. private
2. default
3. protected
4. public

private -> default -> protected -> public 순으로 보다 많은 접근을 허용한다.  

## private
접근제어자가 private이라면 private이 붙은 변수,메소드는 해당 클래스 내부에서만 접근 가능하다.  

<pre>
public class Car{
    private String name;
    private String getName() {
        return this.name;    
    }
}</pre>

위 예제의 name 변수와 getName 메소드는 오직 Car 클래스에서만 접근이 가능하고 다른 클래스에서의 접근의 불가능하다.  

> 😸 : 예제에 this가 나오는데 part2에서 알아볼 예정이니 객체 자기 자신을 가리킨다고 알아두면 좋다. 

## default  
접근제어자를 설정하지 않았을 경우 변수, 메소드는 default 접근제어자가 된다.  
default 는 자신이 속한 패키지 내부에서만 접근이 가능하다.  

> Car.java
<pre>
package transport.human

public class Car{
    String name = "람보르기니"
}</pre>

> AirPlane.java
<pre>
package transport.human

public class AirPlane{
    String name = "대한항공"
    
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.name);
    }
}
</pre>

Car 과 AirPlane의 패키지는 transport.human 으로 같다.  
Car 의 name 변수의 접근제어자가 default 이므로 같은 패키지 내부의 AirPlane 에서 접근 가능하다.  

> 😸 : 후에 패키지에 대해서도 정리할 예정이다.

## protected
접근제어자가 protected 이라면 protected 가 붙은 변수, 
메소드는 동일 패키지내의 클래스 또는 해당 클래스를 `상속`받은 외부 패키지의 클래스에서 접근이 가능하다.

> Car.java
<pre>
package transport.human

public class Car{
    protected String name = "페라리"
}</pre>

> Ship.java
<pre>
package transport.things

import transport.human

public class Ship extends Car{
    public class static void main(String args[]){
        Ship s1 = new Ship();
        System.out.println(s1.name);
    }
}</pre>
Ship.java 는 transport.things 패키지로 Car.java와 패키지가 다르지만 Car 클래스의 name 변수가 protected 로 설정되어 있기 
때문에 외부 패키지의 상속 받은 클래스에서 접근이 가능하다.  

## public 
접근제어자가 public 이라면 public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다.  

> 😸 : 참고로 클래스내의 클래스를 inner 클래스라고 부르는데 이러한 inner 클래스에도 접근제어자를 사용할 수 있다.  