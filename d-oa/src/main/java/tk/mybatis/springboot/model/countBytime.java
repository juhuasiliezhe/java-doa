package tk.mybatis.springboot.model;

import java.math.BigDecimal;

public class countBytime {
	private BigDecimal getmoney;
	private BigDecimal putmoney;
	private BigDecimal percent;
	private Integer    numberOne;
	private Integer    numberTwo;
	public BigDecimal getGetmoney() {
		return getmoney;
	}
	public void setGetmoney(BigDecimal getmoney) {
		this.getmoney = getmoney;
	}
	public BigDecimal getPutmoney() {
		return putmoney;
	}
	public void setPutmoney(BigDecimal putmoney) {
		this.putmoney = putmoney;
	}
	public BigDecimal getPercent() {
		return percent;
	}
	public void setPercent(BigDecimal percent) {
		this.percent = percent;
	}
	public Integer getNumberOne() {
		return numberOne;
	}
	public void setNumberOne(Integer numberOne) {
		this.numberOne = numberOne;
	}
	public Integer getNumberTwo() {
		return numberTwo;
	}
	public void setNumberTwo(Integer numberTwo) {
		this.numberTwo = numberTwo;
	}

}
