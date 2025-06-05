package com.agendamento.Controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agendamento.Controllers.DTO.In.AgendamentoRecord;
import com.agendamento.Controllers.DTO.Out.AgendamentoRecordOut;
import com.agendamento.Services.AgendamentoService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequiredArgsConstructor
@RequestMapping("/agendamentos")
public class AgendamentoController {
    
    private final AgendamentoService agendamentoService;

    @PostMapping("path")
    public ResponseEntity<AgendamentoRecordOut> gravarAgendamento(@RequestBody AgendamentoRecord agendamento) {     
        return ResponseEntity.ok(agendamentoService.gravarAgendamento(agendamento));
    }
}
