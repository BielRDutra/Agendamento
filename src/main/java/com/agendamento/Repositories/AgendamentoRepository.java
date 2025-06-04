package com.agendamento.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.agendamento.Entities.Agendamento;

public interface AgendamentoRepository  extends JpaRepository< Agendamento, Long> {

    // Aqui você pode adicionar métodos personalizados de consulta, se necessário.
    // Por exemplo, para encontrar agendamentos por emailDestinatario:
    // List<Agendamento> findByEmailDestinatario(String emailDestinatario);
    
}
