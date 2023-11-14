package controller;

import com.example.api.cadastro.Model.Cliente;
import com.example.api.cadastro.Service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    public  ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    ClienteService clienteService;

    @GetMapping()
    List<Cliente> findAll(){
     return this.clienteService.findAll();
    }

    @PostMapping("/salvar")
    Cliente saveEntity(Cliente cliente) {
        return this.clienteService.saveEntity(cliente);
    }
}
