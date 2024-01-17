package com.windy.musi.pswdmanager.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.time.LocalDateTime;

/**
 * 账号表
 *
 * @author windy
 * @date 2024-01-08 22:08:33
 */
@Data
@TableName("account_info")
@EqualsAndHashCode(callSuper = true)
@Schema(description = "账号表")
public class AccountInfoEntity extends Model<AccountInfoEntity> {


	/**
	* 主键
	*/
    @TableId(type = IdType.AUTO)
    @Schema(description="主键")
    private Integer id;

	/**
	* 账号类型
	*/
    @Schema(description="账号类型")
    private String accountType;

	/**
	* 账号所属应用
	*/
    @Schema(description="账号所属应用")
    private String accountApp;

	/**
	* 用户名
	*/
    @Schema(description="用户名")
    private String accountName;

	/**
	* 密码
	*/
    @Schema(description="密码")
    private String accountPw;

	/**
	* 网站链接
	*/
    @Schema(description="网站链接")
    private String accountUrl;

	/**
	* 备注
	*/
    @Schema(description="备注")
    private String accountRemark;

	/**
	* 创建时间
	*/
	@TableField(fill = FieldFill.INSERT)
    @Schema(description="创建时间")
    private LocalDateTime createTime;

	/**
	* 修改者
	*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
    @Schema(description="修改者")
    private String updateBy;

	/**
	* 修改时间
	*/
	@TableField(fill = FieldFill.INSERT_UPDATE)
    @Schema(description="修改时间")
    private LocalDateTime updateTime;

	/**
	* 删除标志
	*/
    @TableLogic
    @Schema(description="删除标志")
    private Integer delFlag;
}