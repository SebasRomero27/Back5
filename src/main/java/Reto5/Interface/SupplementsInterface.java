package Reto5.Interface;

import Reto5.Model.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface SupplementsInterface extends MongoRepository<Supplements, String>
{   
    @Query("{price:{$lte:?0}}")
    public List<Supplements> findByPrice(double price);
    
    public List<Supplements> findByDescriptionContainingIgnoreCase(String description);   
}
