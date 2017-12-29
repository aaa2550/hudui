package com.hudui.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Data
public class HVote extends Pojo {

    private Integer themeId;    //对应主题ID
    private String wxOpenid;    //微信openID
    private Integer justBack;    //支持还是反对，0支持，1反对
    private Date createTime;    //创建时间

}
