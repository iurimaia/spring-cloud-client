package br.com.iurimaia.clientservice.repository;

import br.com.iurimaia.clientservice.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by iurimaia on 18/08/17.
 */
@Repository("clientRepository")
public interface ClientRepository extends JpaRepository<Client, Long> {
}
