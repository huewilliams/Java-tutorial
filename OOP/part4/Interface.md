인터페이스
========
Java 는 특정 메소드를 구현할 것을 약속만 하고 구체적인 구현을 구현 클래스에서 작성하는 `인터페이스`를 제공한다.  
이것은 추상 클래스와 매우 흡사하다.  
 
인터페이스를 정의하였을 때 구체적 구현을 하지 않기 때문에 개체를 생성할 수 없다는 점에서는 추상 클래스와 같다.   
하지만 인터페이스에서는 구체적인 기능을 정의하는 메서드를 멤버로 정의할 수 없다.  

## 인터페이스 정의
인터페이스를 정의할 때는 class 대신 `interface` 라는 키워드를 사용한다.
<pre>
public interface Car{
    public int MAX_SPEED = 150;
    
    public void start();
    public void getSpeed(int speed);
}</pre>
인터페이스에서 선언한 변수는 컴파일시 상수화된다.  
또한 인터페이스에서 정의된 메소드는 모두 추상 메소드가 된다.
<pre>
public static final int MAX_SPEED = 100;

public abstract void start();
public abstract void getSpeed(int speed);</pre>

> 😸 : 인터페이스는 암시적으로 추상 클래스이다.  
인터페이스는 추상 클래스 처럼 abstract 를 명시하지 않지만 인스턴스를 생성할 수 없는 추상 클래스이다.

## 구현클래스 정의
인터페이스를 기반으로 하는 구현 클래스를 정의할 때는 클래스 이름 뒤에 `implements` 키워드와 인터페이스 명을 명시한다.
<pre>
public class Bus implements Car{
    @Override
    public void start(){
        System.out.println("주행을 시작합니다");
    };
    
    @Override
    public void getSpeed(int speed){
        System.out.println("현재 속도는"+speed+"입니다");
    }
}</pre>

> 😸 : 인터페이스가 가지고 있는 메소드 중 하나라도 구현 메소드에서 구현이 빠진다면 해당 클래스는 추상 클래스가 되어 
인스턴스를 생성할 수 없게 된다.

## Test
<pre>
public class Test{
    public static void main(String args[]){
        Car car = new Bus();
        car.start();
        car.getSpeed(120);        
    }
}</pre>
참조변수의 타입으로 인터페이스를 사용할 수 있다.  
이 경우 인터페이스가 가지고 있는 메소드만 사용할 수 있다.