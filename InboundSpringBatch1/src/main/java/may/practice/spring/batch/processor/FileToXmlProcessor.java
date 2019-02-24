package may.practice.spring.batch.processor;

import org.springframework.batch.item.ItemProcessor;

import may.practice.spring.batch.vo.ProductVo;

public class FileToXmlProcessor implements ItemProcessor<ProductVo,ProductVo>{

	public ProductVo process(ProductVo item) throws Exception {

		if(!"sgd".equals(item.getCurrency())) {
			return null;
		}

		return item;
	}


}
