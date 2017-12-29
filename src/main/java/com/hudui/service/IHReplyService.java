package com.hudui.service;

import com.hudui.pojo.HReply;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
public interface IHReplyService {

    int insert(HReply hReply);

    HReply get(String id);

    List<HReply> find(List<String> replyIds, Date createTime, Page page);
}
