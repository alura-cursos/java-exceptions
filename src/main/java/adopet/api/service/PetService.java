package adopet.api.service;

import adopet.api.dto.CadastroPetDTO;
import adopet.api.dto.PetDTO;
import adopet.api.model.Pet;
import adopet.api.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


<<<<<<< HEAD
import java.io.IOException;
=======
>>>>>>> c59dc4d (Projeto inicial)
import java.util.List;

@Service
public class PetService {

    @Autowired
    private PetRepository repository;

    @Autowired
    private ImageStorageService imagemService;

    public List<PetDTO> listarTodos(){
        return repository.findAll().stream().map(PetDTO::new).toList();
    }
<<<<<<< HEAD
    public void cadastrar(CadastroPetDTO dto, MultipartFile imagem) throws IOException {

=======
    public void cadastrar(CadastroPetDTO dto, MultipartFile imagem){
>>>>>>> c59dc4d (Projeto inicial)

        String nomeImagem = imagemService.upload(imagem);

        repository.save(new Pet(dto, nomeImagem));
    }
}
