package com.basis.srs.servico.mapper;

import com.basis.srs.dominio.Sala;
import com.basis.srs.dominio.TipoSala;
import com.basis.srs.servico.dto.SalaDTO;
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
public class SalaMapperImpl implements SalaMapper {

    @Autowired
    private SalaEquipamentoMapper salaEquipamentoMapper;

    @Override
    public List<Sala> toEntity(List<SalaDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Sala> list = new ArrayList<Sala>( dtoList.size() );
        for ( SalaDTO salaDTO : dtoList ) {
            list.add( toEntity( salaDTO ) );
        }

        return list;
    }

    @Override
    public List<SalaDTO> toDto(List<Sala> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<SalaDTO> list = new ArrayList<SalaDTO>( entityList.size() );
        for ( Sala sala : entityList ) {
            list.add( toDto( sala ) );
        }

        return list;
    }

    @Override
    public Sala toEntity(SalaDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Sala sala = new Sala();

        sala.setTipoSala( salaDTOToTipoSala( dto ) );
        sala.setId( dto.getId() );
        sala.setDescricao( dto.getDescricao() );
        sala.setCapacidade( dto.getCapacidade() );
        sala.setPrecoDiaria( dto.getPrecoDiaria() );
        sala.setEquipamentos( salaEquipamentoMapper.toEntity( dto.getEquipamentos() ) );

        return sala;
    }

    @Override
    public SalaDTO toDto(Sala sala) {
        if ( sala == null ) {
            return null;
        }

        SalaDTO salaDTO = new SalaDTO();

        salaDTO.setIdTipoSala( salaTipoSalaId( sala ) );
        salaDTO.setId( sala.getId() );
        salaDTO.setPrecoDiaria( sala.getPrecoDiaria() );
        salaDTO.setDescricao( sala.getDescricao() );
        salaDTO.setCapacidade( sala.getCapacidade() );
        salaDTO.setEquipamentos( salaEquipamentoMapper.toDto( sala.getEquipamentos() ) );

        return salaDTO;
    }

    protected TipoSala salaDTOToTipoSala(SalaDTO salaDTO) {
        if ( salaDTO == null ) {
            return null;
        }

        TipoSala tipoSala = new TipoSala();

        tipoSala.setId( salaDTO.getIdTipoSala() );

        return tipoSala;
    }

    private Integer salaTipoSalaId(Sala sala) {
        if ( sala == null ) {
            return null;
        }
        TipoSala tipoSala = sala.getTipoSala();
        if ( tipoSala == null ) {
            return null;
        }
        Integer id = tipoSala.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
