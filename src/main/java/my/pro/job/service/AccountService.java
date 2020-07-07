package my.pro.job.service;

import javax.mail.MessagingException;

import my.pro.job.entity.Account;
import my.pro.job.util.exception.CustomException;

public interface AccountService {

	public Account saveAccount(Account a) throws MessagingException,CustomException;
	public Account updateAccount(Long id, Account a);
	public void reset(Account account) throws MessagingException;
}
