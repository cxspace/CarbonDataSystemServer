CREATE TABLE t_user(

  id BIGINT NOT NULL AUTO_INCREMENT,

  name VARCHAR(50) DEFAULT NULL COMMENT '姓名',

  phone VARCHAR(50) DEFAULT NULL COMMENT '手机号',

  email VARCHAR(60) DEFAULT NULL COMMENT '邮箱',

  status INT COMMENT '用户状态',

  password VARCHAR(60) DEFAULT NULL COMMENT '密码',

  imgsrc VARCHAR(80) DEFAULT NULL COMMENT '头像链接',

  PRIMARY KEY (id)

)DEFAULT CHARSET = utf8;


CREATE TABLE t_story(

  id BIGINT NOT NULL AUTO_INCREMENT,

  iconsrc VARCHAR(60) COMMENT 'icon图片的地址',

  title VARCHAR(300) DEFAULT NULL COMMENT '故事标题',

  create_time VARCHAR(60) COMMENT '创建时间',

  imgsrc VARCHAR(80) DEFAULT NULL COMMENT '标题页图片',

  content LONGTEXT COMMENT '故事内容',

  PRIMARY KEY (id)

) DEFAULT CHARSET = utf8;

CREATE TABLE t_share(

  id BIGINT NOT NULL AUTO_INCREMENT,

  user_id VARCHAR(36) COMMENT '发布分享用户id',

  create_time VARCHAR(60) COMMENT '发布的时间',

  imgsrc VARCHAR(80) DEFAULT NULL COMMENT '分享的图片',

  content LONGTEXT COMMENT '分享的文字',

  support BIGINT COMMENT '点赞次数',

  status INT COMMENT '分享信息状态',

  comment_count BIGINT COMMENT '评论条数',

  PRIMARY KEY (id)

)DEFAULT CHARSET = utf8;


CREATE TABLE t_comment(

  id BIGINT NOT NULL AUTO_INCREMENT,

  share_id VARCHAR(36)  COMMENT '对应的分享的id',

  user_id VARCHAR(36) COMMENT '发布评论用户的id',

  create_time VARCHAR(60) COMMENT '发布评论的时间',

  status INT COMMENT '评论信息状态',

  content LONGTEXT COMMENT '评论内容',

  PRIMARY KEY (id)

)DEFAULT CHARSET = utf8;


CREATE TABLE year_month(

  id BIGINT NOT NULL AUTO_INCREMENT,

  year int ,

  month TINYINT,

  PRIMARY KEY (id)
)







