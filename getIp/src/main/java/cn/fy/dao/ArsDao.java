package cn.fy.dao;

import cn.fy.domain.Ars;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ArsDao {

    @Select("select * from ars ")
    public List<Ars> findAll();

    //添加ip
    @Insert("insert into ars(aip,action) values (#{aip},#{action})")
    public void addArsIp(Ars ars);

    @Delete("delete from ars where id =#{id}")
    public void delByid(Integer id);

    @Select("select count(*) from ars ")
    public Integer countIp();
}
