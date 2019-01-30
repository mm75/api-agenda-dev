package com.api.agenda.dev.apiagendadev.api;

import com.api.agenda.dev.apiagendadev.domain.Agcmotivocancelamento;
import com.api.agenda.dev.apiagendadev.repository.AgcmotivocancelamentoRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("agcmotivocancelamentos")
public class AgcmotivocancelamentoApi {

    private final AgcmotivocancelamentoRepository agcmotivocancelamentoDao;

    public AgcmotivocancelamentoApi(AgcmotivocancelamentoRepository agcmotivocancelamentoDao) {
        this.agcmotivocancelamentoDao = agcmotivocancelamentoDao;
    }

    @GetMapping
    public ResponseEntity<?> listAll() {
        return new ResponseEntity<>(agcmotivocancelamentoDao.findAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<?> getAgcmotivocancelamento(@PathVariable("id") Long id) {
        Optional<Agcmotivocancelamento> agcmotivocancelamento = agcmotivocancelamentoDao.findById(id);

        return new ResponseEntity<>(agcmotivocancelamento, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> save(@RequestBody Agcmotivocancelamento agcmotivocancelamento) {
        return new ResponseEntity<>(agcmotivocancelamentoDao.save(agcmotivocancelamento), HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Agcmotivocancelamento agcmotivocancelamento) {
        return new ResponseEntity<>(agcmotivocancelamentoDao.save(agcmotivocancelamento), HttpStatus.OK);
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        agcmotivocancelamentoDao.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
