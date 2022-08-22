package com.aurionpro.model;

public class ExecuteTest {

	public static void main(String[] args) {
//		ExecutableTask exe = new ExecutableTask();
//		exe.execute("hello");
		IExecutable ex=new IExecutable() {	
			@Override
			public void execute(String msg) {
				System.out.println("Hello "+msg);
				
			}
		};	
		IExecutable exe1 = (msg) -> {
			System.out.println("Executing lambda : " + msg);
		};
		ex.execute("hiii");
		exe1.execute("hello");
		IExecutable exe2 = ExecuteTest::showMessage;
		exe2.execute("hiii");

	}

	public static void showMessage(String msg) {
		System.out.println("Show message Called : " + msg);
	}

}
