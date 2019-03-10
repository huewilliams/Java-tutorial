인터페이스 default & static 메소드
===============================
JAVA 8에서 interface 에 대한 정의가 변경됨
## default 메소드
인터페이스 내부에 default 키워드로 메소드를 구현할 수 있다.  
이를 구현하는 클래스는 default 메소드를 오버라이딩 할 수 있다.
<pre>
public interface Calc{
    public int plus(int a, int b);
    public int multiple(int a, int b);
    
    defualt int exec(int a, int b) {
        return a + b;
    }
}

public class Computer implements Calc {
    
    @Override 
    public int plus(int a, int b) {
        return a + b;
    }
    
    @Override
    public int multiple(int a, int b) {
        return a + b;
    }
}

public class CalcTest{
    public static void main(String args[]){
        Calc c = new Calc();
        int result = c.exec(12, 3);
    }
}</pre>

인터페이스 변경 시 인터페이스를 구현한 모든 클래스가 해당 메소드를 다시
구현해야 하는 문제가 있다. 그런 문제를 해결하기 위해 인터페이스에 메소드를
구현할 수 있게 되었다.

## static 메소드
<pre>
public interface Calc{
    public int plus(int a, int b);
    public int multiple(int a, int b);
    
    default int exec(int a, int b) {
        return a + b;
    }
    static int divide(int a, int b) {
        return a / b;
    }
}

public class CalcExam{
    public static void main(String args[]){
        Calc c = new Calc();
        int result = c.exec(3,5);
        
        int result2 = Calc.divide(6,3);
    }
}</pre>
인터페이스에 정의한 static 메소드는 반드시 <code>인터페이스명.메소드</code>
형식으로 호출해야 한다.