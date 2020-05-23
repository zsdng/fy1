package cn.fy.dao;

import cn.fy.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface RoleDao extends JpaSpecificationExecutor<Role>, JpaRepository<Role,Long> {
}
