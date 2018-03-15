package com.blog.samples.webservices.accountservice;

import com.blog.samples.webservices.Account;

public class AccountDetailsServiceStubs {

	public static void main(String[] args) {
		
		
		AccountDetailsRequest accountDetailsRequest = new AccountDetailsRequest();
		accountDetailsRequest.setAccountNumber("10101454545");;
		
		AccountDetailsServices accountDetailsServices = new AccountDetailsServices();
		
		AccountDetailsService accountDetailsService = accountDetailsServices.getAccountDetailsServiceSoap11();
		
		
		AccountDetailsResponse accountDetailsResponse =accountDetailsService.accountDetails(accountDetailsRequest);
		
		Account account = accountDetailsResponse.getAccountDetails();
		
		System.out.println("Response AccountBalance " + account.getAccountBalance());
		
		System.out.println("Response AccountName " + account.getAccountName());
		
		System.out.println("Response AccountNumber " + account.getAccountNumber());
		
	

		
		
	}

}
