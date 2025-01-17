package api.foro.hub.api.foro.hub.domain.topico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

import java.time.LocalDateTime;

public record DatosRegistroTopico(
        @NotBlank
        String titulo,
        @NotBlank
        String mensaje,
        @NotNull
        @PastOrPresent
        LocalDateTime fecha,
        @NotNull
        EstadoTopico estado_topico,
        @NotBlank
        String autor,
        @NotNull
        TipoCursos curso
) {
}
