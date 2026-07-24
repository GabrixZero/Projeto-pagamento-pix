package com.projeto.itau.application.service;

import com.projeto.itau.adapter.out.persistence.TransacaoRepository;
import com.projeto.itau.application.port.in.BuscarTransacaoPorIdUseCase;
import com.projeto.itau.domain.entity.Transacao;
import com.projeto.itau.domain.exception.TransacaoNaoEncontradaException;
import org.springframework.stereotype.Service;

@Service
public class BuscarTransacaoPorIdService implements BuscarTransacaoPorIdUseCase {

    private final TransacaoRepository transacaoRepository;

    public BuscarTransacaoPorIdService(TransacaoRepository transacaoRepository){
        this.transacaoRepository = transacaoRepository;
    }

    @Override
    public Transacao buscarTransacaoPorId(String id_transacao){
        return transacaoRepository.findById(id_transacao)
                .orElseThrow(() -> new TransacaoNaoEncontradaException(id_transacao));
    }
}
