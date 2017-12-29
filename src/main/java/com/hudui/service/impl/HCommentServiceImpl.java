package com.hudui.service.impl;

import com.hudui.dao.HCommentDao;
import com.hudui.pojo.HComment;
import com.hudui.service.IHCommentService;
import org.jfaster.mango.plugin.page.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Service
public class HCommentServiceImpl implements IHCommentService {

    @Resource
    private HCommentDao hCommentDao;

    @Override
    public int insert(HComment hComment) {
        return hCommentDao.insert(hComment);
    }

    @Override
    public HComment get(String id) {
        return hCommentDao.get(id);
    }

    @Override
    public List<HComment> find(String themeId, Date createTime, Page page) {
        return hCommentDao.find(themeId, createTime, page);
    }
}
