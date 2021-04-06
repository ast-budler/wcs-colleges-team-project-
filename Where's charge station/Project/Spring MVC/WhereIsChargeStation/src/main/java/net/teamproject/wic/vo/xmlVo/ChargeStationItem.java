package net.teamproject.wic.vo.xmlVo;

//XML Body의 Items의 Item 생성
public class ChargeStationItem {
	private String statNm;
	private String statId;
	private String chgerId;
	private String chgerType;
	private String addr;
	private String lat;
	private String lng;
	private String useTime;
	private String busiId;
	private String busiNm;
	private String busiCall;
	private String stat;
	private String statUpdDt;
	private String powerType;
	private String zcode;
	private String parkingFree;
	private String note;
	
	//XML Body의 Items의 Item출력 
	public void print() {
		System.out.println("충전소 이름 : " + statNm);
		System.out.println("충전소 ID : " + statId);
		System.out.println("충전기 ID : " + chgerId);
		System.out.println("충전기 타입 : " + chgerType);
		System.out.println("주소 : " + addr);
		System.out.println("위도 : " + lat);
		System.out.println("경도 : " + lng);
		System.out.println("사용가능 시간 : " + useTime);
		System.out.println("소속번호 : " + busiId);
		System.out.println("소속 이름 : " + busiNm);
		System.out.println("소속 연락처 : " + busiCall);
		System.out.println("상태 : " + stat);
		System.out.println("상태 업데이트 일 : " + statUpdDt);
		System.out.println("충전기 타입 : " + powerType);
		System.out.println("우편번호 : " + zcode);
		System.out.println("주차 가능 여부 : " + parkingFree);
		System.out.println("기타 : " + note);
	}
    
	public String getStatNm() {
		return statNm;
	}
	public void setStatNm(String statNm) {
		this.statNm = statNm;
	}
	public String getStatId() {
		return statId;
	}
	public void setStatId(String statId) {
		this.statId = statId;
	}
	public String getChgerId() {
		return chgerId;
	}
	public void setChgerId(String chgerId) {
		this.chgerId = chgerId;
	}
	public String getChgerType() {
		return chgerType;
	}
	public void setChgerType(String chgerType) {
		this.chgerType = chgerType;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getLat() {
		return lat;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	public String getUseTime() {
		return useTime;
	}
	public void setUseTime(String useTime) {
		this.useTime = useTime;
	}
	public String getBusiId() {
		return busiId;
	}
	public void setBusiId(String busiId) {
		this.busiId = busiId;
	}
	public String getBusiNm() {
		return busiNm;
	}
	public void setBusiNm(String busiNm) {
		this.busiNm = busiNm;
	}
	public String getBusiCall() {
		return busiCall;
	}
	public void setBusiCall(String busiCall) {
		this.busiCall = busiCall;
	}
	public String getStat() {
		return stat;
	}
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getStatUpdDt() {
		return statUpdDt;
	}
	public void setStatUpdDt(String statUpdDt) {
		this.statUpdDt = statUpdDt;
	}
	public String getPowerType() {
		return powerType;
	}
	public void setPowerType(String powerType) {
		this.powerType = powerType;
	}
	public String getZcode() {
		return zcode;
	}
	public void setZcode(String zcode) {
		this.zcode = zcode;
	}
	public String getParkingFree() {
		return parkingFree;
	}
	public void setParkingFree(String parkingFree) {
		this.parkingFree = parkingFree;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
}