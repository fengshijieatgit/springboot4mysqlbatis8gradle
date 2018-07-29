/**
 * Company
 * Copyright (C) 2004-2018 All Rights Reserved.
 */
package com.jesse.server.action;

/**
 * @author Auser
 * @version $Id UserController.java, v 0.1 2018-07-24 22:51 Auser Exp $$
 */

import com.alibaba.fastjson.JSONArray;
import com.jesse.server.domain.User;
import com.jesse.server.service.impl.UserService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户中心
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping("/getUserById")
    @ResponseBody
    public String getUserById(@RequestParam(name = "id", defaultValue = "1") Integer id) {
        User user = userService.getUserInfo(id);
        if (user != null) {
//            System.out.println("console 输出结果 user:" + user);
            logger.info("logger 输出结果:"+JSONArray.toJSON(user));
            Integer uid = user.getUserId() + 1;
            user.setUserId(null);
            user.setUserName(user.getUserName() + uid);
            userService.registerUser(user);
        }
        return "ffff";
    }
}
