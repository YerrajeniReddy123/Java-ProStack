package Oops;

public class Account extends Bank{
	
	private String acc_name;
	private String acc_mail;
	
	public Account(String name,String mail){
		super();
		this.acc_name=name;
		this.acc_mail=mail;
	}
	
	public int cal_Bal() {
		return 0;
	}

}
