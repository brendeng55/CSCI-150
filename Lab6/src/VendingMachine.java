
public class VendingMachine {

	private int numOfCans;
	private int numOfTokens;
	
	public VendingMachine(){
		numOfCans = 10;
		numOfTokens = 0;
	}
	public VendingMachine(int cans){
		numOfCans = cans;
		numOfTokens = 0;
	}
	
	public void insertToken(){
		
		if(numOfCans > 0){
		numOfTokens += 1;
		numOfCans -= 1;
		}
	}
	
	public void fillUp(int cans){
		numOfCans = cans;
	}
	
	public int getCanCount(){
		return numOfCans;
	}
	public int getTokenCount(){
		return numOfTokens;
	}
	
}
