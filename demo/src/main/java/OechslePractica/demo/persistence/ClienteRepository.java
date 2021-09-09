package OechslePractica.demo.persistence;

import OechslePractica.demo.domain.Client;
import OechslePractica.demo.persistence.crud.ClienteCrudRepository;
import OechslePractica.demo.persistence.entity.Cliente;
import OechslePractica.demo.domain.repository.ClientRepository;
import OechslePractica.demo.persistence.mapper.ClientMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ClienteRepository implements ClientRepository {
    @Autowired
    private ClienteCrudRepository clienteCrudRepository;
    @Autowired
    private ClientMapper mapper;
    public List<Client> getAll(){
        List<Cliente> clienteList = (List<Cliente>) clienteCrudRepository.findAll();
       return mapper.toClients(clienteList);
    }

    public List<Client> getPromedioEdades(){
        List<Cliente> clienteList = (List<Cliente>) clienteCrudRepository.findAll();
        return mapper.toClients(clienteList);
    }



    public Client save(Client client){
        Cliente cliente= mapper.toCliente(client);
        return mapper.toClient(clienteCrudRepository.save(cliente));
    }



    @Override
    public void delete(int id){
         clienteCrudRepository.deleteById(id);
    }

    @Override
    public Integer getPromedioEdad() {
       return clienteCrudRepository.getPromedioEdadsssss();
    }

    //@Override
    public Double getDesviacionEstandar(){
        float media = 0;
        double varianza = 0.0;
        double desviacion= 0.0;
        List<Cliente> clienteList = (List<Cliente>) clienteCrudRepository.findAll();
        long cantidad =  clienteList.stream().count();

        for (Cliente edades: clienteList ) {
            double rango;
            rango = Math.pow(edades.getEdad(),2f);
            varianza = varianza + rango;
        }
        varianza = varianza / cantidad;
        desviacion = Math.sqrt(varianza);
        return desviacion;
    }


}
