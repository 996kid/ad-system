/**
 * @author yuyh
 * @desription
 * @date 2019/8/1
 */
public class LambdaTest {

    public static void main(String[] args) {
        Person person = () -> System.out.println("you think");
        person.think();
    }

}
