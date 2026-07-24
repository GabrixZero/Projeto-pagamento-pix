package com.projeto.itau.adapter.in.http.handler;

import com.projeto.itau.domain.exception.TransacaoNaoEncontradaException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TransacaoNaoEncontradaException.class)
    public ResponseEntity<ErrorResponse> handleTransacaoNaoEncontrada(TransacaoNaoEncontradaException e){
        ErrorResponse error = new ErrorResponse(
            "Transação não encontrada",
            e.getMessage(),
            404
        );
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(error);
    }
}
