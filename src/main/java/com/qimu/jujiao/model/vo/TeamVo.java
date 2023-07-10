package com.qimu.jujiao.model.vo;

import com.qimu.jujiao.model.entity.User;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

/**
 * @Author: QiMu
 * @Date: 2023年03月10日 22:13
 * @Version: 1.0
 * @Description:
 */
@Data
public class TeamVo implements Serializable {

    private static final long serialVersionUID = 8860605873381253366L;

    /**
     * 队伍id
     */
    private Long id;

    /**
     * 队伍名称
     */
    private String teamName;

    /**
     * 队伍头像
     */
    private String teamAvatarUrl;

    /**
     * 加入队伍密码
     */
    private String teamPassword;

    /**
     * 队伍描述
     */
    private String teamDesc;

    /**
     * 队伍最大加入人数
     */
    private Integer maxNum;

    /**
     * 过期时间
     */
    private Date expireTime;

    /**
     * 队伍状态
     */
    private Integer teamStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 队伍公告
     */
    private String announce;

    /**
     * 队伍创建人信息（已脱敏）
     */
    private User user;

    /**
     * 当前队伍加入的用户集合（已脱敏）
     */
    private Set<User> userSet;
}
