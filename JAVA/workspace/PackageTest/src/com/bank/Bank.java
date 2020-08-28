package com.bank;

public class Bank {
private static Bank b= new Bank();
private Bank() {}

public static Bank getBank() {
	return b;
}
public String getName() {
	return "xx은행";
}
}
