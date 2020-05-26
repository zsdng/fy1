package cn.fy.dao;

import cn.fy.domain.User;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {

    /**
     * 查询用户列表
     */
    @Select("select * from user")
    List<User> findAll();

    /**
     * 根据id查询
     */
    @Select("select * from user where id = #{id}")
    User findByid(Integer id);

    /**
     * 更新用户
     * @param user
     */
    @Update("update user set username =#{username},password=#{password},age=#{age},sex=#{sex},email=#{email} where id=#{id}")
    void updateUser(User user);


}
