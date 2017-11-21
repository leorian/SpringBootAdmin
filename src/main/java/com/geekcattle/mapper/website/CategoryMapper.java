package com.geekcattle.mapper.website;

import com.geekcattle.model.website.Category;
import com.geekcattle.model.website.Role;
import com.geekcattle.util.CustomerMapper;
import org.springframework.stereotype.Component;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 */
@Component("websiteCategoryMapper")
public interface CategoryMapper extends CustomerMapper<Category> {
}
