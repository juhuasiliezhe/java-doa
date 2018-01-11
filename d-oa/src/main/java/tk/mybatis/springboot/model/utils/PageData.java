package tk.mybatis.springboot.model.utils;

public class PageData {
	private int id;
	private int pageindex; //当前页面页码
	private int pageSize;	//页面的大小
	private String startDate;//开始日期
	private String endDate;//结束日期
	private String userName;//用户真实姓名
	private String searchtext;
	private int status;



	private String sortOrders;//排序
	public String getSortOrders() {
		return sortOrders;
	}
	public void setSortOrders(String sortOrders) {
		this.sortOrders = sortOrders;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public int getPageindex() {
		return pageindex;
	}
	public void setPageindex(int pageindex) {
		this.pageindex = pageindex;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getSearchtext() {
		return searchtext;
	}
	public void setSearchtext(String searchtext) {
		this.searchtext = searchtext;
	}
	
}
