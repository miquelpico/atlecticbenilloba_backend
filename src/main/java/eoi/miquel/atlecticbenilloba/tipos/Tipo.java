package eoi.miquel.atlecticbenilloba.tipos;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tipo {
    @Id int id;
    private String nombre;
}
