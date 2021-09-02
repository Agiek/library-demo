package learn.java.library.libraryadmin.service;

import learn.java.library.libraryadmin.model.User;

import java.util.Set;

public interface RmsAdminLoginService {

    public User getUserByUsername(String username);

    public Set<String> getRoleByRoleId(Long id);

    public Set<String> getPermissionByRoleId(Long id);

}
