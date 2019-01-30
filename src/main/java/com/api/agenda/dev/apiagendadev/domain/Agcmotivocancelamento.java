package com.api.agenda.dev.apiagendadev.domain;

import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Agcmotivocancelamento {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "agcmotivocancelamento_generator")
    @SequenceGenerator(name = "agcmotivocancelamento_generator", sequenceName = "agcmotivocancelamento_id_agcmotivocancelamento_seq", allocationSize=1)
    private Long idAgcmotivocancelamento;

    @Nullable
    @Size(max = 30)
    private String noAgcmotivocancelamento;

    @Nullable
    private boolean ativo;

    public Long getIdAgcmotivocancelamento() {
        return idAgcmotivocancelamento;
    }

    public void setIdAgcmotivocancelamento(Long idAgcmotivocancelamento) {
        this.idAgcmotivocancelamento = idAgcmotivocancelamento;
    }

    public String getNoAgcmotivocancelamento() {
        return noAgcmotivocancelamento;
    }

    public void setNoAgcmotivocancelamento(String noAgcmotivocancelamento) {
        this.noAgcmotivocancelamento = noAgcmotivocancelamento;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
