/**
 * Copyright (C), 2015-2019, XXX有限公司
 * FileName: UserInfoMapper
 * Author:   VULCAN
 * Date:     2019/8/14 23:15
 * Description: userInfo数据访问层
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.atguigu.gmall0311test.gmallusermanage.mapper;

import com.atguigu.gmall0311test.gmallusermanage.bean.UserInfo;
import tk.mybatis.mapper.common.Mapper;

/**
 * 〈一句话功能简述〉<br>
 * 〈userInfo数据访问层〉
 *
 * @author VULCAN
 * @create 2019/8/14 23:15
 * @since 1.0.0 <br>
 */
// 泛型规定：看你是操作的哪个实体类！ 数据访问层
public interface UserInfoMapper extends Mapper<UserInfo> {
}
