package ucup.topekox.backendapp.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ucup.topekox.backendapp.entity.Person;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "person", path = "person")
public interface PersonRepository extends JpaRepository<Person, Long> {

    Page<Person> findPersonByJurusanId(@Param("id") Long id);

}
