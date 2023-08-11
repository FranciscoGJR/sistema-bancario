package com.banco.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.banco.model.Curso;

/**
 * Interface que define a camada de acesso a dados para a entidade Curso.
 * Esta interface estende JpaRepository, fornecendo acesso a operações de CRUD (Create, Read, Update, Delete) para a entidade Curso.
 */
@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {

    
	/**
     * Busca cursos pelo nome completo informado.
     *
     * @param nome O nome completo dos cursos a serem buscados.
     * @return Uma lista contendo os cursos encontrados com base no nome completo informado.
     */
    List<Curso> findCursoByNome(String nome);

    
    /**
     * Busca cursos cujo nome contenha a sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos.
     * @return Uma lista contendo os cursos cujos nomes contêm a sequência de caracteres informada.
     */
    List<Curso> findCursoByNomeContaining(String valor);

    
    /**
     * Busca cursos cujo nome corresponda, ignorando maiúsculas e minúsculas, à sequência de caracteres informada.
     *
     * @param valor A sequência de caracteres a ser buscada no nome dos cursos, sem distinção entre maiúsculas e minúsculas.
     * @return Uma lista contendo os cursos cujos nomes correspondem à sequência de caracteres informada, ignorando maiúsculas e minúsculas.
     */
    List<Curso> findCursoByNomeIgnoreCase(String valor);
}
