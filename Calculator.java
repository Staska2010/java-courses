public class Calculator{
	private int result = 0;
	public void calc (int [] params){
		for (int i = 0; i < params.length; i++){
			this.result += params[i];
		}
	}
	public int getResult(){
		return this.result;
	}
	public void resetCalc (){
		this.result = 0;
	}
}