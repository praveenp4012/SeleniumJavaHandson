package com.java.handson;

public class VarArgMethod {

	public static void main(String[] args) {

		VarArgMethod vm = new VarArgMethod();
		vm.varArg(1);
		vm.varArg(1,2);
		vm.varArg(1,2,3);

	}

	public void varArg(int... n) {

		int sum = 0;
		for (int p : n) {
			sum += p;
		}

		System.out.println(sum);
	}

}
