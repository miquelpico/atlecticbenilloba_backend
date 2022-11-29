package eoi.miquel.atlecticbenilloba.tipos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping ("/tipos")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class TiposController {
    private final TiposService tiposService;

    @GetMapping
    public List<Tipo> getTipos() {
        return tiposService.getTipos();
    }

    @GetMapping("/{id}")
    public Tipo getTipo(@PathVariable int id) {
        return tiposService.getTipo(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Tipo insertTipo(@RequestBody Tipo t) {
        return tiposService.insert(t);
    }

    @PutMapping("/{id}")
    public Tipo updateTipo(@RequestBody Tipo t, @PathVariable int id) {
        return tiposService.update(t, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteTipo(@PathVariable int id) {
        tiposService.delete(id);
    }
}
