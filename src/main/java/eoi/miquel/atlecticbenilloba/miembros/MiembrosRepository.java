package eoi.miquel.atlecticbenilloba.miembros;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MiembrosRepository extends CrudRepository<Miembro, Integer> {

}
