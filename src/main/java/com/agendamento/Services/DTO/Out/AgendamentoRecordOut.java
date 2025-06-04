package com.agendamento.Services.DTO.Out;

import com.agendamento.Entities.StatusNotificacaoEnum;

public record AgendamentoRecordOut(Long id,
                                StatusNotificacaoEnum statusNotificacao,
                                String emailDestinatario,
                                String telefoneDestinatario,
                                String mensagem,
                                String dataHoraAgendamento,
                                String dataHoraEnvio,
                                String dataHoraModificacao) {

    public AgendamentoRecordOut {
        // Aqui você pode adicionar validações, se necessário
    }
    
}
