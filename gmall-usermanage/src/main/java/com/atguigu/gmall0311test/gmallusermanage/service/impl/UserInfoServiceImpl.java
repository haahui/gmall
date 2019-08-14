/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfoServiceImpl
 * Author:   VULCAN
 * Date:     2019/8/14 23:14
 * Description: userInfoService实现类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu.gmall0311test.gmallusermanage.service.impl;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;
import com.atguigu.gmall0311test.gmallusermanage.mapper.UserInfoMapper;
import com.atguigu.gmall0311test.gmallusermanage.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈userInfoService实现类〉
 *
 * @author VULCAN
 * @create 2019/8/14 23:14
 * @since 1.0.0 <br>
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }
}
