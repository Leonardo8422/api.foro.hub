package api.foro.hub.api.foro.hub.controller;


import api.foro.hub.api.foro.hub.domain.topico.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@RestController
@RequestMapping("/topico")
public class TopicoController {


    @Autowired
    private TopicoRepository topicoRepository;

    @PostMapping
    public void datosRegistroTopico(@RequestBody @Valid DatosRegistroTopico datosRegistroTopico) {
        topicoRepository.save(new Topico(datosRegistroTopico));
//        Topico topico = topicoRepository.save(new Topico(datosRegistroTopico));
//        DatosRespuestaTopico datosRespuestaTopico = new DatosRespuestaTopico(topico.getId(), topico.getTitulo(), topico.getMensaje(),
//                topico.getFecha(), topico.getEstado_topico().toString(), topico.getAutor(), topico.getCurso().toString());

//        URI url = uriComponentsBuilder.path("/topico/{id}").buildAndExpand(topico.getId()).toUri();
//        return ResponseEntity.created(url).body(datosRespuestaTopico);
    }

    @GetMapping
    public Page<DatosListarTopicos> listadoTopicos(@PageableDefault(size = 3) Pageable paginacion) {
        return topicoRepository.findAll(paginacion).map(DatosListarTopicos::new);
        //return ResponseEntity.ok(topicoRepository.findByTituloTrue(paginacion).map(DatosListarTopicos::new));
    }


}
