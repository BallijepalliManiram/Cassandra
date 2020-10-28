package com.vensai.cassandra.CassandraSpringBootDemo.repository;

import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.vensai.cassandra.CassandraSpringBootDemo.domain.ProductDetailsDomain;

public interface  ProductDetailsRepository extends CrudRepository<ProductDetailsDomain, UUID>{

}
