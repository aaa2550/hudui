package com.hudui.service;

import com.hudui.pojo.HComment;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
public interface IHCommentService {

    int insert(HComment hComment);

    HComment get(String id);

    List<HComment> find(String themeId, Date createTime, Page page);

}
