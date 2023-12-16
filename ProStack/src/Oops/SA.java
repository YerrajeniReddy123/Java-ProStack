package Oops;

public class SA extends Account{
	
	private int acc_id;
	private int acc_amount;
	private int acc_min_bal;
	
	public int getAcc_min_bal() {
		return acc_min_bal;
	}

	public void setAcc_min_bal(int acc_min_bal) {
		this.acc_min_bal = acc_min_bal;
	}

	public SA(int id,String name,String email,int amount){
		super();
		this.acc_id=id;
		this.acc_amount=amount;
		
	}
	
	public int cal_Bal(){
		return 0;
	}

}
