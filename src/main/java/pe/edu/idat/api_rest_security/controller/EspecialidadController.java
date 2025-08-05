package pe.edu.idat.api_rest_security.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.idat.api_rest_security.model.Especialidad;
import pe.edu.idat.api_rest_security.service.EspecialidadService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/especialidad")
public class EspecialidadController {

    private final EspecialidadService especialidadService;

    public EspecialidadController(EspecialidadService especialidadService) {
        this.especialidadService = especialidadService;
    }
    @GetMapping
    public ResponseEntity<List<Especialidad>> especialidadList(){
        return new ResponseEntity<>(
                especialidadService.especialidadList(),
                HttpStatus.OK);
    }

}
