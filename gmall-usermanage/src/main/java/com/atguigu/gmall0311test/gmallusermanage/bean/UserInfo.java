/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfo
 * Author:   VULCAN
 * Date:     2019/8/14 23:03
 * Description: userInfo实体类
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu.gmall0311test.gmallusermanage.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 〈一句话功能简述〉<br>
 * 〈userInfo实体类〉
 *
 * @author VULCAN
 * @create 2019/8/14 23:03
 * @since 1.0.0 <br>
 */
/*
一个实体类通常具备 属性，get,set
 */
@Data
public class UserInfo {

    @Id         //表示主键
    @Column          //列名
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // 获取主键自增！ IDENTITY 表示mysql ，oracle:AUTO
    private String id;

    @Column
    private String loginName;

    @Column
    private String nickName;

    @Column
    private String passwd;

    @Column
    private String name;

    @Column
    private String phoneNum;

    @Column
    private String email;

    @Column
    private String headImg;

    @Column
    private String userLevel;

}
