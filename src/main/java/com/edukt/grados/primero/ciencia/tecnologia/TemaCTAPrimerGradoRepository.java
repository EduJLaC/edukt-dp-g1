package com.edukt.grados.primero.ciencia.tecnologia;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "CTA1G")
public interface TemaCTAPrimerGradoRepository
    extends MongoRepository<TemaCTAPrimerGrado, String> {
}
