package net.teamproject.wic.vo.xmlVo;

//XML Header 생성
public class ChargeStationHeader {
	private String resultCode;
	private String resultMsg;
	private String totalCount;
	private String resultCount;
	private String pageNo;
	private String numOfRows;
	
	//XML Header 출력
	public void print() {
		System.out.println("결과 코드 : " + resultCode);
		System.out.println("결과 메시지 : " + resultMsg);
		System.out.println("DB 총 행수 : " + totalCount);
		System.out.println("결과 총 행수 : " + resultCount);
		System.out.println("검색 시작 페이지 : " + pageNo);
		System.out.println("검색 마지막 페이지 : " + numOfRows);
	}
	
	public String getResultCode() {
		return resultCode;
	}
	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultMsg() {
		return resultMsg;
	}
	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(String totalCount) {
		this.totalCount = totalCount;
	}
	public String getResultCount() {
		return resultCount;
	}
	public void setResultCount(String resultCount) {
		this.resultCount = resultCount;
	}
	public String getPageNo() {
		return pageNo;
	}
	public void setPageNo(String pageNo) {
		this.pageNo = pageNo;
	}
	public String getNumOfRows() {
		return numOfRows;
	}
	public void setNumOfRows(String numOfRows) {
		this.numOfRows = numOfRows;
	}
}