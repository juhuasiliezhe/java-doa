package tk.mybatis.springboot.model;


import java.util.Date;

public class DPatient {
    private Integer id;

    private Integer did;

    private String keeper;

    private String name;

    private String sex;

    private String birthday;

    private String age;

    private String phone;

    private String telephone;

    private String email;

    private String address;

    private String fromwhere;

    private String tip;

    private String type;

    private String allergy;

    private String heart;

    private String hypertension;

    private String diabetes;

    private String kidney;

    private String nephropathy;

    private String infectious;

    private String blood;

    private String smoke;

    private String drink;

    private String aspirin;

    private String otherdrug;

    private String anesthetic;

    private String otherdisease;

    private String fasting;

    private String pregnant;

    private String cometime;

    private String work;

    private Date uptime;

    private Integer status;

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

    public String getKeeper() {
        return keeper;
    }

    public void setKeeper(String keeper) {
        this.keeper = keeper == null ? null : keeper.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age == null ? null : age.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFromwhere() {
        return fromwhere;
    }

    public void setFromwhere(String fromwhere) {
        this.fromwhere = fromwhere == null ? null : fromwhere.trim();
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip == null ? null : tip.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getAllergy() {
        return allergy;
    }

    public void setAllergy(String allergy) {
        this.allergy = allergy == null ? null : allergy.trim();
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart == null ? null : heart.trim();
    }

    public String getHypertension() {
        return hypertension;
    }

    public void setHypertension(String hypertension) {
        this.hypertension = hypertension == null ? null : hypertension.trim();
    }

    public String getDiabetes() {
        return diabetes;
    }

    public void setDiabetes(String diabetes) {
        this.diabetes = diabetes == null ? null : diabetes.trim();
    }

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney == null ? null : kidney.trim();
    }

    public String getNephropathy() {
        return nephropathy;
    }

    public void setNephropathy(String nephropathy) {
        this.nephropathy = nephropathy == null ? null : nephropathy.trim();
    }

    public String getInfectious() {
        return infectious;
    }

    public void setInfectious(String infectious) {
        this.infectious = infectious == null ? null : infectious.trim();
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood == null ? null : blood.trim();
    }

    public String getSmoke() {
        return smoke;
    }

    public void setSmoke(String smoke) {
        this.smoke = smoke == null ? null : smoke.trim();
    }

    public String getDrink() {
        return drink;
    }

    public void setDrink(String drink) {
        this.drink = drink == null ? null : drink.trim();
    }

    public String getAspirin() {
        return aspirin;
    }

    public void setAspirin(String aspirin) {
        this.aspirin = aspirin == null ? null : aspirin.trim();
    }

    public String getOtherdrug() {
        return otherdrug;
    }

    public void setOtherdrug(String otherdrug) {
        this.otherdrug = otherdrug == null ? null : otherdrug.trim();
    }

    public String getAnesthetic() {
        return anesthetic;
    }

    public void setAnesthetic(String anesthetic) {
        this.anesthetic = anesthetic == null ? null : anesthetic.trim();
    }

    public String getOtherdisease() {
        return otherdisease;
    }

    public void setOtherdisease(String otherdisease) {
        this.otherdisease = otherdisease == null ? null : otherdisease.trim();
    }

    public String getFasting() {
        return fasting;
    }

    public void setFasting(String fasting) {
        this.fasting = fasting == null ? null : fasting.trim();
    }

    public String getPregnant() {
        return pregnant;
    }

    public void setPregnant(String pregnant) {
        this.pregnant = pregnant == null ? null : pregnant.trim();
    }

    public String getCometime() {
        return cometime;
    }

    public void setCometime(String cometime) {
        this.cometime = cometime == null ? null : cometime.trim();
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work == null ? null : work.trim();
    }

    public Date getUptime() {
        return uptime;
    }

    public void setUptime(Date uptime) {
        this.uptime = uptime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}