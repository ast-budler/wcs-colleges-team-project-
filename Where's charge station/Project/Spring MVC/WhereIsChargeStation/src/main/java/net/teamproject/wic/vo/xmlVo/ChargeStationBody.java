package net.teamproject.wic.vo.xmlVo;

import java.util.List;

//XML Body 생성
public class ChargeStationBody {
	private List<ChargeStationItem> items;

	public List<ChargeStationItem> getItems() {
		return items;
	}

	public void setItems(List<ChargeStationItem> items) {
		this.items = items;
	}
}