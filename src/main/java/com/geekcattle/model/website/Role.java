package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 * 角色 （普通会员，黄金会员（一年），钻石会员（终身））
 */
@ClassComment("角色实体类")
@Table(name = "website_role")
@Alias("WebSiteRole")
public class Role extends BaseEntity {

    @FieldComment("主键ID")
    private String id;

    @FieldComment("角色编码")
    private String code;

    @FieldComment("角色名称")
    private String name;

    @FieldComment("角色图标-原始")
    private String icon;

    @FieldComment("角色图标-小型")
    private String iconSmall;

    @FieldComment("角色图标-大型")
    private String iconBig;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getIconSmall() {
        return iconSmall;
    }

    public void setIconSmall(String iconSmall) {
        this.iconSmall = iconSmall;
    }

    public String getIconBig() {
        return iconBig;
    }

    public void setIconBig(String iconBig) {
        this.iconBig = iconBig;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}

/**
 * CREATE TABLE `website_role` (
 * `id` varchar(32) DEFAULT NULL,
 * `code` varchar(128) DEFAULT NULL,
 * `name` varchar(256) DEFAULT NULL,
 * `icon` varchar(256) DEFAULT NULL,
 * `icon_small` varchar(256) DEFAULT NULL,
 * `icon_big` varchar(256) DEFAULT NULL,
 * `create_id` varchar(64) DEFAULT NULL,
 * `create_date` datetime DEFAULT NULL,
 * `update_id` varchar(64) DEFAULT NULL,
 * `update_date` datetime DEFAULT NULL
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */