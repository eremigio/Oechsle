package OechslePractica.demo.domain.repository;

import OechslePractica.demo.domain.Client;

import java.util.List;

public interface ClientRepository {
    List<Client> getAll();
    List<Client> getPromedioEdades();
    Client save(Client client);
    void delete(int id);
    Integer getPromedioEdad();
    Double getDesviacionEstandar();
}
