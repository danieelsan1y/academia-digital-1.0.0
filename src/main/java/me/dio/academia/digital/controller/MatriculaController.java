package me.dio.academia.digital.controller;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.AlunoServiceImpl;
import me.dio.academia.digital.service.MatriculaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private MatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping("/{id}")
    public Matricula get(@PathVariable Long id) {
        return service.get(id);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false)
                                  String bairro) {
        return service.getAll(bairro);
    }


}
