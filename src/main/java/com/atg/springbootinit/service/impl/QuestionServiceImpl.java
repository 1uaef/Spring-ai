package com.atg.springbootinit.service.impl;

import com.atg.springbootinit.mapper.QuestionMapper;
import com.atg.springbootinit.model.entity.Question;
import com.atg.springbootinit.service.QuestionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
* @author 啊汤哥
* @description 针对表【question(题目)】的数据库操作Service实现
* @createDate 2024-07-24 20:32:50
*/
@Service
public class QuestionServiceImpl extends ServiceImpl<QuestionMapper, Question> implements QuestionService {

}




