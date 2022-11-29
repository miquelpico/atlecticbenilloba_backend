package eoi.miquel.atlecticbenilloba.tipos;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TiposService {
    private final TiposRepository tiposRepository;

    public List<Tipo> getTipos() {
        List<Tipo> tipos = (List<Tipo>) tiposRepository.findAll();
        return tipos;
    }

    public Tipo getTipo(int id) {
        return tiposRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT, "Tipo no encontrado"));
    }

    public Tipo insert(Tipo t) {
        t.setId(0);
        return tiposRepository.save(t);
    }

    public Tipo update(Tipo t, int id) {
        return tiposRepository.save(t);
    }

    public void delete(int id) {
        tiposRepository.deleteById(id);
    }
}
