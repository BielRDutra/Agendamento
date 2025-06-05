package com.agendamento.Controllers.DTO.In;


import com.agendamento.Entities.StatusNotificacaoEnum;

public record AgendamentoRecord(Long id,
                                StatusNotificacaoEnum statusNotificacao,
                                String emailDestinatario,
                                String telefoneDestinatario,
                                String mensagem,
                                String dataHoraAgendamento,
                                String dataHoraEnvio,
                                String dataHoraModificacao) {

    public AgendamentoRecord {
        // Aqui você pode adicionar validações, se necessário
    }}