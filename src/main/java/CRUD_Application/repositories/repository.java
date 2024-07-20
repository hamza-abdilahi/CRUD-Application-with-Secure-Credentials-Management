package CRUD_Application.repositories;

import CRUD_Application.model.productCatalog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface repository extends JpaRepository<productCatalog, Long> {

    // entry Query here!'


}
