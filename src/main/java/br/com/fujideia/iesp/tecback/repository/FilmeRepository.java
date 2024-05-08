package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.Filme;
import feign.Param;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

    List<Filme>findByTitulo(String titulo);
    List<Filme>findByTituloAndDescricao(String titulo, String descricao);

    List<Filme>findByTituloOrderByTituloAsc(String titulo);



    @Query("select f from Filme f where f.titulo=:titulo AND f.descricao=:descricao")
    List<Filme>buscarFilmePorTituloEDescricao(@Param("titulo") String titulo, @Param("descricao")String desc);


}
