package cn.fy.dao;

import cn.fy.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerDao extends JpaRepository<Customer,Long>, JpaSpecificationExecutor<Customer> {

    @Query(value = "from Customer where custName = ?1 ")
    public List <Customer> findJpql(String custName);

    @Query(value = "from Customer where custName = ?1  and custLevel = ?2 ")
    public List <Customer> findJpql2(String name ,String id);
}
