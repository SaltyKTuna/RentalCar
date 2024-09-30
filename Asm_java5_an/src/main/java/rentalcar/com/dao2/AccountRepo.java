package rentalcar.com.dao2;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import rentalcar.com.entity2.Account;


@Repository
public interface AccountRepo extends JpaRepository<Account, Integer>{
	@Query("SELECT a FROM Accounts a WHERE a.fullname LIKE :name")
	List<Account> findByFullname(@Param("name") String fullname);
	@Query("SELECT a FROM Accounts a WHERE a.username LIKE :username")
	List<Account> findByUsernameLike(@Param("username") String username);


}
