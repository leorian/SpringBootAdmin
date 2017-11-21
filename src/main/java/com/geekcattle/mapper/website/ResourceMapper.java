package com.geekcattle.mapper.website;

import com.geekcattle.model.website.Resource;
import com.geekcattle.util.CustomerMapper;
import org.springframework.stereotype.Component;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 */
@Component("websiteResourceMapper")
public interface ResourceMapper extends CustomerMapper<Resource> {
}
