/**
 * Copyright 2018 Steve Jrong - https://www.stevejrong.top

 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at

 *     http://www.apache.org/licenses/LICENSE-2.0

 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stevejrong.airchina.oauth.repository;

import com.stevejrong.airchina.oauth.common.repository.BaseRepository;
import com.stevejrong.airchina.oauth.model.TokenModel;

/**
 * Repository Interface - Token
 * 
 * @author Steve Jrong
 * @since 1.0 create date: 2018年2月26日 下午12:42:39
 */
public interface TokenRepository extends BaseRepository<TokenModel> {

	/**
	 * 根据电子邮件地址获取令牌信息
	 * 
	 * @param email 电子邮件地址
	 * @return
	 */
	TokenModel getByEmail(String email);
	
	/**
	 * 根据用户ID获取令牌信息
	 * 
	 * @param userId 用户ID
	 * @return
	 */
	TokenModel getByUserId(String userId);
}
