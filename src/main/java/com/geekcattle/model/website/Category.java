package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 * 分类
 */
@ClassComment("分类实体类")
@Table(name = "website_category")
@Alias("WebSiteCategory")
public class Category extends BaseEntity {

    @FieldComment("主键ID")
    private String id;

    @FieldComment("分类编码")
    private String code;

    @FieldComment("分类名称")
    private String name;

    @FieldComment("父分类ID")
    private String parentId;

    @FieldComment("分类图标-原始")
    private String icon;

    @FieldComment("分类图标-小型")
    private String iconSmall;

    @FieldComment("分类图标-大型")
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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
