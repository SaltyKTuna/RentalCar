package rentalcar.com.service2;

import java.util.List;
import java.util.Optional;

import rentalcar.com.entity2.Account;

public interface AccountService {

	Account getById(Integer id);

	void deleteById(Integer id);

	Optional<Account> findById(Integer id);

	List<Account> findAll();

	List<Account> findByUsernameLike(String username);

	List<Account> findByFullname(String fullname);

	<S extends Account> S save(S entity);
	
}
