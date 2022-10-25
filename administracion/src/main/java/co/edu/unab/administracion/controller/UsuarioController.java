package co.edu.unab.administracion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unab.administracion.model.UsuarioModel;
import co.edu.unab.administracion.repository.UsuarioRepository;

@RestController
@RequestMapping(path = "/usuario")
public class UsuarioController {
    @Autowired
    UsuarioRepository usuarioRepository;

    @GetMapping(path="/all")
    public Iterable<UsuarioModel> getAllUsuarios(){
        return  usuarioRepository.findAll();
    }
    @PostMapping(path = "/save")
    public UsuarioModel saveUsuario(@RequestBody UsuarioModel usuario){
            return usuarioRepository.save(usuario);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteUsuarioById(@PathVariable("id") int id){
        usuarioRepository.deleteById(id);
    }
}
