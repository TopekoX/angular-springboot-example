package ucup.topekox.backendapp.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "jurusan")
@Data
public class Jurusan {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nama_jurusan")
    private String namaJurusan;

    @OneToMany(mappedBy = "jurusan")
    List<Person> persons;

}
