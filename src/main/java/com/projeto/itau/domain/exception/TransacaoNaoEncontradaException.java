package com.projeto.itau.domain.exception;

public class TransacaoNaoEncontradaException extends RuntimeException {
    public TransacaoNaoEncontradaException(String id_transacao) {
        super("Transação com ID " + id_transacao + " não encontrada.");
    }
}
