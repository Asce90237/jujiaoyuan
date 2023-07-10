package com.qimu.jujiao.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @Author: QiMu
 * @Date: 2023年04月10日 14:21
 * @Version: 1.0
 * @Description:
 */
@Data
public class MessageRequest implements Serializable {
    private static final long serialVersionUID = 1324635911327892058L;

    /**
     * 接收人id
     */
    private Long toId;

    /**
     * 队伍id
     */
    private Long teamId;

    /**
     * 消息内容
     */
    private String text;

    /**
     * 聊天类型
     */
    private Integer chatType;

    /**
     * 是否是管理员
     */
    private boolean isAdmin;
}
