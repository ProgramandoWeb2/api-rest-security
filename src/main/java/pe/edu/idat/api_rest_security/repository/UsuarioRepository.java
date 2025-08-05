package pe.edu.idat.api_rest_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.api_rest_security.model.Usuario;

public interface UsuarioRepository
        extends JpaRepository<Usuario, String> {

}
