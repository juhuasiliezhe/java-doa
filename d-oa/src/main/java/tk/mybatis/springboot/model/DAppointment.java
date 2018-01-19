package tk.mybatis.springboot.model;

import java.math.BigDecimal;
import java.util.Date;

public class DAppointment {
    private Integer id;

    private Integer did;

    private Integer pid;

    private String name;

    private String apptime;

    private String type;

    private String comment;

    private Integer backtype;

    private String backcomment;

    private String backresult;

    private Date backtime;

    private Integer upstatus;

    private Integer status;

    private BigDecimal getmoney;

    private BigDecimal putmoney;

    private String gettime;

    private Date uptime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getApptime() {
        return apptime;
    }

    public void setApptime(String apptime) {
        this.apptime = apptime == null ? null : apptime.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getBacktype() {
        return backtype;
    }

    public void setBacktype(Integer backtype) {
        this.backtype = backtype;
    }

    public String getBackcomment() {
        return backcomment;
    }

    public void setBackcomment(String backcomment) {
        this.backcomment = backcomment == null ? null : backcomment.trim();
    }

    public String getBackresult() {
        return backresult;
    }

    public void setBackresult(String backresult) {
        this.backresult = backresult == null ? null : backresult.trim();
    }

    public Date getBacktime() {
        return backtime;
    }

    public void setBacktime(Date backtime) {
        this.backtime = backtime;
    }

    public Integer getUpstatus() {
        return upstatus;
    }

    public void setUpstatus(Integer upstatus) {
        this.upstatus = upstatus;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

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

    public String getGettime() {
        return gettime;
    }

    public void setGettime(String gettime) {
        this.gettime = gettime == null ? null : gettime.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }
    
     
}