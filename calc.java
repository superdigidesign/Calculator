
public class calc {
	public static void main(String[] args) {
		calc myCalculator = new calc(); //New instance/casting????
		System.out.println(myCalculator.add(3, 8));
		System.out.println(myCalculator.subtract(3, 8));
		System.out.println(myCalculator.divide(3, 8));
		System.out.println(myCalculator.multiply(3, 8));
		System.out.println(myCalculator.doubleDivide(4.5,7.2));
		System.out.println(myCalculator.flo(45,72));
	}	
	
	public int add(int a, int b) {
        return a + b;
    }
    public int subtract(int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a * b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int div(int a, int b) {
    	return a / b;
    }
    public double doubleDivide(double a, double b) {    
        return a / b;
    }
    public float flo(float a, float b) {    
        return a + b;
    /*}
    public double mult(double a, double b) {    
        return a * b;
        
    }public double div(double a, double b) {    
        return a / b;
 */
    }
}
