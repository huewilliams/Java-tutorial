열거형(enum)
====
자바는 열거타입을 이용하여 변수를 선언할 때 변수타입으로 사용할 수 있다

> 😸 : 열거형은 jdk5에서 추가되었다. 그전에는 열거형 대신 상수형을 
사용했는데, 문제가 있었다.

## 상수를 이용했을 때
<pre>
public class ConstExam {
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";
    
    public static void main(Stirng[] args) {
        String gender;
        
        gender = ConstExam.MALE;
        gender = ConstExam.FEMALE;
    }
}</pre>

> 😸 : gender 가 String 형으로 선언되었기 때문에 gender에 MALE과
FEMALE 이 아닌 다른 String 값이 들어와도 오류가 발생하지 않는 문제가 있다.

## 열거형을 사용했을 때
> 😸 : 열거형을 사용하면 위와 같은 문제를 간단히 해결할 수 있다.

### 열거형 정의
<pre>
enum Gender {
    MALE, FEMALE;
}</pre>

### 정의된 열거형 사용
<pre>
Gender gender;

gender = Gender.MALE;
gender = Gender.FEMALE;</pre>

> 😸 : 열거형은 변수가 특정한 값만을 가져야할 때 사용한다.

