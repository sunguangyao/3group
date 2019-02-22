import com.itheima.dao.Servicesdao;
import com.itheima.domain.Maven;
import com.itheima.services.Sevivces;
import com.itheima.services.impl.Servicesimpl;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ceshi {
    @Test
    public void sss(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Servicesdao bean = ac.getBean(Servicesdao.class);
        Maven findybid = bean.findybid(1);
        System.out.println(findybid);
    }
    @Test
    public void aaa(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Sevivces bean = ac.getBean(Sevivces.class);
        Maven findybid = bean.findybid(1);
        System.out.println(findybid);
        System.out.println("wan");
    }
}
