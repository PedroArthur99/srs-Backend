package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Equipamento;
import com.basis.srs.dominio.Reserva;
import com.basis.srs.dominio.ReservaEquipamento;
import com.basis.srs.dominio.ReservaEquipamentoKey;
import com.basis.srs.servico.dto.ReservaEquipamentoDTO;
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
public class ReservaEquipamentoMapperImpl implements ReservaEquipamentoMapper {

    @Override
    public List<ReservaEquipamento> toEntity(List<ReservaEquipamentoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<ReservaEquipamento> list = new ArrayList<ReservaEquipamento>( dtoList.size() );
        for ( ReservaEquipamentoDTO reservaEquipamentoDTO : dtoList ) {
            list.add( toEntity( reservaEquipamentoDTO ) );
        }

        return list;
    }

    @Override
    public List<ReservaEquipamentoDTO> toDto(List<ReservaEquipamento> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ReservaEquipamentoDTO> list = new ArrayList<ReservaEquipamentoDTO>( entityList.size() );
        for ( ReservaEquipamento reservaEquipamento : entityList ) {
            list.add( toDto( reservaEquipamento ) );
        }

        return list;
    }

    @Override
    public ReservaEquipamento toEntity(ReservaEquipamentoDTO reservaEquipamentoDTO) {
        if ( reservaEquipamentoDTO == null ) {
            return null;
        }

        ReservaEquipamento reservaEquipamento = new ReservaEquipamento();

        reservaEquipamento.setId( reservaEquipamentoDTOToReservaEquipamentoKey( reservaEquipamentoDTO ) );
        reservaEquipamento.setReserva( reservaEquipamentoDTOToReserva( reservaEquipamentoDTO ) );
        reservaEquipamento.setEquipamento( reservaEquipamentoDTOToEquipamento( reservaEquipamentoDTO ) );
        reservaEquipamento.setQuantidade( reservaEquipamentoDTO.getQuantidade() );

        return reservaEquipamento;
    }

    @Override
    public ReservaEquipamentoDTO toDto(ReservaEquipamento reservaEquipamento) {
        if ( reservaEquipamento == null ) {
            return null;
        }

        ReservaEquipamentoDTO reservaEquipamentoDTO = new ReservaEquipamentoDTO();

        reservaEquipamentoDTO.setIdEquipamento( reservaEquipamentoEquipamentoId( reservaEquipamento ) );
        reservaEquipamentoDTO.setIdReserva( reservaEquipamentoReservaId( reservaEquipamento ) );
        reservaEquipamentoDTO.setQuantidade( reservaEquipamento.getQuantidade() );

        return reservaEquipamentoDTO;
    }

    protected ReservaEquipamentoKey reservaEquipamentoDTOToReservaEquipamentoKey(ReservaEquipamentoDTO reservaEquipamentoDTO) {
        if ( reservaEquipamentoDTO == null ) {
            return null;
        }

        ReservaEquipamentoKey reservaEquipamentoKey = new ReservaEquipamentoKey();

        reservaEquipamentoKey.setIdReserva( reservaEquipamentoDTO.getIdReserva() );
        reservaEquipamentoKey.setIdEquipamento( reservaEquipamentoDTO.getIdEquipamento() );

        return reservaEquipamentoKey;
    }

    protected Reserva reservaEquipamentoDTOToReserva(ReservaEquipamentoDTO reservaEquipamentoDTO) {
        if ( reservaEquipamentoDTO == null ) {
            return null;
        }

        Reserva reserva = new Reserva();

        reserva.setId( reservaEquipamentoDTO.getIdReserva() );

        return reserva;
    }

    protected Equipamento reservaEquipamentoDTOToEquipamento(ReservaEquipamentoDTO reservaEquipamentoDTO) {
        if ( reservaEquipamentoDTO == null ) {
            return null;
        }

        Equipamento equipamento = new Equipamento();

        equipamento.setId( reservaEquipamentoDTO.getIdEquipamento() );

        return equipamento;
    }

    private Integer reservaEquipamentoEquipamentoId(ReservaEquipamento reservaEquipamento) {
        if ( reservaEquipamento == null ) {
            return null;
        }
        Equipamento equipamento = reservaEquipamento.getEquipamento();
        if ( equipamento == null ) {
            return null;
        }
        Integer id = equipamento.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer reservaEquipamentoReservaId(ReservaEquipamento reservaEquipamento) {
        if ( reservaEquipamento == null ) {
            return null;
        }
        Reserva reserva = reservaEquipamento.getReserva();
        if ( reserva == null ) {
            return null;
        }
        Integer id = reserva.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
