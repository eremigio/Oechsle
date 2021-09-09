package OechslePractica.demo.web.controller;

import OechslePractica.demo.domain.Client;
import OechslePractica.demo.domain.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {
    @Autowired
    private ClientService clientService;
    @GetMapping("/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @PostMapping("/kpiclientes")
    public List<Client> getPromedioEdades(){
        return clientService.getPromedioEdades();
    }
    @PostMapping("/creacliente")
    public Client save(Client client){
        return clientService.save(client);
    }
    @PostMapping("/eliminarcliente")
    public boolean delete(int id){
        return clientService.delete(id);
    }
    @GetMapping("/kpiclientesedad")
    public Integer getPromedioEdad(){
        return clientService.getPromedioEdad();
    }
    @GetMapping("/kpiclientesdesviacion")
    public Double getDesviacionEstandar(){
        return clientService.getDesviacionEstandar();
    }
}
