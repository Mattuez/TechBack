package br.com.fujideia.iesp.tecback.repository;


import br.com.fujideia.iesp.tecback.model.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil,Integer> {
}
