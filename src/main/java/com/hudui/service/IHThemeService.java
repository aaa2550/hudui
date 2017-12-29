package com.hudui.service;

import com.hudui.pojo.HTheme;
import org.jfaster.mango.annotation.SQL;
import org.jfaster.mango.plugin.page.Page;

import java.util.Date;
import java.util.List;

/**
 * Created by yanghailong on 2017/12/29.
 */
public interface IHThemeService {

    int insert(HTheme hTheme);

    HTheme get(String id);

    List<HTheme> find(Date createTime, Page page);

}
