/**
 * @Classname Test
 * @Description TODO
 * @Date 2020/12/1 21:09
 * @Created by mmz
 */
public class Test {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("被除数不能为零");
        }finally {
            System.out.println("最终会被执行");
        }

    }
}
