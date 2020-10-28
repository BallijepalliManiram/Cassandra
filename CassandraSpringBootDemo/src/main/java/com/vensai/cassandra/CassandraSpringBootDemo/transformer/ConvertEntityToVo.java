package com.vensai.cassandra.CassandraSpringBootDemo.transformer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import com.vensai.cassandra.CassandraSpringBootDemo.domain.ProductDetailsDomain;
import com.vensai.cassandra.CassandraSpringBootDemo.vo.ProductDetails;

@Component
public class ConvertEntityToVo implements Converter<ProductDetailsDomain,ProductDetails>{

	@Override
	public ProductDetails convert(ProductDetailsDomain details) {
		ProductDetails product = new ProductDetails();
		if (details.getId() != null  && !StringUtils.isEmpty(details.getId())) {
            product.setId(details.getId());
        }
        product.setDescription(details.getDescription());
        product.setPrice(details.getPrice());
        product.setProductName(details.getProductName());
		return product;
	}

}
