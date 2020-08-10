import frank.Duck;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        String bit = (String)context.getBean("bit");
        Duck bit1 = (Duck)context.getBean("duck");
        System.out.println(bit1);
        System.out.println(bit);
    }
}