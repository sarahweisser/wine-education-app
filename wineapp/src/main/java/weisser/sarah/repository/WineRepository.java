package weisser.sarah.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import weisser.sarah.model.Wine;

/**
 * Created by sarahweisser on 7/9/17.
 */
public interface WineRepository extends JpaRepository<Wine, Long> {

}
