package com.windy.musi.pswdmanager.controller;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.util.ArrayUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pig4cloud.plugin.excel.annotation.ResponseExcel;
import com.windy.musi.common.core.util.R;
import com.windy.musi.common.log.annotation.SysLog;
import com.windy.musi.pswdmanager.entity.AccountInfoEntity;
import com.windy.musi.pswdmanager.service.AccountInfoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springdoc.core.annotations.ParameterObject;
import org.springframework.http.HttpHeaders;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 账号表
 *
 * @author windy
 * @date 2024-01-08 22:08:33
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/accountInfo" )
@Tag(description = "accountInfo" , name = "账号表管理" )
@SecurityRequirement(name = HttpHeaders.AUTHORIZATION)
public class AccountInfoController {

    private final AccountInfoService accountInfoService;

    /**
     * 分页查询
     * @param page 分页对象
     * @param accountInfo 账号表
     * @return
     */
    @Operation(summary = "分页查询" , description = "分页查询" )
    @GetMapping("/page" )
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_view')" )
    public R getAccountInfoPage(@ParameterObject Page page, @ParameterObject AccountInfoEntity accountInfo) {
        LambdaQueryWrapper<AccountInfoEntity> wrapper = Wrappers.lambdaQuery();
        return R.ok(accountInfoService.page(page, wrapper));
    }


    /**
     * 通过id查询账号表
     * @param id id
     * @return R
     */
    @Operation(summary = "通过id查询" , description = "通过id查询" )
    @GetMapping("/{id}" )
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_view')" )
    public R getById(@PathVariable("id" ) Integer id) {
        return R.ok(accountInfoService.getById(id));
    }

    /**
     * 新增账号表
     * @param accountInfo 账号表
     * @return R
     */
    @Operation(summary = "新增账号表" , description = "新增账号表" )
    @SysLog("新增账号表" )
    @PostMapping
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_add')" )
    public R save(@RequestBody AccountInfoEntity accountInfo) {
        return R.ok(accountInfoService.save(accountInfo));
    }

    /**
     * 修改账号表
     * @param accountInfo 账号表
     * @return R
     */
    @Operation(summary = "修改账号表" , description = "修改账号表" )
    @SysLog("修改账号表" )
    @PutMapping
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_edit')" )
    public R updateById(@RequestBody AccountInfoEntity accountInfo) {
        return R.ok(accountInfoService.updateById(accountInfo));
    }

    /**
     * 通过id删除账号表
     * @param ids id列表
     * @return R
     */
    @Operation(summary = "通过id删除账号表" , description = "通过id删除账号表" )
    @SysLog("通过id删除账号表" )
    @DeleteMapping
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_del')" )
    public R removeById(@RequestBody Integer[] ids) {
        return R.ok(accountInfoService.removeBatchByIds(CollUtil.toList(ids)));
    }


    /**
     * 导出excel 表格
     * @param accountInfo 查询条件
   	 * @param ids 导出指定ID
     * @return excel 文件流
     */
    @ResponseExcel
    @GetMapping("/export")
    @PreAuthorize("@pms.hasPermission('pswdmanager_accountInfo_export')" )
    public List<AccountInfoEntity> export(AccountInfoEntity accountInfo,Integer[] ids) {
        return accountInfoService.list(Wrappers.lambdaQuery(accountInfo).in(ArrayUtil.isNotEmpty(ids), AccountInfoEntity::getId, ids));
    }
}