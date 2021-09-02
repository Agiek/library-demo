package learn.java.library.libraryadmin.dao;

import learn.java.library.libraryadmin.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserPermissionDao {

    @Select("SELECT p.name FROM role_permission rp, permission p " +
            "WHERE rp.permission_id = p.id " +
            "AND rp.role_id = #{id}")
    public List<String> getPermissionByRoleId(@Param("id") Long id);

}
