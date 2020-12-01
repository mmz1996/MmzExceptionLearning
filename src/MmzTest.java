/**
 * @Classname MmzTest
 * @Description TODO
 * @Date 2020/12/1 21:35
 * @Created by mmz
 */
public class MmzTest {

    static void test(int a) throws MmzException {
        if(a > 10) {
            throw new MmzException(a);
        }

        System.out.println("ok");
    }

    public static void main(String[] args) {
        try {
            test(11);
        } catch (MmzException e) {
            e.printStackTrace();
        }
    }
}
