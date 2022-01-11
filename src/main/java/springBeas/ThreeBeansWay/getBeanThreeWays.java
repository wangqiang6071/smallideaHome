package springBeas.ThreeBeansWay;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import springBeas.HellWorld.StuBean;

public class getBeanThreeWays {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("StuBean.xml");
        BeanFactory factory=new XmlBeanFactory(resource);
        //第一种 根据bean的名字（id）一个名字有多个类型
        //StuBean stuBean=(StuBean)factory.getBean("stuBean");
        //第二种 根据bean的类型（class）:同一类型有多个名字
        //StuBean stuBean=(StuBean)factory.getBean(StuBean.class);
        //第三种 根据bean的名字和类型（id和class）根据名字和类型确定唯一
        StuBean stuBean=(StuBean)factory.getBean("stuBean",StuBean.class);
        stuBean.sayHello();
    }
}
