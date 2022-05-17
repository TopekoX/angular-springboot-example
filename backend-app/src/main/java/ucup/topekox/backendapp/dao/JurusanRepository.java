package ucup.topekox.backendapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import ucup.topekox.backendapp.entity.Jurusan;

@CrossOrigin("http://localhost:4200/")
@RepositoryRestResource(collectionResourceRel = "jurusan", path = "jurusan")
public interface JurusanRepository extends JpaRepository<Jurusan, Long> {
}
