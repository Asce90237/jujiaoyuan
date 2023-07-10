package com.qimu.jujiao.model.vo;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: QiMu
 * @Date: 2023年04月10日 14:10
 * @Version: 1.0
 * @Description:
 */
@Data
public class MessageVo implements Serializable {
    private static final long serialVersionUID = -4722378360550337925L;

    /**
     * 发送人的聊天信息
     */
    private WebSocketVo formUser;

    /**
     * 接收人的聊天信息
     */
    private WebSocketVo toUser;

    /**
     * 队伍id
     */
    private Long teamId;

    /**
     * 消息内容
     */
    private String text;

    /**
     * 是否是我的消息
     */
    private Boolean isMy = false;

    /**
     * 聊天类型
     */
    private Integer chatType;

    /**
     * 是否是管理员
     */
    private Boolean isAdmin = false;

    /**
     * 创建时间
     */
    private String createTime;
}
