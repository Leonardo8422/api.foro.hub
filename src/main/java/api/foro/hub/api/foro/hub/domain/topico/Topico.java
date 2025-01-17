package api.foro.hub.api.foro.hub.domain.topico;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Table(name = "topicos")
@Entity(name = "Topico")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Topico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String mensaje;
    private LocalDateTime fecha;
    @Enumerated(EnumType.STRING)
    private EstadoTopico estado_topico;
    private String autor;
    @Enumerated(EnumType.STRING)
    private TipoCursos curso;

    public Topico(DatosRegistroTopico datosRegistrarTopico){
        this.titulo = datosRegistrarTopico.titulo();
        this.mensaje = datosRegistrarTopico.mensaje();
        this.fecha = datosRegistrarTopico.fecha();
        this.estado_topico = datosRegistrarTopico.estado_topico();
        this.autor = datosRegistrarTopico.autor();
        this.curso = datosRegistrarTopico.curso();
    }
    public Topico() { }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public EstadoTopico getEstado_topico() {
        return estado_topico;
    }

    public String getAutor() {
        return autor;
    }

    public TipoCursos getCurso() {
        return curso;
    }



}
