package net.teamproject.wic.service;

import java.util.HashMap;

public interface KakaoLoginService {

	String getAccessToken(String code);

	HashMap<String, Object> getUserInfo(String accessToken);

}