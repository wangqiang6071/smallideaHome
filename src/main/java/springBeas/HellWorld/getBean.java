package springBeas.HellWorld;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class getBean {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("StuBean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        StuBean stuBean=(StuBean)factory.getBean("stuBean");
        stuBean.sayHello();
    }
}
