package com.mockitoPrac;

public interface AccountRepository {

	 Account findById(int id);

	 void updateBalance(int id, double newBalance);
}
