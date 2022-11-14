package class_;

public class Compute {
	private int x,y,sum,sub,mul;
	private double div;
	
	
	public void calc() {
		sum=x+y;
		sub=x-y;
		mul=x*y;
		div=(double)x/y;
		
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public int getSum() {
		return sum;
	}
    public int getSub() {
    	return sub;
    }
    public int getMul() {
    	return mul;
    }
    public String getDiv() {
    	return String.format("%.2f", div);
    }
    
    
	
	public void setX(int x) {
		this.x=x;
		//this. -class 안의 x다.
	}
    public void setY(int y) {
    	this.y=y;
    }
}
