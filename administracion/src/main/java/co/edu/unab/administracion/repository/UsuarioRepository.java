package co.edu.unab.administracion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.edu.unab.administracion.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel,Integer>{
    
}
