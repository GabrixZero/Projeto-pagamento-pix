package com.projeto.itau.domain.entity;

import com.projeto.itau.domain.dto.Chave;
import com.projeto.itau.domain.dto.Conta;
import com.projeto.itau.domain.dto.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDateTime;

@Entity
@Table(name = "transacao")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transacao {

    @Id
    @UuidGenerator
    private String id_Pagamento;
    private Chave tipo_Chave;
    private String valor_Chave;
    private Conta tipo_Conta;
    private Integer numero_Agencia;
    private Integer numero_Conta;
    private String nome_Titular;
    private String valor_Pagamento;
    private LocalDateTime data_Pagamento;
    private Status status_Pagamento;
}
