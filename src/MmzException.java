/**
 * @Classname MmzException
 * @Description TODO
 * @Date 2020/12/1 21:31
 * @Created by mmz
 */
public class MmzException extends Exception {

    //传递数字，如果数字大于10抛出异常

    private int number;
    public MmzException(int number) {

        this.number = number;
    }

    @Override
    public String toString() {
        return "MmzException{" +
                "number=" + number +
                '}';
    }
}
