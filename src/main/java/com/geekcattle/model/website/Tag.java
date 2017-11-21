package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import javax.persistence.Table;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 * 标签
 */
@ClassComment("标签实体类")
@Table(name = "website_tag")
@Alias("WebSiteTag")
public class Tag extends BaseEntity {

    @FieldComment("主键ID")
    private String id;

    @FieldComment("标签编码")
    private String code;

    @FieldComment("标签名称")
    private String name;

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

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
