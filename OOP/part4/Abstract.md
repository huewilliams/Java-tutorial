추상클래스
=========
개념적으로 봤을 때 추상클래스는 `구체적이지 않은 클래스`를 의미한다.  

추상 클래스는 개체를 생성할 수 없고 부모 클래스의 역할만 수행하는 클래스이다.  
또한 추상클래스 내부의 추상메소드는 메소드 내부 정의가 없다.  
추상메소드는 자식클래스에서 상속받아 메소드를 `오버라이드`하여 사용한다.  

## 추상클래스 정의
추상 클래스는 클래스 앞에 abstract 키워드를 이용해서 정의한다.  
추상 메소드를 만들 때도 앞에 abstract 키워드를 붙여 정의한다.  
추상 메소드가 하나라도 있다면 추상클래스로 지정해야 한다.  
<pre>
public abstract class Car{
    public abstract void run();
    
    pulbic void start(){
        System.out.println("운전이 시작되었습니다");
    }
}</pre>
> 😸 : 위와 같이 추상클래스 내부에도 추상메소드가 아닌 일반메소드를 정의할 수도 있다.  

## 추상클래스 상속받기
추상 클래스를 상속받은 클래스는 추상 클래스가 갖고 있는 추상 메소드를 반드시 구현해야 한다.  
추상 클래스를 상속받고, 추상 클래스가 갖고 있는 추상 메소드를 구현하지 않으면 해당 클래스도 추상 클래스가 된다.
<pre>
public class Bus extends Car{
    @Override
    public void run() {
        System.out.println("주행을 시작합니다.");
    }
}</pre>
> 😸 : 참고로 @(어노테이션)Override 로 오버로딩된 것을 명시해주는 것이 좋다.  

## Test  
Car 클래스는 추상클래스이므로 인스턴스를 생성할 수 없다.  
<pre>
public class Test{
    public static void main(String[] args) {
        Bus bus = new Bus();
        bus.start();
        bus.run();
    }
}</pre>