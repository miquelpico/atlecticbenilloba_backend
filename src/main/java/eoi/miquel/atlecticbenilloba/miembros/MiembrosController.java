package eoi.miquel.atlecticbenilloba.miembros;


import java.util.List;

import org.springframework.http.HttpStatus;
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
@RequestMapping("/miembros")
@RequiredArgsConstructor
public class MiembrosController {
    
    private final MiembrosService miembrosService;
    
    @GetMapping
    public List<Miembro> getAll() {
            return (List<Miembro>)miembrosService.getAll();
    }

    @GetMapping("/{id}")
    public Miembro getMiembro(@PathVariable int id) {
        return miembrosService.getMiembro(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Miembro insertMiembro (@RequestBody Miembro m) {
        return miembrosService.insertMiembro(m);
    }

    @PutMapping("/{id}")
    public Miembro updateMiembro(@RequestBody Miembro m, @PathVariable int id) {
        return miembrosService.updateMiembro(m, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteMiembro(@PathVariable int id) {
        miembrosService.deleteMiembro(id);
    }
}