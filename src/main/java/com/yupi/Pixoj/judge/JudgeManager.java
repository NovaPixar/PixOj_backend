package com.yupi.Pixoj.judge;

import com.yupi.Pixoj.judge.strategy.DefaultJudgeStrategy;
import com.yupi.Pixoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yupi.Pixoj.judge.strategy.JudgeContext;
import com.yupi.Pixoj.judge.strategy.JudgeStrategy;
import com.yupi.Pixoj.judge.codesandbox.model.JudgeInfo;
import com.yupi.Pixoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理简化调用
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext 判题上下文
     * @return judgeStrategy
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
