package com.projeto.itau.adapter.in.http.handler;

public record ErrorResponse(
        String titulo,
        String mensagem,
        int status
) {}