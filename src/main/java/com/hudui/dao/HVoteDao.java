package com.hudui.dao;

import com.hudui.pojo.HReply;
import com.hudui.pojo.HVote;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@DB(table = "h_vote")
public interface HVoteDao {

    @SQL("insert into #table(theme_id,wx_openid,just_back,create_time) " +
            "values(:1.themeId,:1.wxOpenid,:1.justBack,now())")
    int insert(HVote hVote);

    @SQL("select theme_id,wx_openid,just_back,create_time from #table where theme_id=:1 and wx_openid=:2")
    HReply get(String themeId, String wxOpenid);

}
