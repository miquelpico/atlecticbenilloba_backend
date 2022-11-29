package eoi.miquel.atlecticbenilloba.miembros;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Miembro {
    @Id private int id;
    private String nombre;
    private int dorsal;
    private int tipo;
    private String imagen_perfil;
}
