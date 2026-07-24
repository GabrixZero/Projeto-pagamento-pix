package com.projeto.itau.adapter.in.http.controller;

import com.projeto.itau.application.port.in.BuscarTransacaoPorIdUseCase;
import com.projeto.itau.domain.entity.Transacao;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {

    private final BuscarTransacaoPorIdUseCase buscarTransacaoPorIdUseCase;

    public TransacaoController(BuscarTransacaoPorIdUseCase buscarTransacaoPorIdUseCase) {
        this.buscarTransacaoPorIdUseCase = buscarTransacaoPorIdUseCase;
    }

    @GetMapping("/{id_transacao}")
    public ResponseEntity<Transacao> buscarPorTransacaoId(@PathVariable String id_transacao){
        Transacao transacao = buscarTransacaoPorIdUseCase.buscarTransacaoPorId(id_transacao);
        return ResponseEntity.ok(transacao);
    }

}
