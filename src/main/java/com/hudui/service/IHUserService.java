package com.hudui.service;

import com.hudui.pojo.HUser;
import org.jfaster.mango.annotation.SQL;

/**
 * Created by yanghailong on 2017/12/29.
 */
public interface IHUserService {

    int insert(HUser hUser);

    HUser getByOpenId(String wxOpenid);

}
