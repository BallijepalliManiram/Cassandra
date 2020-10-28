package com.vensai.cassandra.CassandraSpringBootDemo.transformer;

import java.util.UUID;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.vensai.cassandra.CassandraSpringBootDemo.domain.ProductDetailsDomain;
import com.vensai.cassandra.CassandraSpringBootDemo.vo.ProductDetails;

@Component
public class ConvertVoToEntity implements Converter<ProductDetails, ProductDetailsDomain>{

	@Override
	public ProductDetailsDomain convert(ProductDetails details) {
		ProductDetailsDomain product = new ProductDetailsDomain();
		if (details.getId() != null  && !StringUtils.isEmpty(details.getId())) {
            product.setId(details.getId());
        }else {
        	product.setId(UUID.randomUUID());
        }
        product.setDescription(details.getDescription());
        product.setPrice(details.getPrice());
        product.setProductName(details.getProductName());
		return product;
	}

}
