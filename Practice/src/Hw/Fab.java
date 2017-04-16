package Hw;

public class Fab {
	int n;
	
	public int fabHw(int n){
		if(n==0 ){
			this.n=0;
		}else if(n==1){
			this.n = 1;
		}
		
		else{
			this.n = this.fabHw(n-2)+this.fabHw(n-1);
		}
		return this.n;
	}
}
