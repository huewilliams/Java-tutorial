Generics
==========
Generic 을 선언할때는 가상의 타입으로 선언하고, 구현시 구체적인 타입을 설정함으로써 다양한 타입의 클래스를 이용하는 클래스를 만들 수 있습니다.  
Generic을 사용하는 대표적인 클래스는 컬렉션 프레임워크와 관련된 클래스입니다.

## no generic code
제네릭이 없었을 때는 최상위 클래스인 Object를 이용하여 클래스를 선언한후
사용할 때 형변환하는 것으로 다양한 타입의 클래스를 다룰 수 있었다.

> Car 클래스

<pre>
public class Car {
    private Object obj;
    
    public void setObj(Object obj){
        this.obj = obj;
    }
    
    public Object getObj() {
        return obj;
    }
}</pre>

> CarTest 클래스

<pre>
public class CarTest {
    public static void main(String args[]){
        Car car = new Car();
        car.setObj(new Object());
        Object obj = car.getObj();
        
        car.setObj("hello");
        String str = (String)car.getObj();
        
        car.setObj(1);
        int number = (int)car.getObj();
    }
}</pre>

Car 클래스는 Object를 매개변수로 받고 받은 Object 를 반환한다.  
Object 는 모든 클래스의 최상위 클래스 이므로 어떤 클래스이던지 매개변수로 
받아들일 수 있다.

## use generic code

> generic 을 적용한 Car 클래스

<pre>
public class Car<E> {
    private E obj;
    
    public void setObj(E obj){
        this.obj = obj;
    }
    
    public E getobj(){
        return obj;    
    }
}</pre>
클래스 이름 뒤에 <code>< E ></code> 로 제네릭을 적용한 것이다.  
Car 클래스는 가상의 클래스 E 를 사용한다.

> CarTest 클래스

<pre>
public class CarTest{
    public static void main(String args[]){
        Car<Object> car = new Car<>();
        car.setObj(new Object());
        Object obj = car.getObj();
        
        Car<String> car2 = new Car<>();
        car.setObj("hello");
        String str = car.getObj();
        
        Car<Integer> car3 = new Car<>();
        car.setObj(15);
        int value = car.getObj();
    }
}</pre>

