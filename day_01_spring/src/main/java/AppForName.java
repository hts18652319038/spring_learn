import com.xzit.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForName {
    public static void main(String[] args) {
//        BookService bookService = new BookServiceImpl();
//        bookService.save();
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");

        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        System.out.println(bookDao2);
    }
}
