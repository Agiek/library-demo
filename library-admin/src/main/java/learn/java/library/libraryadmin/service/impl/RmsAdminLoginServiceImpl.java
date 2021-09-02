package learn.java.library.libraryadmin.service.impl;

import learn.java.library.libraryadmin.dao.UserPermissionDao;
import learn.java.library.libraryadmin.mapper.RoleMapper;
import learn.java.library.libraryadmin.mapper.UserMapper;
import learn.java.library.libraryadmin.model.Role;
import learn.java.library.libraryadmin.model.RoleExample;
import learn.java.library.libraryadmin.model.User;
import learn.java.library.libraryadmin.model.UserExample;
import learn.java.library.libraryadmin.service.RmsAdminLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class RmsAdminLoginServiceImpl implements RmsAdminLoginService {

    UserMapper userMapper;
    RoleMapper roleMapper;
    UserPermissionDao userPermissionDao;

    @Autowired
    public RmsAdminLoginServiceImpl(UserMapper userMapper, RoleMapper roleMapper, UserPermissionDao userPermissionDao) {
        this.userMapper = userMapper;
        this.roleMapper = roleMapper;
        this.userPermissionDao = userPermissionDao;
    }



    @Override
    public User getUserByUsername(String username) {

        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> users = userMapper.selectByExample(userExample);
        if(users.isEmpty()) {
            return null;
        }
        return users.get(0);

    }

    @Override
    public Set<String> getRoleByRoleId(Long id) {
        RoleExample roleExample = new RoleExample();
        RoleExample.Criteria criteria = roleExample.createCriteria();
        criteria.andIdEqualTo(id);
        List<Role> roles = roleMapper.selectByExample(roleExample);
        if(roles.isEmpty()) {
            return null;
        }
        Set<String> roleNames = new HashSet<>();
        for(Role role : roles) {
            roleNames.add(role.getName());
        }
        return roleNames;
    }

    @Override
    public Set<String> getPermissionByRoleId(Long id) {
        List<String> permissions = userPermissionDao.getPermissionByRoleId(id);
        if(permissions.isEmpty()) {
            return null;
        }
        Set<String> permissionNames = new HashSet<>(permissions);//
        return permissionNames;
    }
}
