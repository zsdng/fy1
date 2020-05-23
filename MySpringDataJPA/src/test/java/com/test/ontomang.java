package com.test;

import cn.fy.dao.CustomerDao;
import cn.fy.dao.LinkManDao;
import cn.fy.domain.Customer;
import cn.fy.domain.LinkMan;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class) //声明spring提供的单元测试环境
@ContextConfiguration(locations = "classpath:applicationContext.xml")//指定spring容器的配置信息
public class ontomang {

    @Autowired
    private CustomerDao customerDao;
    @Autowired
    private LinkManDao linkManDao;


    @Test
    @Transactional
    @Rollback(false)
    public void testadd() {

        Customer customer=new Customer();
        customer.setCustName("方哥哥");


        LinkMan linkMan =new LinkMan();
        linkMan.setLkmName("圆哥哥+联系人");
        linkMan.setCustomer(customer);
        customer.getLinkMans().add(linkMan);
        customerDao.delete(19L);
//        customerDao.save(customer);
//        linkManDao.save(linkMan);

    }

    @Test
    public void name() {
        Customer customer=new Customer();
        customer.setCustName("方哥哥6");
        LinkMan linkMan =new LinkMan();
        linkMan.setLkmName("圆哥哥6+联系人6");
        linkMan.setCustomer(customer);
        customer.getLinkMans().add(linkMan);

    }

    @Test
    @Transactional
    @Rollback(false)
    public void test2() {

        LinkMan linkMan = linkManDao.findOne(2L);
        System.out.println(linkMan);
        System.out.println(linkMan.getCustomer());

    }
}
