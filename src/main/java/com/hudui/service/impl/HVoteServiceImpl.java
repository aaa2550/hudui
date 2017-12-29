package com.hudui.service.impl;

import com.hudui.dao.HVoteDao;
import com.hudui.pojo.HReply;
import com.hudui.pojo.HVote;
import com.hudui.service.IHVoteService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Service
public class HVoteServiceImpl implements IHVoteService {

    @Resource
    private HVoteDao hVoteDao;

    @Override
    public int insert(HVote hVote) {
        return hVoteDao.insert(hVote);
    }

    @Override
    public HReply get(String themeId, String wxOpenid) {
        return hVoteDao.get(themeId, wxOpenid);
    }
}
