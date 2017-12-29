package com.hudui.dao;

import com.hudui.pojo.HUser;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;

/**
 * Created by yanghailong on 2017/12/29.
 */
@DB(table = "h_user")
public interface HUserDao {

    @SQL("insert into #table(id,title,content,img,video,operator_id,operator_name,praise_num,just_sum,back_sum,comment_sum,browse_sum,create_time,update_time) " +
            "values(:1.id,:1.wxOpenid,:1.wxNickname,:1.sex,:1.city,:1.province,:1.headImg,now(),now())")
    int insert(HUser hUser);

    @SQL("select id,wx_openid,wx_nickname,sex,city,province,head_img,create_time,update_time from #table where wx_openid=:1")
    HUser getByOpenId(String wxOpenid);
}
