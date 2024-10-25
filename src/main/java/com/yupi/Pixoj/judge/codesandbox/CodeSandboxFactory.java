package com.yupi.Pixoj.judge.codesandbox;

import com.yupi.Pixoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yupi.Pixoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yupi.Pixoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * 代码沙箱创建工厂（根据指定的字符串创建指定的代码沙箱实例）
 */
public class CodeSandboxFactory {

    /**
     * 创建代码沙箱实例
     *
     * @param type 沙箱类型
     * @return
     */
    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "example":
                return new ExampleCodeSandbox();
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            default:
                return new ExampleCodeSandbox();
        }
    }
}