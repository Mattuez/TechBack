package br.com.fujideia.iesp.tecback.service;


import br.com.fujideia.iesp.tecback.model.Recomendados;
import br.com.fujideia.iesp.tecback.repository.RecomendadosRepository;
import jakarta.ws.rs.NotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Slf4j
@Service
public class RecomendadosService {
    @Autowired
    private RecomendadosRepository repository;

    public Recomendados salvar(Recomendados recomendados){
        recomendados = repository.save(recomendados);
        return recomendados;
    }

    public Recomendados alterar(Recomendados recomendados){
        if(Objects.nonNull(recomendados.getId())){
            recomendados = repository.save(recomendados);
        }else{
            throw new NotFoundException();
        }
        return recomendados;
    }

    public List<Recomendados> listar(){
        return repository.findAll();
    }

    public Boolean excluir(Integer id){
        try {
            repository.deleteById(id);
        }catch (Exception e ){
            log.info("Erro ao realizar Exclusão : {}", e);
            return false;

        }
        return true;
    }

    public Recomendados consultarPorId(Integer id){
        return repository
                .findById(id)
                .orElseThrow(NotFoundException::new);
    }

    public Object IdConsulta(Integer id){
        return null;
    }
}
