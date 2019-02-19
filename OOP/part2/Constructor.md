생성자
======
생성자는 객체가 생성될 때 필드를 초기화한다.  

## 생성자의 특징
* 생성자는 리턴 타입이 없다.
> 😸 : 이 특징으로 메소드와 형태를 구분할 수 있다.

* 생성자 명은 클래스 명과 같다.
* 객체가 생성될 때 호출된다.

## default 생성자
입력변수가 없고 내용도 없는 생성자를 default 생성자라고 한다.  

만약 클래스에 생성자가 하나도 없다면 컴파일시 자동으로 
default 생성자를 추가한다.  
반대로 하나라도 생성자를 만들었을 경우에는 default 생성자를
추가해주지 않는다.  
<pre>
public class Car{
    String name;
}</pre>
위와 같이 구성된 Car 클래스는 생성자를 만들어 주지 않았기 
때문에 컴파일시 
<pre>
public Car() {

}</pre>
와 같은 default 생성자를 추가한다.  

## 생성자 예시
> 😸 : 직접 생성자를 만들어보고 만든 생성자를 이용해 객체를 
생성해보자.

먼저 클래스를 정의한다.
<pre>
public class Car{
    String name;
    
    public Car(String str){
        name = str;
    }
}</pre>
생성자를 이용해 객체를 생성해보자.
<pre>
public class CarTest{
    public static void main(String args[]){
        Car c1 = new Car("경찰차");
        Car c2 = new Car("택시");
        
        System.out.println(c1.name);
        System.out.println(c2.name);
    }
}</pre>
생성자를 이용해 객체를 생성할 때 각 객체의 멤버변수를 초기화했다.
    