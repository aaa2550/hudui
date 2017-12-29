package com.hudui.dao;

import com.hudui.pojo.HTheme;
import com.hudui.pojo.HUser;
import org.jfaster.mango.annotation.DB;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import javax.print.attribute.standard.PagesPerMinute;
import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@DB(table = "h_theme")
public interface HThemeDao {

    @SQL("insert into #table(id,title,content,img,video,operator_id,operator_name,praise_num,just_sum,back_sum,comment_sum,browse_sum,create_time,update_time) " +
            "values(:1.id,:1.title,:1.content,:1.img,:1.video,:1.operatorId,:1.operatorName,:1.praiseNum,:1.justSum,:1.backSum,:1.commentSum,:1.browseSum,now(),now())")
    int insert(HTheme hTheme);

    @SQL("select id,title,content,img,video,operator_id,operator_name,praise_num,just_sum,back_sum,comment_sum,browse_sum,create_time,update_time from #table where id=:1")
    HTheme get(String id);

    @SQL("select id,title,content,img,video,operator_id,operator_name,praise_num,just_sum,back_sum,comment_sum,browse_sum,create_time,update_time from #table where create_time<:1 order by create_time desc")
    List<HTheme> find(Date createTime, Page page);

}
