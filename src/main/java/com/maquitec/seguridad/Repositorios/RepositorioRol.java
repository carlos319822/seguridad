package com.maquitec.seguridad.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.maquitec.seguridad.Modelos.Rol;

public interface RepositorioRol extends MongoRepository<Rol,String> {
}
