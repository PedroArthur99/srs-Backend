package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Cliente;
import com.basis.srs.servico.dto.ClienteDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-29T10:06:46-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_272 (Private Build)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public List<Cliente> toEntity(List<ClienteDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Cliente> list = new ArrayList<Cliente>( dtoList.size() );
        for ( ClienteDTO clienteDTO : dtoList ) {
            list.add( toEntity( clienteDTO ) );
        }

        return list;
    }

    @Override
    public List<ClienteDTO> toDto(List<Cliente> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>( entityList.size() );
        for ( Cliente cliente : entityList ) {
            list.add( toDto( cliente ) );
        }

        return list;
    }

    @Override
    public Cliente toEntity(ClienteDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( dto.getId() );
        cliente.setNome( dto.getNome() );
        cliente.setCpf( dto.getCpf() );
        cliente.setDataNascimento( dto.getDataNascimento() );
        cliente.setEndereco( dto.getEndereco() );
        cliente.setRg( dto.getRg() );
        cliente.setEmail( dto.getEmail() );
        cliente.setTelefone( dto.getTelefone() );

        return cliente;
    }

    @Override
    public ClienteDTO toDto(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId( cliente.getId() );
        clienteDTO.setNome( cliente.getNome() );
        clienteDTO.setCpf( cliente.getCpf() );
        clienteDTO.setDataNascimento( cliente.getDataNascimento() );
        clienteDTO.setEndereco( cliente.getEndereco() );
        clienteDTO.setTelefone( cliente.getTelefone() );
        clienteDTO.setRg( cliente.getRg() );
        clienteDTO.setEmail( cliente.getEmail() );

        return clienteDTO;
    }
}
