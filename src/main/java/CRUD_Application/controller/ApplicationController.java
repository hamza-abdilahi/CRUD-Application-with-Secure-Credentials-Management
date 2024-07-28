package CRUD_Application.controller;

import CRUD_Application.model.ProductCatalog;
import CRUD_Application.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ApplicationController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    // responseEntity is the return type // <list> is the body <productcatalog> object
    // the method.
    //get all product is just a var name
    public ResponseEntity<List<ProductCatalog>> getAllProducts() {
        // time to find the stuff.
        //Declares a variable named products that will hold a List of ProductCatalog objects.
        List<ProductCatalog> product = productRepository.findAll();
        //ResponseEntity.ok(products): Wraps the products list in a ResponseEntity with an HTTP 200 OK status,
        // which is then returned by the method.
        return ResponseEntity.ok(product);
    }

    @GetMapping("/Electronics")
    public ResponseEntity<List<ProductCatalog>> getAllElectronics() {
        List<ProductCatalog> electronics = productRepository.findAllElectronics();
        return ResponseEntity.ok().body(electronics);
    }

    @GetMapping("/Fashion")
    public ResponseEntity<List<ProductCatalog>> getAllFashion() {
        List<ProductCatalog> fashion = productRepository.findAllFashion();
        return ResponseEntity.ok().body(fashion);
    }
    @GetMapping("/Health")
    public ResponseEntity<List<ProductCatalog>> getAllHealthBeauty() {
        List<ProductCatalog> HealthBeauty = productRepository.findAllHealthBeauty();
        return ResponseEntity.ok().body(HealthBeauty);
    }
    @GetMapping("/HomeGarden")
    public ResponseEntity<List<ProductCatalog>> getAllHomeGarden() {
        List<ProductCatalog> HomeGarden = productRepository.findAllHomeGarden();
        return ResponseEntity.ok().body(HomeGarden);
    }

        @GetMapping("/HomeAppliances")
    public ResponseEntity<List<ProductCatalog>> getAllHomeAppliances() {
        List<ProductCatalog> HomeAppliances = productRepository.findAllHomeAppliances();
        return ResponseEntity.ok().body(HomeAppliances);
    }

       @GetMapping("/KitchenAppliances")
    public ResponseEntity<List<ProductCatalog>> getAllKitchenAppliances() {
        List<ProductCatalog> KitchenAppliances = productRepository.findAllKitchenAppliances();
        return ResponseEntity.ok().body(KitchenAppliances);
    }
      @GetMapping("/SportsOutdoors")
    public ResponseEntity<List<ProductCatalog>> getAllSportsOutdoors() {
        List<ProductCatalog> SportsOutdoors = productRepository.findAllSportsOutdoors();
        return ResponseEntity.ok().body(SportsOutdoors);
    }
    @GetMapping("/{id}")
    public ResponseEntity<ProductCatalog> searchById(@PathVariable Long id) {
        return productRepository.findById(id)
                // If found, map it to a 200 OK response
                .map(product -> ResponseEntity.ok(product))
                // If not found, return a 404 Not Foufnd response
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    // 3. Create a New Product Method: POST

    @PostMapping("/newItem")
    public ResponseEntity<ProductCatalog> createItem(@RequestBody ProductCatalog productCatalog) {
        // Save the incoming product to the database
        ProductCatalog createItem = productRepository.save(productCatalog);
        // Save the incoming product to the database
        return new ResponseEntity<>(createItem, HttpStatus.CREATED);

        //@PostMapping: Maps the method to POST requests.
        //@RequestBody: Binds the HTTP request body to a Java object.
        //productCatalogRepository.save(productCatalog): Saves the product to the database.
        //ResponseEntity: Constructs the HTTP response with a body and status code.
        //HttpStatus.CREATED: Indicates that a new resource was successfully created.
    }


    //4. Update an Existing Product
    //This endpoint updates an existing product identified by its ID.
    //Method: PUT
    //URL: /products/{id}
    @PutMapping("/{id}")
    public ResponseEntity<ProductCatalog> updatingProduct(@PathVariable Long id, @RequestBody ProductCatalog productCatalog) {
        if (productRepository.existsById(id)) {
            productCatalog.setId(id);
            ProductCatalog updatingProduct = productRepository.save(productCatalog);
            return new ResponseEntity<>(updatingProduct, HttpStatus.CREATED);
        }
        return ResponseEntity.notFound().build();
    }

    //5. Delete a Product
    //This endpoint removes a product from the database by its ID.
    //
    //Method: DELETE
    //URL: /products/{id
    @DeleteMapping("{id}")
    public ResponseEntity<Void> deleteById(@PathVariable Long id) {
        productRepository.deleteById(id);
        return ResponseEntity.ok().build();
    }

}

