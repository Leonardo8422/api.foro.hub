package api.foro.hub.api.foro.hub.domain.topico;

import java.time.LocalDateTime;

public record DatosListarTopicos(Long id, String titulo, String mensaje, LocalDateTime fecha, String estado_topico, String curso) {

    public DatosListarTopicos(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensaje(), topico.getFecha(), topico.getEstado_topico().toString(), topico.getCurso().toString());
    }
}
