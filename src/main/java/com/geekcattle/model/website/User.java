package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 * 用户
 */
@ClassComment("用户实体类")
@Table(name = "website_user")
@Alias("WebSiteUser")
public class User extends BaseEntity {

    @FieldComment("主键ID")
    private String id;

    @FieldComment("用户名")
    private String name;

    @FieldComment("邮箱")
    private String email;

    @FieldComment("QQ号")
    private String qq;

    @FieldComment("手机号")
    private String cellPhone;

    @FieldComment("密码")
    private String password;

    @FieldComment("角色ID")
    private String roleId;

    @FieldComment("金币")
    private Long gold = -1l;

    @FieldComment("积分")
    private Long point = -1l;

    @FieldComment("用户图标-原始")
    private String icon;

    @FieldComment("用户图标-小型")
    private String iconSmall;

    @FieldComment("用户图标-大型")
    private String iconBig;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Long getGold() {
        return gold;
    }

    public void setGold(Long gold) {
        this.gold = gold;
    }

    public Long getPoint() {
        return point;
    }

    public void setPoint(Long point) {
        this.point = point;
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
