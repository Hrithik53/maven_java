package mypkg;

public class Calculator {
	public int sum(int a,int b) {
		return a+b;
		}
	public int diff(int a,int b) {
		return a-b;
		}
	public int MUL(int a,int b) {
		return a*b;
		}
	public static void main(String[] args) {
		Calculator b=new Calculator();
		System.out.println("Sum is :"+ b.sum(20, 10));
		System.out.println("Diff is :"+ b.diff(20, 10));
		System.out.println("Mul is :"+ b.MUL(20, 10));
	}

}
