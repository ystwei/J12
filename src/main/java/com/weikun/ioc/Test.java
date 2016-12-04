package com.weikun.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created by Administrator on 2016/12/4.
 */
public class Test {
    public static void main(String[] args) {
        Resource res=new ClassPathResource("bean.xml");
        BeanFactory b=new XmlBeanFactory(res);

        MyKecheng my=(MyKecheng)b.getBean("my");
        my.txt();
    }
}
