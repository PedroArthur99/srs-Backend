package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Cliente;
import com.basis.srs.dominio.Reserva;
import com.basis.srs.dominio.Sala;
import com.basis.srs.servico.dto.ReservaDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-10-29T10:06:46-0300",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_272 (Private Build)"
)
@Component
public class ReservaMapperImpl implements ReservaMapper {

    @Autowired
    private ReservaEquipamentoMapper reservaEquipamentoMapper;

    @Override
    public List<Reserva> toEntity(List<ReservaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Reserva> list = new ArrayList<Reserva>( dtoList.size() );
        for ( ReservaDTO reservaDTO : dtoList ) {
            list.add( toEntity( reservaDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservaDTO> toDto(List<Reserva> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReservaDTO> list = new ArrayList<ReservaDTO>( entityList.size() );
        for ( Reserva reserva : entityList ) {
            list.add( toDto( reserva ) );
        }

        return list;
    }

    @Override
    public Reserva toEntity(ReservaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Reserva reserva = new Reserva();

        reserva.setCliente( reservaDTOToCliente( dto ) );
        reserva.setSala( reservaDTOToSala( dto ) );
        reserva.setId( dto.getId() );
        reserva.setDataInicio( dto.getDataInicio() );
        reserva.setDataFim( dto.getDataFim() );
        reserva.setTotal( dto.getTotal() );
        reserva.setEquipamentos( reservaEquipamentoMapper.toEntity( dto.getEquipamentos() ) );

        return reserva;
    }

    @Override
    public ReservaDTO toDto(Reserva entity) {
        if ( entity == null ) {
            return null;
        }

        ReservaDTO reservaDTO = new ReservaDTO();

        reservaDTO.setIdCliente( entityClienteId( entity ) );
        reservaDTO.setIdSala( entitySalaId( entity ) );
        reservaDTO.setId( entity.getId() );
        reservaDTO.setDataInicio( entity.getDataInicio() );
        reservaDTO.setDataFim( entity.getDataFim() );
        reservaDTO.setTotal( entity.getTotal() );
        reservaDTO.setEquipamentos( reservaEquipamentoMapper.toDto( entity.getEquipamentos() ) );

        return reservaDTO;
    }

    protected Cliente reservaDTOToCliente(ReservaDTO reservaDTO) {
        if ( reservaDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setId( reservaDTO.getIdCliente() );

        return cliente;
    }

    protected Sala reservaDTOToSala(ReservaDTO reservaDTO) {
        if ( reservaDTO == null ) {
            return null;
        }

        Sala sala = new Sala();

        sala.setId( reservaDTO.getIdSala() );

        return sala;
    }

    private Integer entityClienteId(Reserva reserva) {
        if ( reserva == null ) {
            return null;
        }
        Cliente cliente = reserva.getCliente();
        if ( cliente == null ) {
            return null;
        }
        Integer id = cliente.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer entitySalaId(Reserva reserva) {
        if ( reserva == null ) {
            return null;
        }
        Sala sala = reserva.getSala();
        if ( sala == null ) {
            return null;
        }
        Integer id = sala.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
