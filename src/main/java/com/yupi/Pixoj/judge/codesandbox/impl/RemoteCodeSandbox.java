package com.yupi.Pixoj.judge.codesandbox.impl;

import com.yupi.Pixoj.judge.codesandbox.CodeSandbox;
import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 */
public class RemoteCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        return null;
    }
}