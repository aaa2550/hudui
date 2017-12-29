package com.hudui.service.impl;

import com.hudui.dao.HThemeDao;
import com.hudui.pojo.HTheme;
import com.hudui.service.IHThemeService;
import org.jfaster.mango.plugin.page.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Service
public class HThemeServiceImpl implements IHThemeService {

    @Resource
    private HThemeDao hThemeDao;

    @Override
    public int insert(HTheme hTheme) {
        return hThemeDao.insert(hTheme);
    }

    @Override
    public HTheme get(String id) {
        return hThemeDao.get(id);
    }

    @Override
    public List<HTheme> find(Date createTime, Page page) {
        return hThemeDao.find(createTime, page);
    }
}
