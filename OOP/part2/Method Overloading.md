메소드 오버로딩(중복정의)
======================
하나의 클래스에 매개변수의 유형이나 개수를 다르게하여 멤버 메소드를 여러개 가질 수 있다.  
이러한 기술을 메소드 오버로딩(중복정의)라고 한다.  

## 메소드 오버로딩 예제
> 😸 : 바로 예시로 보자.
<pre>
class Car {
    public int sum(int a, int b){
        return a +b;
    }
    
    public int sum(int a, int b, int c){
        return a + b + c;
    }
    
    public String sum(String a, String b){
        return a + b;
    }
}</pre>
예제와 같이 이름은 같지만 매개변수가 다른 메소드를 여러개 만들 수 있다.  
단, 주의해야 할 점은 변수명은 다르지만, 매개변수의 타입과 개수가 같은 메소드는
정의할 수 없다.

## 오버로딩된 메소드 사용
메소드의 인자의 유형이나 개수에 따라 각기 다른 메소드가 호출된다.
<pre>
public Example{
    public static void main(String args[]){
        Car c1 = new Car();
        
        System.out.println(c1.sum(1,2));
        System.out.println(c1.sum(1,2,3));
        System.out.println(c1.sum("hello"+"world"));
    }
}</pre>