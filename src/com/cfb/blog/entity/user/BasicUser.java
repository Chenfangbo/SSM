package com.cfb.blog.entity.user;
/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月10日 下午7:43:29
 */
public class BasicUser {

	private String userName;//用户名
	private String passWord;//密码
	
	private String fullName;//姓名
	private Integer userAge;//年龄
	private String userNickname;//昵称
	private String sex;//性别
	private Integer cellPhoneNum;//手机
	private Integer phoneNum;//电话
	private String email;//电子邮件
	private Long qq;//qq号码
	private String homeAdress;//家庭住址
	private String companyAdress;//公司地址
	private String headPortraitAdress;//头像地址
	private String selfDescription;//自我描述
	private String remarks;//备注
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getCellPhoneNum() {
		return cellPhoneNum;
	}
	public void setCellPhoneNum(Integer cellPhoneNum) {
		this.cellPhoneNum = cellPhoneNum;
	}
	public Integer getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getHomeAdress() {
		return homeAdress;
	}
	public void setHomeAdress(String homeAdress) {
		this.homeAdress = homeAdress;
	}
	public String getCompanyAdress() {
		return companyAdress;
	}
	public void setCompanyAdress(String companyAdress) {
		this.companyAdress = companyAdress;
	}
	public String getHeadPortraitAdress() {
		return headPortraitAdress;
	}
	public void setHeadPortraitAdress(String headPortraitAdress) {
		this.headPortraitAdress = headPortraitAdress;
	}
	public String getSelfDescription() {
		return selfDescription;
	}
	public void setSelfDescription(String selfDescription) {
		this.selfDescription = selfDescription;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Long getQq() {
		return qq;
	}
	public void setQq(Long qq) {
		this.qq = qq;
	}
	
}
