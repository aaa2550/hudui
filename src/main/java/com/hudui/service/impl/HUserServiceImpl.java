package com.hudui.service.impl;

import com.hudui.dao.HUserDao;
import com.hudui.pojo.HUser;
import com.hudui.service.IHUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Service
public class HUserServiceImpl implements IHUserService {

    @Resource
    private HUserDao hUserDao;

    @Override
    public int insert(HUser hUser) {
        return hUserDao.insert(hUser);
    }

    @Override
    public HUser getByOpenId(String wxOpenid) {
        return hUserDao.getByOpenId(wxOpenid);
    }
}
