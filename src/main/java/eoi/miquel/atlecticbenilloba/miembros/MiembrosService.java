package eoi.miquel.atlecticbenilloba.miembros;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor

public class MiembrosService {
    private final MiembrosRepository miembrosRepository;

    public List<Miembro> getAll() {
        return (List<Miembro>) miembrosRepository.findAll();
    }

    public Miembro getMiembro(int id) {
        return miembrosRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NO_CONTENT, "Miembro no encontrado"));
    }

    public Miembro insertMiembro(Miembro m) {
        m.setId(0);
        return miembrosRepository.save(m);
    }

    public Miembro updateMiembro(Miembro m, int id) {
        return miembrosRepository.save(m);
    }

    public void deleteMiembro(int id) {
        miembrosRepository.deleteById(id);
    }
}
