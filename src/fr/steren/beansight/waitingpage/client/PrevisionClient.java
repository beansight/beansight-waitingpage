package fr.steren.beansight.waitingpage.client;

import java.io.Serializable;
import java.util.Date;

import javax.jdo.annotations.Persistent;

public class PrevisionClient implements Serializable {
	private Long id;
	public Long getId() {
		return id;
	}


	private String userLogin;
	private String label;
	private int agreed;
	private int disagreed;
	private Date createDate;
	private Date deadlineDate;

	public PrevisionClient(){
		super();
	};
	
	
	public PrevisionClient(Long id, String userLogin, String label, int agreed, int disagreed,
			Date createDate, Date deadlineDate) {
		super();
		this.id = id;
		this.userLogin = userLogin;
		this.label = label;
		this.agreed = agreed;
		this.disagreed = disagreed;
		this.createDate = createDate;
		this.deadlineDate = deadlineDate;
	}


	public String getUserLogin() {
		return userLogin;
	}


	public String getLabel() {
		return label;
	}


	public int getAgreed() {
		return agreed;
	}


	public int getDisagreed() {
		return disagreed;
	}


	public Date getCreateDate() {
		return createDate;
	}


	public Date getDeadlineDate() {
		return deadlineDate;
	}


	public void setUserLogin(String userLogin) {
		this.userLogin = userLogin;
	}


	public void setLabel(String label) {
		this.label = label;
	}


	public void setAgreed(int agreed) {
		this.agreed = agreed;
	}


	public void setDisagreed(int disagreed) {
		this.disagreed = disagreed;
	}


	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}


	public void setDeadlineDate(Date deadlineDate) {
		this.deadlineDate = deadlineDate;
	}

}
