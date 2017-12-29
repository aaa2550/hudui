package com.hudui.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Data
public class HReply extends Pojo {

    private String id;
    private Integer themeId;   //对应主题ID
    private Integer replyId;   //回复评论ID
    private String createWxOpenid;   //发帖人微信openID
    private String createWxNickname;   //发帖人微信昵称
    private String createWxHeadImg;   //发帖人微信头像
    private Integer praiseNum;   //评论点赞次数
    private Integer dissNum;   //评论diss次数
    private String content;   //评论内容
    private String img;   //图片路径
    private String video;   //视频路径
    private String voice;   //语音路径
    private Date createTime;   //创建时间
    private Date updateTime;   //更新时间
    
}
