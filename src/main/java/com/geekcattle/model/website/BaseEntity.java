package com.geekcattle.model.website;

import com.alibaba.fastjson.JSON;
import com.geekcattle.annotation.ClassComment;
import com.geekcattle.annotation.FieldComment;
import org.apache.ibatis.type.Alias;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 */
@ClassComment("基础实体类")
@Alias("WebSiteBaseEntity")
public class BaseEntity implements Serializable {

    @FieldComment("创建人")
    private String createId;

    @FieldComment("创建时间")
    private Date createDate;

    @FieldComment("更新人")
    private String updateId;

    @FieldComment("更新时间")
    private Date updateDate;

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getUpdateId() {
        return updateId;
    }

    public void setUpdateId(String updateId) {
        this.updateId = updateId;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return JSON.toJSONString(this);
    }
}
