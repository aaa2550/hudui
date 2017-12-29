CREATE DATABASE HUDUI;

--  用户表
DROP TABLE IF EXISTS h_user;
CREATE TABLE h_user(
id VARCHAR(255) PRIMARY KEY,
wx_openid VARCHAR(255) NOT NULL COMMENT '微信OPENID',
wx_nickname VARCHAR(255) NOT NULL COMMENT '微信昵称',
sex INT(4) NOT NULL COMMENT '值为1时是男性，值为2时是女性，值为0时是未知',
city VARCHAR(255) COMMENT '所在城市',
province VARCHAR(255) NOT NULL COMMENT '用户所在省份',
head_img	 VARCHAR(500) COMMENT '用户头像，最后一个数值代表正方形头像大小（有0、46、64、96、132数值可选，0代表640*640正方形头像），用户没有头像时该项为空。若用户更换头像，原有头像URL将失效。',
create_time DATETIME NOT NULL COMMENT '创建时间',
update_time DATETIME NOT NULL COMMENT '更新时间'
);
CREATE INDEX INDEX_WX_OPENID ON WX_OPENID(wx_openid);

--  主题表
DROP TABLE IF EXISTS h_theme;
CREATE TABLE h_theme(
id VARCHAR(255) PRIMARY KEY,
title VARCHAR(255) NOT NULL COMMENT '标题',
content VARCHAR(1000) DEFAULT NULL COMMENT '内容',
img VARCHAR(1000) COMMENT '图片路径',
video VARCHAR(1000) COMMENT '图片路径'
operator_id INT(11) NOT NULL COMMENT '操作员ID',
operator_name VARCHAR(255) NOT NULL COMMENT '操作员名称',
praise_num INT(11) NOT NULL DEFAULT 0 COMMENT '话题点赞次数',
just_sum INT(11) NOT NULL DEFAULT 0 COMMENT '正数量',
back_sum INT(11) NOT NULL DEFAULT 0 COMMENT '反数量',
comment_sum INT(11) NOT NULL DEFAULT 0 COMMENT '评论量',
browse_sum INT(11) NOT NULL DEFAULT 0 COMMENT '浏览量',
create_time DATETIME NOT NULL COMMENT '创建时间',
update_time DATETIME NOT NULL COMMENT '更新时间'
);
CREATE INDEX INDEX_WX_OPENID ON WX_OPENID(wx_openid);

--  主评论表(按主题ID分表)
DROP TABLE IF EXISTS h_comment;
CREATE TABLE h_comment(
id VARCHAR(255) PRIMARY KEY,
theme_id INT(11) NOT NULL DEFAULT 0 COMMENT '对应主题ID',
create_wx_openid VARCHAR(255) NOT NULL COMMENT '发帖人微信openID',
create_wx_nickname VARCHAR(255) NOT NULL COMMENT '发帖人微信昵称',
create_wx_head_img VARCHAR(500) NOT NULL COMMENT '发帖人微信头像',
praise_num INT(11) DEFAULT 0 COMMENT '评论点赞次数',
diss_num INT(11) DEFAULT 0 COMMENT '评论diss次数',
content VARCHAR(1000) NOT NULL COMMENT '评论内容',
img VARCHAR(1000) COMMENT '图片路径',
video VARCHAR(500) COMMENT '视频路径',
voice VARCHAR(500) COMMENT '语音路径',
create_time DATETIME NOT NULL COMMENT '创建时间',
update_time DATETIME NOT NULL COMMENT '更新时间'
);
CREATE INDEX INDEX_THEME_ID ON INDEX_THEME_ID(theme_id);

--  回复表(按主题ID分表)
DROP TABLE IF EXISTS h_reply;
CREATE TABLE h_reply(
id VARCHAR(255) PRIMARY KEY,
theme_id INT(11) NOT NULL DEFAULT 0 COMMENT '对应主题ID',
reply_id INT(11) COMMENT '回复评论ID',
create_wx_openid VARCHAR(255) NOT NULL COMMENT '发帖人微信openID',
create_wx_nickname VARCHAR(255) NOT NULL COMMENT '发帖人微信昵称',
create_wx_head_img VARCHAR(500) NOT NULL COMMENT '发帖人微信头像',
praise_num INT(11) DEFAULT 0 COMMENT '评论点赞次数',
diss_num INT(11) DEFAULT 0 COMMENT '评论diss次数',
content VARCHAR(1000) NOT NULL COMMENT '评论内容',
img VARCHAR(1000) COMMENT '图片路径，只有为主评论时存在',
video VARCHAR(500) COMMENT '视频路径，只有为主评论时存在',
voice VARCHAR(500) COMMENT '语音路径，只有为主评论时存在',
create_time DATETIME NOT NULL COMMENT '创建时间',
update_time DATETIME NOT NULL COMMENT '更新时间',
);
CREATE INDEX INDEX_REPLY_ID ON INDEX_REPLY_ID(reply_id);

--  投票表(按主题ID分表)
DROP TABLE IF EXISTS h_vote;
CREATE TABLE h_vote(
theme_id INT(11) NOT NULL COMMENT '对应主题ID',
wx_openid VARCHAR(255) NOT NULL COMMENT '微信openID',
just_back INT(2) NOT NULL DEFAULT 0 COMMENT '支持还是反对，0支持，1反对',
create_time DATETIME NOT NULL COMMENT '创建时间'
PRIMARY KEY(theme_id,wx_openid)
);