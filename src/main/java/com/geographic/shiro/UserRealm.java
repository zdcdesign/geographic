package com.geographic.shiro;

import com.geographic.entity.TbPower;
import com.geographic.entity.TbUser;
import com.geographic.service.TbUserService;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.util.ByteSource;
import org.springframework.boot.SpringApplication;

import com.geographic.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;

import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by zhoudachao on 2018/7/24.
 */
public class UserRealm extends AuthorizingRealm {

   /* @Autowired
    private UserService userService;*/

    @Autowired
    private TbUserService tbUserService;
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
        TbUser tbUser = (TbUser) subject.getPrincipal();
        System.out.println(tbUser.getUsername());
        TbUser dbUser = tbUserService.findById(tbUser.getId());
        //根据用户id查询相关的权限代码
        List<TbPower> powerList = tbUserService.findUserPower(tbUser.getId());
        //System.out.println(dbUser.getUsername()+"的权限代码"+);
        //把权限代码然后相应的过滤器中
        for(TbPower power : powerList ){
            System.out.println(power.getCode());
            info.addStringPermission(power.getCode());
        }
        //info.addStringPermission(dbUser.getPerms());


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

        TbUser tbUser = tbUserService.queryUserByName(token.getUsername());
        System.out.println(tbUser.getUsername());
        if (tbUser==null){
            //用户名不存在
            return  null;//shiro底层会抛出UnknownAccountException
        }
        //2.判断密码
        SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(tbUser,tbUser.getPassword(),"");

        //加盐
        authenticationInfo.setCredentialsSalt(ByteSource.Util.bytes(tbUser.getUsername()));

        return authenticationInfo;

    }

}
