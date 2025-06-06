package com.agendamento.Services;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.agendamento.Controllers.DTO.In.AgendamentoRecord;
import com.agendamento.Controllers.DTO.Out.AgendamentoRecordOut;
import com.agendamento.Entities.Agendamento;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    AgendamentoRecord toEntity(AgendamentoRecord agendamentoRecord);
    AgendamentoRecordOut paraOut(AgendamentoRecord entity);
    AgendamentoRecordOut paraOut(Agendamento entity);
    AgendamentoRecordOut toDto(AgendamentoRecord save);

    @Mapping(target = "id", ignore = true)
    AgendamentoRecord toEntityCancelamento(AgendamentoRecordOut agendamentoRecordOut);
    
}