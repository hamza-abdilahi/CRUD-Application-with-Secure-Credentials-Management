package CRUD_Application.repositories;

import CRUD_Application.model.ProductCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<ProductCatalog, Long> {
    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Electronics'", nativeQuery = true)
    List<ProductCatalog> findAllElectronics();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Health & Beauty'", nativeQuery = true)
    List<ProductCatalog> findAllHealthBeauty();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Fashion'", nativeQuery = true)
    List<ProductCatalog> findAllFashion();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Home & Garden'", nativeQuery = true)
    List<ProductCatalog> findAllHomeGarden();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Home Appliances'", nativeQuery = true)
    List<ProductCatalog> findAllHomeAppliances();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Kitchen Appliances'", nativeQuery = true)
    List<ProductCatalog> findAllKitchenAppliances();

    @Query(value = "SELECT * FROM product_catalog WHERE \"category\" = 'Sports & Outdoors'", nativeQuery = true)
    List<ProductCatalog> findAllSportsOutdoors();

}
