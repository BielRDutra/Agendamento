package com.agendamento.Services;

import org.mapstruct.Mapper;

import com.agendamento.Controllers.DTO.In.AgendamentoRecord;
import com.agendamento.Controllers.DTO.Out.AgendamentoRecordOut;

@Mapper(componentModel = "spring")
public interface AgendamentoMapper {

    AgendamentoRecord toEntity(AgendamentoRecord agendamentoRecord);

    AgendamentoRecordOut toDto(AgendamentoRecord agendamentoRecord);

    void paraOut(AgendamentoRecord entity);
    
}
