package weisser.sarah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weisser.sarah.model.User;

/**
 * Created by sarahweisser on 7/13/17.
 */

public interface UserRepository extends JpaRepository<User, Long> {

}

