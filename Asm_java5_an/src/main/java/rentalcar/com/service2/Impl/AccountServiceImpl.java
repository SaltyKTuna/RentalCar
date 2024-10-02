package rentalcar.com.service2.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rentalcar.com.dao2.AccountRepo;
import rentalcar.com.entity2.Account;
import rentalcar.com.service2.AccountService;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired AccountRepo accountRepo;

	@Override
	public List<Account> findByFullname(String fullname) {
		return accountRepo.findByFullname(fullname);
	}

	@Override
	public List<Account> findByUsernameLike(String username) {
		return accountRepo.findByUsernameLike(username);
	}

	@Override
	public List<Account> findAll() {
		return accountRepo.findAll();
	}

	@Override
	public Optional<Account> findById(Integer id) {
		return accountRepo.findById(id);
	}

	@Override
	public void deleteById(Integer id) {
		accountRepo.deleteById(id);
	}

	@Override
	public Account getById(Integer id) {
		return accountRepo.getById(id);
	}

	@Override
	public <S extends Account> S save(S entity) {
		return accountRepo.save(entity);
	}
	
	
}
