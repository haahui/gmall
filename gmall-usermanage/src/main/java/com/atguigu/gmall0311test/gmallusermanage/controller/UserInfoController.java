/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfoController
 * Author:   VULCAN
 * Date:     2019/8/14 23:19
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu.gmall0311test.gmallusermanage.controller;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall0311test.gmallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈控制层〉
 *
 * @author VULCAN
 * @create 2019/8/14 23:19
 * @since 1.0.0 <br>
 */
@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<UserInfo> findAll() {
        return userInfoService.findAll();
    }
}
