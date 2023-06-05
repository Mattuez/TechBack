package br.com.fujideia.iesp.tecback.repository;


import br.com.fujideia.iesp.tecback.model.Visualizados;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizadosRepository extends JpaRepository<Visualizados,Integer> {
}
