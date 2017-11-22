package com.geekcattle.controller.website;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xiezg@317hu.com on 2017/11/22 0022.
 */
@Controller
@RequestMapping("/website/role")
@Component("WebSiteRoleController")
public class RoleController {

    @RequiresPermissions("website:role")
    @RequestMapping(value = "/index", method = {RequestMethod.GET})
    public String index(Model model) {
        return "website/role/index";
    }
}
