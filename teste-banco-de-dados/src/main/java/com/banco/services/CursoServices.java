package com.banco.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco.model.Curso;
import com.banco.repository.CursoRepository;

/**
 * Serviço para operações relacionadas à entidade Curso.
 * Este serviço encapsula a lógica de negócio para criar, listar, buscar e excluir cursos.
 */
@Service
public class CursoServices {

    @Autowired
    CursoRepository cursoRepository;
	
  
    /**
     * Cria um novo curso no sistema.
     *
     * @param curso O objeto Curso a ser criado.
     * @return O curso recém-criado com seu ID gerado.
     */
    public Curso create(Curso curso) {
        return cursoRepository.save(curso);
    }
	
    
    /**
     * Retorna uma lista com todos os cursos cadastrados no sistema.
     *
     * @return Uma lista contendo todos os cursos cadastrados.
     */
    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }
	
    
    /**
     * Busca um curso pelo seu ID.
     *
     * @param id O ID do curso a ser buscado.
     * @return O curso correspondente ao ID informado, se existir.
     * @throws Exception Caso o curso não seja encontrado para o ID informado.
     */
    public Curso findById(Integer id) throws Exception {
        Optional<Curso> cursoOptional = cursoRepository.findById(id);
		
        if (cursoOptional.isPresent()) {
            return cursoOptional.get();
        } else {
            throw new Exception("Curso não encontrado para o ID: " + id);
        }
    }
	
    
    /**
     * Busca cursos pelo nome informado.
     *
     * @param nome O nome (ou parte do nome) dos cursos a serem buscados.
     * @return Uma lista contendo os cursos encontrados com base no nome informado.
     */
    public List<Curso> findCursoByNome(String nome) {
        return cursoRepository.findCursoByNome(nome);
    }
	
    
    /**
     * Busca cursos cujo nome contenha a sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos.
     * @return Uma lista contendo os cursos cujos nomes contêm a sequência de caracteres informada.
     */
    public List<Curso> findCursoByNomeContaining(String valor) {
        return cursoRepository.findCursoByNomeContaining(valor);
    }
	
    
    /**
     * Busca cursos cujo nome corresponda, ignorando maiúsculas e minúsculas, à sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos, sem distinção entre maiúsculas e minúsculas.
     * @return Uma lista contendo os cursos cujos nomes correspondem à sequência de caracteres informada, ignorando maiúsculas e minúsculas.
     */
    public List<Curso> findCursoByNomeIgnoreCase(String valor) {
        return cursoRepository.findCursoByNomeIgnoreCase(valor);
    }
	
    
    /**
     * Exclui um curso do sistema com base no ID informado.
     *
     * @param id O ID do curso a ser excluído.
     * @return O ID do curso que foi excluído.
     */
    public Integer deleteById(Integer id) {
        cursoRepository.deleteById(id);
        return id;
    }
}
