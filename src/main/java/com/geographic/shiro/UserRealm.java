package com.geographic.shiro;

import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.util.ByteSource;
import org.springframework.boot.SpringApplication;
import com.geographic.entity.User;
import com.geographic.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by zhoudachao on 2018/7/24.
 */
public class UserRealm extends AuthorizingRealm {

    @Autowired
    private UserService userService;
    /**
     * 执行授权逻辑
     *
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        System.out.println("执行授权逻辑");

        //给资源进行授权
        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();

        //添加资源的授权字符串
        //info.addStringPermission("user:add");

        //到数据库查询当前登录用户的授权字符串
        //获取当前登录用户
        System.out.println("获取当前用户");
        Subject subject = SecurityUtils.getSubject();
        User user = (User) subject.getPrincipal();
        System.out.println(user.getUserName());
        User dbUser = userService.findById(user.getUserId());
        System.out.println(dbUser.getUserName()+"的权限代码"+dbUser.getPerms());
        info.addStringPermission(dbUser.getPerms());


        return info;
    }
    /**
     * 执行认证逻辑
     *
     * @return
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        System.out.println("执行认证逻辑");
        //编写shiro判断逻辑，判断用户名和密码
        //1.判断用户名
        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;

        User user = userService.queryUserByName(token.getUsername());
        System.out.println(user.getUserName());
        if (user==null){
            //用户名不存在
            return  null;//shiro底层会抛出UnknownAccountException
        }
        //2.判断密码
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,user.getUserPassword(),"");

        //加盐
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(user.getUserName()));

        return authenticationInfo;

    }

}
