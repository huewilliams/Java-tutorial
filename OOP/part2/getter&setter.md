getter 와 setter
==============
getter 와 setter 메소드는 OOP의 은닉성을 잘 보여주는 메소드이다.  

getter 와 setter 메소드를 이용하여 private 으로 지정된 멤버 변수의 값을 설정하거나
가져올 수 있다.

#in code
> 😸 : getter 와 setter 를 활용한 코드 예제를 보면서 감을 잡아봅시다.

<pre>
class Car {
    private String name;
    private int num;
    
    // setter 메소드 : 은닉된 멤버 변수의 값 지정
    public void setName(String name){
        this.name = name;
    }
    public void setNum(int num){
        this.num = num;
    }
    
    // getter 메소드 : 은닉된 멤버 변수의 값 가져옴
    public void getName(){
        return name;
    }
    public void getNum(){
        return num;
    }
}

public class Ex_getter_setter{
    public static void main(String args[]){
        Car c = new Car();
        c.setName("람보르기니");
        c.setNum(2018);
        
        String name = c.getName();
        int num = c.getNum();
    }
}</pre>