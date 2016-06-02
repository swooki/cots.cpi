package gov.ohio.jfs.cots.cpi;

import java.util.Date;

import org.springframework.stereotype.Component;

@Component
public class CPILog {
	String action;
	String application;
	Date dateAccessed;
	String personalId;
	String targetAccessed;
	String userAccessed;

	public CPILog(String action, String application, Date dateAccessed, String personalId, String targetAccessed,
			String userAccessed) {
		super();
		this.action = action;
		this.application = application;
		this.dateAccessed = dateAccessed;
		this.personalId = personalId;
		this.targetAccessed = targetAccessed;
		this.userAccessed = userAccessed;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getApplication() {
		return application;
	}

	public void setApplication(String application) {
		this.application = application;
	}

	public Date getDateAccessed() {
		return dateAccessed;
	}

	public void setDateAccessed(Date dateAccessed) {
		this.dateAccessed = dateAccessed;
	}

	public String getPersonalId() {
		return personalId;
	}

	public void setPersonalId(String personalId) {
		this.personalId = personalId;
	}

	public String getTargetAccessed() {
		return targetAccessed;
	}

	public void setTargetAccessed(String targetAccessed) {
		this.targetAccessed = targetAccessed;
	}

	public String getUserAccessed() {
		return userAccessed;
	}

	public void setUserAccessed(String userAccessed) {
		this.userAccessed = userAccessed;
	}

	@Override
	public String toString() {
		return "CPILog [action=" + action + ", application=" + application + ", dateAccessed=" + dateAccessed
				+ ", personalId=" + personalId + ", targetAccessed=" + targetAccessed + ", userAccessed=" + userAccessed
				+ "]";
	}

}
