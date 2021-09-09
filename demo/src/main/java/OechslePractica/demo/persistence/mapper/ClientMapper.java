package OechslePractica.demo.persistence.mapper;

import OechslePractica.demo.domain.Client;
import OechslePractica.demo.persistence.entity.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings(
            {
                    @Mapping(source = "id",target = "id"),
                    @Mapping(source = "nombre",target = "name"),
                    @Mapping(source = "apellido",target = "lastname"),
                    @Mapping(source = "edad",target = "age"),
                    @Mapping(source = "fechaNacimiento",target = "dateBirth")

            }
    )
    Client toClient(Cliente client);

    @InheritInverseConfiguration
    Cliente toCliente(Client client);
    List<Client> toClients(List<Cliente> clientes);

}
