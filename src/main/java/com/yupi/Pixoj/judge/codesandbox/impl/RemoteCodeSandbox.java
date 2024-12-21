package com.yupi.Pixoj.judge.codesandbox.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.yupi.Pixoj.common.ErrorCode;
import com.yupi.Pixoj.exception.BusinessException;
import com.yupi.Pixoj.judge.codesandbox.CodeSandbox;
import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yupi.Pixoj.judge.codesandbox.model.ExecuteCodeResponse;
import org.apache.commons.lang3.StringUtils;

/**
 * 远程代码沙箱（实际调用接口的沙箱）
 */
public class RemoteCodeSandbox implements CodeSandbox {

    //定义鉴权请求头和密钥
    private static final String AUTH_REQUEST_HEADER = "auth";

    private static final String AUTH_REQUEST_SECRET = "secretKey";
    // 16字节密钥
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱");
        String url = "http://localhost:8090/executeCode";
        String json = JSONUtil.toJsonStr(executeCodeRequest);
        // 加密鉴权密钥

        String responseStr = HttpUtil.createPost(url)
                .header(AUTH_REQUEST_HEADER, AUTH_REQUEST_SECRET)
                .body(json)
                .execute()
                .body();
        if (StringUtils.isBlank(responseStr)){
            throw new BusinessException(ErrorCode.API_REQUEST_ERROR,"executeCode remoteSanbox error,message = " + responseStr);
        }
        return JSONUtil.toBean(responseStr, ExecuteCodeResponse.class);
    }

    // 生成 AES 密钥


}
