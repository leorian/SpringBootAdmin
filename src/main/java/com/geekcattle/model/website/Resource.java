package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 * 资源
 */
@ClassComment("资源实体类")
@Table(name = "website_resource")
@Alias("WebSiteResource")
public class Resource extends BaseEntity {

    @FieldComment("主键ID")
    private String id;

    @FieldComment("标题")
    private String title;

    @FieldComment("简介")
    private String introduce;

    @FieldComment("内容")
    private String content;

    @FieldComment("隐藏区域")
    private String secretArea;

    @FieldComment("分类ID")
    private String categoryId;

    @FieldComment("标签ID")
    private String tagId;

    @FieldComment("是否免费")
    private Boolean free = false;

    @FieldComment("金币")
    private Long price = -1l;

    @FieldComment("资源图标-原始")
    private String icon;

    @FieldComment("资源图标-小型")
    private String iconSmall;

    @FieldComment("资源图标-大型")
    private String iconBig;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSecretArea() {
        return secretArea;
    }

    public void setSecretArea(String secretArea) {
        this.secretArea = secretArea;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
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
 * CREATE TABLE `website_resource` (
 * `id` varchar(32) DEFAULT NULL,
 * `title` varchar(256) DEFAULT NULL,
 * `introduce` varchar(512) DEFAULT NULL,
 * `content` varchar(4096) DEFAULT NULL,
 * `secret_area` varchar(4096) DEFAULT NULL,
 * `category_id` varchar(32) DEFAULT NULL,
 * `tag_id` varchar(32) DEFAULT NULL,
 * `free` tinyint(4) DEFAULT NULL,
 * `price` bigint(20) DEFAULT NULL,
 * `icon` varchar(256) DEFAULT NULL,
 * `icon_small` varchar(256) DEFAULT NULL,
 * `icon_big` varchar(256) DEFAULT NULL,
 * `create_id` varchar(64) DEFAULT NULL,
 * `create_date` datetime DEFAULT NULL,
 * `update_id` varchar(64) DEFAULT NULL,
 * `update_date` datetime DEFAULT NULL
 * ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
