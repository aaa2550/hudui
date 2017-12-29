package com.hudui.service;

import com.hudui.pojo.HReply;
import com.hudui.pojo.HVote;
import org.jfaster.mango.annotation.SQL;

/**
 * Created by yanghailong on 2017/12/29.
 */
public interface IHVoteService {

    int insert(HVote hVote);

    HReply get(String themeId, String wxOpenid);

}
