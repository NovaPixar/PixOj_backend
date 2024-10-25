package com.yupi.Pixoj.judge.codesandbox;

import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 代码沙箱的接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
