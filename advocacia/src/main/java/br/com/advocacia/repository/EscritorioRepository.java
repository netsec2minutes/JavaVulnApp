package br.com.advocacia.repository;

import br.com.advocacia.entities.Escritorio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface EscritorioRepository extends JpaRepository<Escritorio, Long> {

    Escritorio save(Escritorio escritorio);
    void deleteById(Long id);
    Optional<Escritorio> findById(Long id);
    List<Escritorio> findAll();
}
