package com.hudui.pojo;

import lombok.Data;

import java.util.Date;

/**
 * Created by yanghailong on 2017/12/29.
 */
@Data
public class HTheme extends Pojo {

    private String id;
    private String title;   //标题
    private String content; //内容
    private String img;    //图片路径
    private String video;    //'图片路径
    private Integer operatorId;    //操作员ID
    private String operatorName;    //操作员名称
    private Integer praiseNum;    //话题点赞次数
    private Integer justSum;    //正数量
    private Integer backSum;    //反数量
    private Integer commentSum;    //评论量
    private Integer browseSum;    //浏览量
    private Date createTime;    //'创建时间
    private Date updateTime;    //更新时间
    
}
