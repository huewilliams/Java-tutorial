this , this()
============
this는 현재 객체 자기 자신을 나타낸다.  

##this : 변수에 접근
메소드나 생성자의 입력인자와 소속된 클래스의 멤버변수의 변수명이 같을 수 있다.  
이 경우 매개변수와 필드를 구분하기 위해 this 키워드를 사용한다.  
> 😸 : Car 클래스의 예시로 보자.  

<pre>
public class Car{
    String name;
    
    public Car(String name) {
        name = name;
    }
}</pre>
위 예시의 목적은 클래스의 멤버변수를 생성자의 매개변수의 값으로 초기화하는
것이다.  
그러나 해당 코드는 가깝게 선언된 변수를 우선 사용하기 때문에 name은 매개변수를 
뜻하고 결국 매개변수 name 을 매개변수 name에 대입한것이 된다.  

이것의 해결책이 this이다.  
<pre>
public class Car{
    String name;
    
    public Car(String name){
        this.name = name;
    }
}</pre>
this.name 은 필드 name을 의미하고, name은 매개변수를 의미한다.  
이로써 원래 목적이었던 매개변수로 필드를 초기화 할 수 있었다.  

##this : 메소드에 접근
클래스 안에서 자기 자신이 가지고 있는 메소드를 사용할 때도 this.메소드명()으로
호출할 수 있다.  
메소드에서 자신이 속한 클래스의 다른 메소드를 접근할 때도 사용한다.   
> 😸 : 사용 예시는 간단하므로 생략하겠다.

## this() : 생성자에 접근
멤버 변수와 메소드에 this 키워드를 사용했다면 입력인자가 필요한 생성자를 호출할 때는
this() 를 사용한다.  
생성자가 요구하는 입력인자는 괄호안에 넣으면 된다.  

> 😸 : 마찬가지로 Car 클래스로 연습을 해보자.
<pre>
public class Car{
    String name;
    String year;
    
    public Car(String name){
        this("2019",name);
    }
    
    public Car(String year,String name){
        this.year = year;
        this.name = name;
    }
</pre>
위의 예시에는 생성자가 2개가 있다.  
자동차명과 제작년도를 전달할 수 있는데, 자동차명만 전달한경우 첫번째 생성자가 호출되고, 
첫번째 생성자에서는 년도를 "2019"로 설정하고 다시 두 번째 생성자를 호출한다.  
이렇게 this() 를 통해 생성자를 호출할 수 있다. 