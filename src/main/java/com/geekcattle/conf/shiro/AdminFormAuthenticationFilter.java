/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.geekcattle.conf.shiro;

import com.geekcattle.conf.LoginEnum;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * author geekcattle
 * date 2017/3/21 0021 下午 16:33
 */
public class AdminFormAuthenticationFilter extends FormAuthenticationFilter {

    @Override
    protected boolean isAccessAllowed(ServletRequest request, ServletResponse response, Object mappedValue) {
        return super.isAccessAllowed(request, response, mappedValue);
    }

    @Override
    public void setLoginUrl(String loginUrl) {
        super.setLoginUrl("/console/login");
    }

    @Override
    public void setSuccessUrl(String successUrl) {
        super.setSuccessUrl("/console/index");
    }

}
