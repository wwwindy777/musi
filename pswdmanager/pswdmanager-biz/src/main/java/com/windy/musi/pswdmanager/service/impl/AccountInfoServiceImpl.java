package com.windy.musi.pswdmanager.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.windy.musi.pswdmanager.entity.AccountInfoEntity;
import com.windy.musi.pswdmanager.mapper.AccountInfoMapper;
import com.windy.musi.pswdmanager.service.AccountInfoService;
import org.springframework.stereotype.Service;
/**
 * 账号表
 *
 * @author windy
 * @date 2024-01-08 22:08:33
 */
@Service
public class AccountInfoServiceImpl extends ServiceImpl<AccountInfoMapper, AccountInfoEntity> implements AccountInfoService {
}