package com.vensai.cassandra.CassandraSpringBootDemo.transformer;

import org.springframework.stereotype.Component;

import com.vensai.cassandra.CassandraSpringBootDemo.domain.ProductDetailsDomain;
import com.vensai.cassandra.CassandraSpringBootDemo.vo.ProductDetails;

@Component
public class UpdateTheProductDetails {

	public ProductDetailsDomain updateproductDetailsDomain(ProductDetails details , ProductDetailsDomain detailsDomain) {
		detailsDomain.setDescription(details.getDescription());
		detailsDomain.setPrice(details.getPrice());
		detailsDomain.setProductName(details.getProductName());
		return detailsDomain;
	}
}
