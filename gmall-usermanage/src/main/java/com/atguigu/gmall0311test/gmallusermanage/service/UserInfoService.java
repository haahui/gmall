/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfoService
 * Author:   VULCAN
 * Date:     2019/8/14 23:12
 * Description: userInfo接口
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu.gmall0311test.gmallusermanage.service;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈userInfo接口〉
 *
 * @author VULCAN
 * @create 2019/8/14 23:12
 * @since 1.0.0 <br>
 */
public interface UserInfoService {

    /**
     * 查询所有用户数据
     *
     * @return
     */
    List<UserInfo> findAll();

    /**
     * @param name
     * @return
     */
    UserInfo getUserInfoByName(String name);
}
