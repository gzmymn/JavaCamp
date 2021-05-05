package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService {

	private ProductDao productDao; //dependency injection
	private LoggerService loggerService;
		
	public ProductManager(ProductDao productDao, LoggerService loggerService) {
		super();
		this.productDao = productDao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		//�� kodlar�
		
		if(product.getCategoryId()==1) {
			System.out.println("Bu kategoride �r�n kabul edilmiyor!");
			return; //metod return'u g�rd��� anda a�a��ya bakmaz
		}
		
		this.productDao.add(product); //hibernate'e ba��ml�l���m yok 
		this.loggerService.logToSystem("�r�n eklendi : " + product.getName());
		
		
	}

	@Override
	public List<Product> getall() {
		// TODO Auto-generated method stub
		return null;
	}

}
