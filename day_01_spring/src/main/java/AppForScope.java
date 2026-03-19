import com.xzit.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        // 获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("bean.xml");
        // 获取bean
        //BookDao bookDao = (BookDao) ctx.getBean("bookDao");

        //bookDao.save();

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
