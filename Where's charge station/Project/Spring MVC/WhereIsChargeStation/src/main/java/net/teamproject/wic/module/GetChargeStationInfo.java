package net.teamproject.wic.module;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import net.teamproject.wic.vo.xmlVo.ChargeStationInfo;

public class GetChargeStationInfo {
	
	public static ChargeStationInfo getChargeStationInfo(int rows, int pages) {
		String url = "http://apis.data.go.kr/B552584/EvCharger/getChargerInfo"
				+ "?serviceKey=aRHWU5VcuL6kz4%2FxQQOXJKRuFShw%2F%2BVzm5HDJPnzJMgFJ2csEnSN4SlxfY3owIoxK6lrN5pDFPcYhe2zpEqMQA%3D%3D"
				+ "&numOfRows=" + rows
				+ "&pageNo=" + pages;
		
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet req = new HttpGet(url);
		HttpResponse res;
		
		try {
			res = client.execute(req);
			
			if(res.getStatusLine().getStatusCode() == 200) {
				String body = EntityUtils.toString(res.getEntity(), "UTF-8");
				ObjectMapper mapper = new XmlMapper();
				ChargeStationInfo result = mapper.readValue(body, ChargeStationInfo.class);
				return result;
			}else {
				return null;
			}
		}catch (Exception e) {
			System.out.println("예외 발생");
			return null;
		}
	}
}