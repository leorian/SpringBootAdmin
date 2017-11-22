package com.geekcattle.mapper.website;

import com.geekcattle.model.website.User;
import com.geekcattle.util.CustomerMapper;
import org.springframework.stereotype.Component;

/**
 * Created by xiezg@317hu.com on 2017/11/21 0021.
 */
@Component("websiteUserMapper")
public interface UserMapper extends CustomerMapper<User>{

}
