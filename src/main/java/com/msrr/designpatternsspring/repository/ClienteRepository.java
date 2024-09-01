package com.msrr.designpatternsspring.repository;

import com.msrr.designpatternsspring.entity.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
