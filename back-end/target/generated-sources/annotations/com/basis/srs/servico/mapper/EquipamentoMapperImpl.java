package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Equipamento;
import com.basis.srs.dominio.TipoEquipamento;
import com.basis.srs.servico.dto.EquipamentoDTO;
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
public class EquipamentoMapperImpl implements EquipamentoMapper {

    @Override
    public List<Equipamento> toEntity(List<EquipamentoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Equipamento> list = new ArrayList<Equipamento>( dtoList.size() );
        for ( EquipamentoDTO equipamentoDTO : dtoList ) {
            list.add( toEntity( equipamentoDTO ) );
        }

        return list;
    }

    @Override
    public List<EquipamentoDTO> toDto(List<Equipamento> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<EquipamentoDTO> list = new ArrayList<EquipamentoDTO>( entityList.size() );
        for ( Equipamento equipamento : entityList ) {
            list.add( toDto( equipamento ) );
        }

        return list;
    }

    @Override
    public Equipamento toEntity(EquipamentoDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Equipamento equipamento = new Equipamento();

        equipamento.setTipoEquipamento( equipamentoDTOToTipoEquipamento( dto ) );
        equipamento.setId( dto.getId() );
        equipamento.setNome( dto.getNome() );
        equipamento.setPrecoDiaria( dto.getPrecoDiaria() );

        return equipamento;
    }

    @Override
    public EquipamentoDTO toDto(Equipamento equipamento) {
        if ( equipamento == null ) {
            return null;
        }

        EquipamentoDTO equipamentoDTO = new EquipamentoDTO();

        equipamentoDTO.setIdTipoEquipamento( equipamentoTipoEquipamentoId( equipamento ) );
        equipamentoDTO.setId( equipamento.getId() );
        equipamentoDTO.setNome( equipamento.getNome() );
        if ( equipamento.getPrecoDiaria() != null ) {
            equipamentoDTO.setPrecoDiaria( equipamento.getPrecoDiaria() );
        }

        return equipamentoDTO;
    }

    protected TipoEquipamento equipamentoDTOToTipoEquipamento(EquipamentoDTO equipamentoDTO) {
        if ( equipamentoDTO == null ) {
            return null;
        }

        TipoEquipamento tipoEquipamento = new TipoEquipamento();

        tipoEquipamento.setId( equipamentoDTO.getIdTipoEquipamento() );

        return tipoEquipamento;
    }

    private Integer equipamentoTipoEquipamentoId(Equipamento equipamento) {
        if ( equipamento == null ) {
            return null;
        }
        TipoEquipamento tipoEquipamento = equipamento.getTipoEquipamento();
        if ( tipoEquipamento == null ) {
            return null;
        }
        Integer id = tipoEquipamento.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
