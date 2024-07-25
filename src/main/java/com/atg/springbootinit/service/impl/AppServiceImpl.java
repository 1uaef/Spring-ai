package com.atg.springbootinit.service.impl;

import com.atg.springbootinit.mapper.AppMapper;
import com.atg.springbootinit.model.entity.App;
import com.atg.springbootinit.service.AppService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author 啊汤哥
* @description 针对表【app(应用)】的数据库操作Service实现
* @createDate 2024-07-24 20:32:50
*/
@Service
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

}




