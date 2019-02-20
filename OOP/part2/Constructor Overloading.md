생성자 오버로딩
============
생성자도 메소드와 마찬가지로 매개변수의 타입과 개수를 다르게하여 같은 이름의
생성자를 여러개 가질 수 있다.

## 생성자 오버로딩 예제
<pre>
public class Car{
    String name;
    int number;
    
    public Car(){
    
    }
    
    public Car(String name){
        this.name = name;
    }
    
    public Car(String name, int number){
        this.name = name;
        this.number = number;
    }
}</pre>

## 오버로딩된 생성자 사용
<pre>
public class Example{
    public static void main(String args[]){
        
        Car c1 = new Car();
        Car c2 = new Car("페라리");
        Car c3 = new Car("람보르기니",2018);
    }
}</pre>