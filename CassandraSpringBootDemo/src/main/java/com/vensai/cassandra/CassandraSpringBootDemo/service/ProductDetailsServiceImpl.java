package com.vensai.cassandra.CassandraSpringBootDemo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vensai.cassandra.CassandraSpringBootDemo.domain.ProductDetailsDomain;
import com.vensai.cassandra.CassandraSpringBootDemo.repository.ProductDetailsRepository;
import com.vensai.cassandra.CassandraSpringBootDemo.transformer.ConvertEntityToVo;
import com.vensai.cassandra.CassandraSpringBootDemo.transformer.ConvertVoToEntity;
import com.vensai.cassandra.CassandraSpringBootDemo.transformer.UpdateTheProductDetails;
import com.vensai.cassandra.CassandraSpringBootDemo.vo.ProductDetails;

@Service
public class ProductDetailsServiceImpl {

	@Autowired
	private ProductDetailsRepository detailsRepository;

	@Autowired
	private ConvertEntityToVo convertEntityToVo;

	@Autowired
	private ConvertVoToEntity convertVoToEntity;

	@Autowired
	private UpdateTheProductDetails updateDetails;

	public ProductDetails addProduct(ProductDetails details) {
		ProductDetailsDomain detailsDomain = convertVoToEntity.convert(details);
		detailsRepository.save(detailsDomain);
		return convertEntityToVo.convert(detailsDomain);
	}

	public List<ProductDetails> listAll() {
		List<ProductDetails> detailsVo = new ArrayList<>();
		detailsRepository.findAll().forEach(detailsEntity -> detailsVo.add(convertEntityToVo.convert(detailsEntity)));
		return detailsVo;
	}

	public ProductDetails updatePrduct(UUID id, ProductDetails details) {
		ProductDetailsDomain detailsDomain = updateDetails.updateproductDetailsDomain(details,
				detailsRepository.findById(id).get());
		return convertEntityToVo.convert(detailsDomain);
	}

	public ProductDetails getProductDetailsById(UUID id) {
		return convertEntityToVo.convert(detailsRepository.findById(id).get());
	}

	public void deleteProduct(UUID id) {
		detailsRepository.delete(detailsRepository.findById(id).get());
		
	}

}
