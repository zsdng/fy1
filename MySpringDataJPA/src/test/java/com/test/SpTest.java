package com.test;

import cn.fy.dao.CustomerDao;
import cn.fy.domain.Customer;
import cn.fy.utils.JpaUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.*;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class SpTest {
    @Autowired
    private CustomerDao customerDao;


    @Test
    public void findSpec() {
        Specification<Customer> spec=new Specification<Customer>() {
            @Override
            public Predicate toPredicate(Root<Customer> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                Path<Object> custName = root.get("custName");
                Path<Object> custLevel = root.get("custLevel");
                Predicate predicate1 = cb.equal(custName, "王培毅");
                Predicate predicate2 = cb.equal(custLevel, "4242");
                return cb.or(predicate1, predicate2);
            }
        };
        System.out.println(customerDao.findAll(spec));
        System.out.println("------------");
    }

    @Test
    public void test3() {
        Specification<Customer> specification= (root, query, cb) -> {
            Path<String> custName = root.get("custName");
            Predicate like = cb.like(custName, "%王%");
            return like;
        };
        customerDao.findAll(specification).forEach(System.out::println);
        System.out.println("---------");

        Sort sort =new Sort(Sort.Direction.DESC,"custId");
        customerDao.findAll(specification, sort ).forEach(System.out::println);
        Pageable pageable =new PageRequest(0,3);
        Page<Customer> all = customerDao.findAll(pageable);
        System.out.println("---------");
        all.forEach(System.out::println);
        System.out.println(all.nextPageable());
        System.out.println("总页码："+all.getTotalElements());


    }
}
