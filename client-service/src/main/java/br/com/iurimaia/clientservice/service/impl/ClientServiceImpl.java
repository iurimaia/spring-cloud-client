package br.com.iurimaia.clientservice.service.impl;

import br.com.iurimaia.clientservice.entity.Client;
import br.com.iurimaia.clientservice.repository.ClientRepository;
import br.com.iurimaia.clientservice.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by iurimaia on 18/08/17.
 */
@Service("clientService")
public class ClientServiceImpl implements ClientService {

    private ClientRepository clientRepository;

    @Autowired
    public ClientServiceImpl(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    @Override
    public List<Client> getAll() {
        return clientRepository.findAll();
    }

    @Override
    @Transactional
    public Client add(Client client) {
        return clientRepository.save(client);
    }

    @Override
    @Transactional
    public Client update(Client client) {
        return clientRepository.save(client);
    }

    @Override
    @Transactional
    public void delete(Client client) {
        clientRepository.delete(client);
    }

    @Override
    public Client getById(Long id) {
        return clientRepository.findOne(id);
    }
}
