package BigONotation;

public class NlogN {
	public void nLogNFunc(double n) {
		double y = n; 
		while(n > 1) {
			n = Math.floor(n / 2);
			for (int i = 0; i <= n; i++) {
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) {
		NlogN nlogn = new NlogN();
		nlogn.nLogNFunc(20);
	}
}
