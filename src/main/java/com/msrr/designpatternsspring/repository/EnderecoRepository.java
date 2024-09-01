package com.msrr.designpatternsspring.repository;

import com.msrr.designpatternsspring.entity.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository<Endereco, String> {
}
