package com.ibm.demo.day2.oop.abstraction;


abstract class Rbi{
	abstract void dokyc();
	
}

interface FinanceMinistry{

	public abstract void payInterest();
	
}
interface StateGovt{
	
}

class HdfcBank extends Rbi implements FinanceMinistry , StateGovt{
	@Override
	void dokyc() {
		System.out.println("Kyc with aadhaar");
	}
	@Override
	public void payInterest() {
		System.out.println("paying interest");
	}
	
}
class IciciBank extends Rbi{
	@Override
	void dokyc() {
		System.out.println("Kyc with Pan");
	}
	
}
public class Banking {

}
