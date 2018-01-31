package si.mp.le.user.vo;

import org.springframework.stereotype.Component;

@Component("user.u")
public class User {

	private String uiName;
	private int uiAge;
	
	public String getUiName() {
		return uiName;
	}
	public void setUiName(String uiName) {
		this.uiName = uiName;
	}
	public int getUiAge() {
		return uiAge;
	}
	public void setUiAge(int uiAge) {
		this.uiAge = uiAge;
	}
	
	@Override
	public String toString() {
		return "User [uiName=" + uiName + ", uiAge=" + uiAge + "]";
	}
}
