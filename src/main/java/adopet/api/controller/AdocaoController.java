package adopet.api.controller;

import adopet.api.dto.AdocaoDTO;
import adopet.api.dto.AprovarAdocaoDTO;
import adopet.api.dto.ReprovarAdocaoDTO;
import adopet.api.dto.SolicitacaoDeAdocaoDTO;
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> 1d03577 (4.2-Lancando nossa excecao)
import adopet.api.exception.AdocaoException;
import adopet.api.service.AdocaoService;
<<<<<<< HEAD
<<<<<<< HEAD
import jakarta.persistence.EntityNotFoundException;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
=======
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> c59dc4d (Projeto inicial)
=======
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> c59dc4d (Projeto inicial)
=======
import adopet.api.service.AdocaoService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> c59dc4d (Projeto inicial)
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("adocao")
public class AdocaoController {

    @Autowired
    private AdocaoService service;

    @GetMapping
    public ResponseEntity<List<AdocaoDTO>> buscarTodos(){
        List<AdocaoDTO> adocoes = service.listarTodos();
        return ResponseEntity.ok(adocoes);
    }

    @GetMapping("/{id}")
    public ResponseEntity<AdocaoDTO> buscar(@PathVariable Long id){
        AdocaoDTO adocao = service.listar(id);
        return ResponseEntity.ok(adocao);
    }

    @PostMapping
    @Transactional
    public ResponseEntity<String> solicitar(@RequestBody @Valid SolicitacaoDeAdocaoDTO dados){
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

        try {
            this.service.solicitar(dados);
        }catch (AdocaoException ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }

=======
        this.service.solicitar(dados);
>>>>>>> c59dc4d (Projeto inicial)
=======
=======
>>>>>>> 7c11c14 (3.2 Lançando exceções)

        try {
            this.service.solicitar(dados);
        }catch (IllegalStateException ex){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
        }
<<<<<<< HEAD
>>>>>>> 7c11c14 (3.2 Lançando exceções)
=======
        this.service.solicitar(dados);
>>>>>>> c59dc4d (Projeto inicial)
=======
>>>>>>> 7c11c14 (3.2 Lançando exceções)
        return ResponseEntity.ok("Adoção solicitada com sucesso!");
    }

    @PutMapping("/aprovar")
    @Transactional
    public ResponseEntity<String> aprovar(@RequestBody @Valid AprovarAdocaoDTO dto){
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD

        try{
            this.service.aprovar(dto);
        }catch (EntityNotFoundException ex){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Adocao não encontrada");
        }

=======
        this.service.aprovar(dto);
>>>>>>> c59dc4d (Projeto inicial)
=======
        this.service.aprovar(dto);
>>>>>>> c59dc4d (Projeto inicial)
=======
        this.service.aprovar(dto);
>>>>>>> c59dc4d (Projeto inicial)
        return ResponseEntity.ok().build();
    }

    @PutMapping("/reprovar")
    @Transactional
    public ResponseEntity<String> reprovar(@RequestBody @Valid ReprovarAdocaoDTO dto){
        this.service.reprovar(dto);
        return ResponseEntity.ok().build();
    }
}
