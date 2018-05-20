package com.stevejrong.airchina.oauth.rest.common.web.exception;/**
 * Copyright 2018 Steve Jrong - https://www.stevejrong.top
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import com.stevejrong.airchina.common.util.DateTimeUtil;
import com.stevejrong.airchina.oauth.common.constant.ExceptionConstantsEnum;

/**
 * Exception - Token不存在异常
 *
 * @author Steve Jrong
 * @since 1.0 create date: 2018年05月20日 下午4:27
 */
public class AirChinaTokenNotExistException extends RuntimeException {

    private Long timestamp; // 时间戳

    private Integer code; // 异常码

    private String message; // 异常消息

    public Long getTimestamp() {
        return timestamp;
    }

    public Integer getCode() {
        return code;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public AirChinaTokenNotExistException() {
        super(ExceptionConstantsEnum.TOKEN_NOT_EXIST.exceptionMessage());
        this.timestamp = DateTimeUtil.getTimestampByNow();
        this.code = ExceptionConstantsEnum.TOKEN_NOT_EXIST.exceptionCode();
        this.message = ExceptionConstantsEnum.TOKEN_NOT_EXIST.exceptionMessage();
    }

}
