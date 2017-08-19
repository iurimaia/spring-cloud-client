package br.com.iurimaia.clientservice.controller;

import br.com.iurimaia.clientservice.entity.Client;
import br.com.iurimaia.clientservice.entity.Response;
import br.com.iurimaia.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by iurimaia on 18/08/17.
 */
@RestController
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(path = "/client", method = RequestMethod.GET)
    public ResponseEntity<List<Client>> getClients() {
        List<Client> clients = clientService.getAll();
        return new ResponseEntity<List<Client>>(clients, HttpStatus.OK);
    }

    @RequestMapping(path = "/client", method = RequestMethod.POST)
    public ResponseEntity<Client> add(@RequestBody Client client) {
        //TODO : Validation
        return new ResponseEntity<Client>(clientService.add(client), HttpStatus.OK);
    }

    @RequestMapping(path = "/client", method = RequestMethod.PATCH)
    public ResponseEntity<Client> update(@RequestBody Client client) {
        //TODO : Validation
        return new ResponseEntity<Client>(clientService.update(client), HttpStatus.OK);
    }

    @RequestMapping(path = "/client/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Response> delete(@PathVariable("id") long id) {
        Client client = clientService.getById(id);
        //TODO : Validation
        clientService.delete(client);
        return new ResponseEntity<Response>(new Response(HttpStatus.OK.value(), "Client has just deleted."), HttpStatus.OK);
    }
}
