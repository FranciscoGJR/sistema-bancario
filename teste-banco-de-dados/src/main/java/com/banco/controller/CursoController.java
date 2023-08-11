package com.banco.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco.model.Curso;
import com.banco.services.CursoServices;

/**
 * Controlador para a entidade Curso.
 * Este controlador fornece endpoints para criar, listar, buscar e excluir cursos.
 */
@RestController
@RequestMapping("/curso")
public class CursoController {

    @Autowired 
    CursoServices cursoServices;

    
    /**
     * Cria um novo curso no sistema.
     *
     * @param curso O objeto Curso a ser criado. Deve estar no formato JSON no corpo da requisição.
     * @return O curso recém-criado com seu ID gerado.
     */
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Curso create(@RequestBody Curso curso) {
        return cursoServices.create(curso);
    }
	
    
    /**
     * Retorna uma lista com todos os cursos cadastrados no sistema.
     *
     * @return Uma lista contendo todos os cursos cadastrados.
     */
    @GetMapping()
    public List<Curso> listAll() {
        return cursoServices.findAll();
    }
	
    
    /**
     * Busca um curso pelo seu ID.
     *
     * @param id O ID do curso a ser buscado.
     * @return O curso correspondente ao ID informado, se existir.
     */
    @GetMapping(value = "/{id}")
    public Curso findById(@PathVariable("id") Integer id) throws Exception {
        return cursoServices.findById(id);
    }
	
    
    /**
     * Busca cursos pelo nome informado.
     *
     * @param nome O nome (ou parte do nome) dos cursos a serem buscados.
     * @return Uma lista contendo os cursos encontrados com base no nome informado.
     */
    @GetMapping(value = "nome/{nome}")
    public List<Curso> findCursoByNome(@PathVariable("nome") String nome) {
        return cursoServices.findCursoByNome(nome);
    }
	
    
    /**
     * Busca cursos cujo nome contenha a sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos.
     * @return Uma lista contendo os cursos cujos nomes contêm a sequência de caracteres informada.
     */
    @GetMapping(value = "nomeContaining/{busca}")
    public List<Curso> findCursoByNomeContaining(@PathVariable("busca") String valor) {
        return cursoServices.findCursoByNomeContaining(valor);
    }
	
    
    /**
     * Busca cursos cujo nome corresponda, ignorando maiúsculas e minúsculas, à sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos, sem distinção entre maiúsculas e minúsculas.
     * @return Uma lista contendo os cursos cujos nomes correspondem à sequência de caracteres informada, ignorando maiúsculas e minúsculas.
     */
    @GetMapping(value = "nomeIgnoreCase/{busca}")
    public List<Curso> findCursoByNomeIgnoreCase(@PathVariable("busca") String valor) {
        return cursoServices.findCursoByNomeIgnoreCase(valor);
    }
	
    
    /**
     * Exclui um curso do sistema com base no ID informado.
     *
     * @param id O ID do curso a ser excluído.
     */
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable("id") Integer id) {
        cursoServices.deleteById(id); 
    }
}
