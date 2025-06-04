package com.agendamento.Entities;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Table(name = "agendamento")
@NoArgsConstructor
@Entity

public class Agendamento {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;
    private String emailDestinatario;
    private String telefoneDestinatario;
    private LocalDateTime dataHoraAgendamento;
    private LocalDateTime dataHoraEnvio;
    private LocalDateTime dataHoraModificacao; 
    private String mensagem;
    private StatusNotificacaoEnum statusNotificacao;

    @PrePersist
    private void prePersist() {
        if (dataHoraAgendamento == null) {
            dataHoraAgendamento = LocalDateTime.now();
        }
        if (statusNotificacao == null) {
            statusNotificacao = StatusNotificacaoEnum.AGENDADO;
        }
}
}