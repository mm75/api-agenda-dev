package com.api.agenda.dev.apiagendadev.repository;

import com.api.agenda.dev.apiagendadev.domain.Agcmotivocancelamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AgcmotivocancelamentoRepository extends CrudRepository<Agcmotivocancelamento, Long> {
    List<Agcmotivocancelamento> findByNoAgcmotivocancelamento(String noAgcmotivocancelamento);
}
