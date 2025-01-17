package api.foro.hub.api.foro.hub.domain.topico;

import java.time.LocalDateTime;

public record DatosRespuestaTopico(Long id, String titulo, String mensaje, LocalDateTime fecha, String autor, String estado_topico, String curso) {
}
