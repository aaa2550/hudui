package com.hudui.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Data
public class HUser extends Pojo {

    private String id;
    private String wxOpenid;   //微信OPENID
    private String wxNickname; //微信昵称
    private Integer sex;    //值为1时是男性，值为2时是女性，值为0时是未知
    private String city;    //所在城市
    private String province;    //用户所在省份
    private String headImg;  //用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。
    private Date createTime;    //创建时间
    private Date updateTime;    //更新时间

}
