/**
 * @Classname TestTypeOfCatch
 * @Description TODO
 * @Date 2020/12/1 21:15
 * @Created by mmz
 */
public class TestTypeOfCatch {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;

        try {
            System.out.println(a/b);
        }catch (Throwable t){
            System.out.println("异常发生了");
        }finally {
            System.out.println("最终执行");
        }
    }
}
