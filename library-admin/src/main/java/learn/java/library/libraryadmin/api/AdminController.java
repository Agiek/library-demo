package learn.java.library.libraryadmin.api;

import learn.java.library.libraryadmin.model.Book;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
//@RequiresPermissions("user:insert")
@RequestMapping("api/admin")
public class AdminController {

    @RequestMapping(value = "/special",method = RequestMethod.GET)
    public String  adminSpecial() {
        return "Hi! This is admin special! Made for test.\n requires \"user:insert\" permission";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }


    @PostMapping("/login")
    public String login(@RequestParam String username, @RequestParam String password) {
        //  System.out.println(details);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        token.setRememberMe(false);
        if (subject.isAuthenticated()) {
            System.out.println("已登录");
            return "redirect:api/admin/index";
        }
        try{
            subject.login(token);
        }catch (UnknownAccountException e){
            System.out.println("用户名不存在");
            return "用户名不存在";
        }catch (AuthenticationException e) {
            System.out.println("认证失败");
            return "认证失败";
        }

        System.out.println("登录成功");
        return "redirect:api/admin/index";

    }


    @GetMapping("/logout")
    public String logout() {
        SecurityUtils.getSubject().logout();
        return "redirect:/login";
    }



}
