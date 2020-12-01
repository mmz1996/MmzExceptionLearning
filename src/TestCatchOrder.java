/**
 * @Classname TestCatchOrder
 * @Description TODO
 * @Date 2020/12/1 21:18
 * @Created by mmz
 */
public class TestCatchOrder {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("捕获Throwable类型");
        }catch (NullPointerException e){
            System.out.println("捕获了Exception类型");
        }
    }
}
