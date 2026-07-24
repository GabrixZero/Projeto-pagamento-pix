package com.projeto.itau.adapter.out.persistence;

import com.projeto.itau.domain.entity.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, String>{
}
