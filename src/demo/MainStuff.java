package demo;

public class MainStuff {
	
	public int add(int first, int second) {
		return first + second;
	} 
	
	public int add2(int first, int second) {
		if (first < 10){
			first = first + 10;
		}
		return first + second;
	}
	
	public int add3(int first, int second) {
		if (first < 10) {
			first = first + 10;
		} else {
			first = first + 100;
		}
		return first + second;
	}
	
	public int divide(int first, int second) {
		return first / second;
	}
}
