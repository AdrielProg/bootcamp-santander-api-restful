package dio.me.domain.repository;

import dio.me.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

     boolean findUserByAccountNumber(String accountNumber);

}
