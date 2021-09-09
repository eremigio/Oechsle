package OechslePractica.demo.domain.service;

import OechslePractica.demo.domain.Client;
import OechslePractica.demo.domain.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public List<Client> getAll(){
        return clientRepository.getAll();
    }

    public List<Client> getPromedioEdades(){

        return clientRepository.getPromedioEdades();
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public boolean delete(int id){
        clientRepository.delete(id);
        return true;
    }
    public Integer getPromedioEdad(){
        return clientRepository.getPromedioEdad();
    }

    public Double getDesviacionEstandar(){
        return clientRepository.getDesviacionEstandar();
    }
}
