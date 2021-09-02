package learn.java.library.libraryadmin.config;

import learn.java.library.libraryadmin.mapper.RoleMapper;
import learn.java.library.libraryadmin.model.User;
import learn.java.library.libraryadmin.service.RmsAdminLoginService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("authorizer")
class UserRealm extends AuthorizingRealm {

    RmsAdminLoginService rmsAdminLoginService;

    @Autowired
    public UserRealm(RmsAdminLoginService rmsAdminLoginService) {
        this.rmsAdminLoginService = rmsAdminLoginService;
    }


    // 10. 前面被roles拦截后，需要授权才能登录，SecurityManager需要调用这里进行权限查询
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");
        User user = (User)principalCollection.getPrimaryPrincipal();

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.setRoles(rmsAdminLoginService.getRoleByRoleId(user.getRoleId()));
        //默认数据库中user和role是多对一的关系,不存在user有多个role的情况(但是没有约束...)
        info.setStringPermissions(rmsAdminLoginService.getPermissionByRoleId(user.getRoleId()));
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行登录逻辑");
        UsernamePasswordToken token = (UsernamePasswordToken)authenticationToken;
        User user = rmsAdminLoginService.getUserByUsername(token.getUsername());

        if (token.getUsername() == null || !token.getUsername().equals(user.getUsername())){
            return null;
        }

        return new SimpleAuthenticationInfo(user, user.getPassword(), "UserRealm");
    }


}