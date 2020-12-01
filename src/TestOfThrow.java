import com.sun.org.apache.bcel.internal.generic.NEW;

/**
 * @Classname TestOfThrow
 * @Description TODO
 * @Date 2020/12/1 21:23
 * @Created by mmz
 */
public class TestOfThrow {
    public static void main(String[] args) {
        try {
            new TestOfThrow().testThrow();
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
    public void testThrow() throws ArithmeticException{
        int a = 0;
        int b = 0;
        System.out.println(a/b);
    }
}
