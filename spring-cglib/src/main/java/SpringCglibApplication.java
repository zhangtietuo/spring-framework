import config.AppConfig;
import dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Auther: zhangtietuo
 * @Description:
 * @Date: 2019/3/7 16:56
 */
public class SpringCglibApplication {

	public static void main(String[] args) {
		System.out.println(123213);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		context.getBean(IndexDao.class);
	}
}
