package com.projeto.itau.application.port.in;

import com.projeto.itau.domain.entity.Transacao;

public interface BuscarTransacaoPorIdUseCase{
    Transacao buscarTransacaoPorId(String id_transacao);
}
