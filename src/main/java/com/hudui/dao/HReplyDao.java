package com.hudui.dao;

import com.hudui.pojo.HComment;
import com.hudui.pojo.HReply;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@DB(table = "h_reply")
public interface HReplyDao {

    @SQL("insert into #table(id,theme_id,reply_id,create_wx_openid,create_wx_nickname,create_wx_head_img,praise_num,diss_num,content,img,video,voice,create_time,update_time) " +
            "values(:1.id,:1.themeId,:1.replyId,:1.createWxOpenid,:1.createWxNickname,:1.createWxHeadImg,:1.praiseNum,:1.dissNum,:1.content,:1.img,:1.video,:1.voice,now(),now())")
    int insert(HReply hReply);

    @SQL("select id,theme_id,reply_id,create_wx_openid,create_wx_nickname,create_wx_head_img,praise_num,diss_num,content,img,video,voice,create_time,update_time from #table where id=:1")
    HReply get(String id);

    @SQL("select id,theme_id,reply_id,create_wx_openid,create_wx_nickname,create_wx_head_img,praise_num,diss_num,content,img,video,voice,create_time,update_time from #table where reply_id in (:1) and create_time<:2 order by create_time desc")
    List<HReply> find(List<String> replyIds, Date createTime, Page page);

}
