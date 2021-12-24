package jp.learningdesign.javastudy;

class Computer {
	public String os;
	public int memory;
	public int storage;
}
public class ComputerInfo {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
	Computer desktop = new Computer();
	desktop.os = "windows10";
	desktop.memory = 4;
	desktop.storage = 256;
	
	System.out.println("\nOS" + desktop.os);
	System.out.println("OS" + desktop.memory);
	System.out.println("OS" + desktop.storage);
	
	Computer desktop2 = desktop;
	
	desktop2.os = "Ubuntu";
	
	System.out.println("\nOS" + desktop.os);
	System.out.println("OS" + desktop.memory);
	System.out.println("OS" + desktop.storage);

	System.out.println("\nOS" + desktop2.os);
	System.out.println("OS" + desktop2.memory);
	System.out.println("OS" + desktop2.storage);
	
	

	}

}
