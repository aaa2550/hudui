package com.hudui.service.impl;

import com.hudui.dao.HReplyDao;
import com.hudui.pojo.HReply;
import com.hudui.service.IHReplyService;
import org.jfaster.mango.plugin.page.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Service
public class HReplyServiceImpl implements IHReplyService {

    @Resource
    private HReplyDao hReplyDao;

    @Override
    public int insert(HReply hReply) {
        return hReplyDao.insert(hReply);
    }

    @Override
    public HReply get(String id) {
        return hReplyDao.get(id);
    }

    @Override
    public List<HReply> find(List<String> replyIds, Date createTime, Page page) {
        return hReplyDao.find(replyIds, createTime, page);
    }
}
