package com.agendamento.Services;

import org.springframework.stereotype.Service;

import com.agendamento.Controllers.DTO.In.AgendamentoRecord;
import com.agendamento.Controllers.DTO.Out.AgendamentoRecordOut;
import com.agendamento.Repositories.AgendamentoRepository;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service

public class AgendamentoService {
    private final AgendamentoRepository agendamentoRepository;
    private final AgendamentoMapper agendamentoMapper;

    public AgendamentoRecordOut gravarAgendamento(AgendamentoRecord agendamentoRecord) {
        agendamentoMapper.paraOut(agendamentoMapper.toEntity(agendamentoRecord));
        return agendamentoMapper.toDto(agendamentoRepository.save(agendamentoMapper.toEntity(agendamentoRecord)));
    }
}
