package cn.fy.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long roleId;

    private String roleName;
/*    @ManyToMany(targetEntity = User.class,cascade = CascadeType.ALL)
    @JoinTable(name = "sys_user_role",
            //joinColumns,当前对象在中间表中的外键
            inverseJoinColumns = {@JoinColumn(name = "sys_userId",referencedColumnName = "userId")},
            //inverseJoinColumns，对方对象在中间表的外键
            joinColumns = {@JoinColumn(name = "sys_roleId",referencedColumnName = "roleId")}
    )*/
@ManyToMany(mappedBy = "roles")
    private Set<User> users = new HashSet<>();

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
}
