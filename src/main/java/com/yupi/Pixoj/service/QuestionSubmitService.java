package com.yupi.Pixoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.Pixoj.model.dto.question.QuestionQueryRequest;
import com.yupi.Pixoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.Pixoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.Pixoj.model.entity.Question;
import com.yupi.Pixoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.Pixoj.model.entity.User;
import com.yupi.Pixoj.model.vo.QuestionSubmitVO;
import com.yupi.Pixoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author DELL
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-10-02 15:37:17
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {

    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest 题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
