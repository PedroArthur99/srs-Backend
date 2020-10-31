package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Equipamento;
import com.basis.srs.dominio.Sala;
import com.basis.srs.dominio.SalaEquipamento;
import com.basis.srs.dominio.SalaEquipamentoKey;
import com.basis.srs.servico.dto.SalaEquipamentoDTO;
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
public class SalaEquipamentoMapperImpl implements SalaEquipamentoMapper {

    @Override
    public List<SalaEquipamento> toEntity(List<SalaEquipamentoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<SalaEquipamento> list = new ArrayList<SalaEquipamento>( dtoList.size() );
        for ( SalaEquipamentoDTO salaEquipamentoDTO : dtoList ) {
            list.add( toEntity( salaEquipamentoDTO ) );
        }

        return list;
    }

    @Override
    public List<SalaEquipamentoDTO> toDto(List<SalaEquipamento> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalaEquipamentoDTO> list = new ArrayList<SalaEquipamentoDTO>( entityList.size() );
        for ( SalaEquipamento salaEquipamento : entityList ) {
            list.add( toDto( salaEquipamento ) );
        }

        return list;
    }

    @Override
    public SalaEquipamento toEntity(SalaEquipamentoDTO salaEquipamentoDTO) {
        if ( salaEquipamentoDTO == null ) {
            return null;
        }

        SalaEquipamento salaEquipamento = new SalaEquipamento();

        salaEquipamento.setId( salaEquipamentoDTOToSalaEquipamentoKey( salaEquipamentoDTO ) );
        salaEquipamento.setEquipamento( salaEquipamentoDTOToEquipamento( salaEquipamentoDTO ) );
        salaEquipamento.setSala( salaEquipamentoDTOToSala( salaEquipamentoDTO ) );
        salaEquipamento.setQuantidade( salaEquipamentoDTO.getQuantidade() );

        return salaEquipamento;
    }

    @Override
    public SalaEquipamentoDTO toDto(SalaEquipamento salaEquipamento) {
        if ( salaEquipamento == null ) {
            return null;
        }

        SalaEquipamentoDTO salaEquipamentoDTO = new SalaEquipamentoDTO();

        salaEquipamentoDTO.setIdEquipamento( salaEquipamentoEquipamentoId( salaEquipamento ) );
        salaEquipamentoDTO.setIdSala( salaEquipamentoSalaId( salaEquipamento ) );
        salaEquipamentoDTO.setQuantidade( salaEquipamento.getQuantidade() );

        return salaEquipamentoDTO;
    }

    protected SalaEquipamentoKey salaEquipamentoDTOToSalaEquipamentoKey(SalaEquipamentoDTO salaEquipamentoDTO) {
        if ( salaEquipamentoDTO == null ) {
            return null;
        }

        SalaEquipamentoKey salaEquipamentoKey = new SalaEquipamentoKey();

        salaEquipamentoKey.setIdSala( salaEquipamentoDTO.getIdSala() );
        salaEquipamentoKey.setIdEquipamento( salaEquipamentoDTO.getIdEquipamento() );

        return salaEquipamentoKey;
    }

    protected Equipamento salaEquipamentoDTOToEquipamento(SalaEquipamentoDTO salaEquipamentoDTO) {
        if ( salaEquipamentoDTO == null ) {
            return null;
        }

        Equipamento equipamento = new Equipamento();

        equipamento.setId( salaEquipamentoDTO.getIdEquipamento() );

        return equipamento;
    }

    protected Sala salaEquipamentoDTOToSala(SalaEquipamentoDTO salaEquipamentoDTO) {
        if ( salaEquipamentoDTO == null ) {
            return null;
        }

        Sala sala = new Sala();

        sala.setId( salaEquipamentoDTO.getIdSala() );

        return sala;
    }

    private Integer salaEquipamentoEquipamentoId(SalaEquipamento salaEquipamento) {
        if ( salaEquipamento == null ) {
            return null;
        }
        Equipamento equipamento = salaEquipamento.getEquipamento();
        if ( equipamento == null ) {
            return null;
        }
        Integer id = equipamento.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer salaEquipamentoSalaId(SalaEquipamento salaEquipamento) {
        if ( salaEquipamento == null ) {
            return null;
        }
        Sala sala = salaEquipamento.getSala();
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
