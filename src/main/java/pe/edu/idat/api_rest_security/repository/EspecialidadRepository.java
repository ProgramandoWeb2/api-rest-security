package pe.edu.idat.api_rest_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.idat.api_rest_security.model.Especialidad;

public interface EspecialidadRepository extends
        JpaRepository<Especialidad, Integer> {
}
