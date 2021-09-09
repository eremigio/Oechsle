package OechslePractica.demo.persistence.crud;

import OechslePractica.demo.persistence.entity.Cliente;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ClienteCrudRepository extends CrudRepository<Cliente,Integer> {

    @Query(value = "select round(avg(edad)) from tbo_clientes",nativeQuery = true)
     Integer getPromedioEdadsssss();
}
