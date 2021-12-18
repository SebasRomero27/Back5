package Reto5.Interface;

import Reto5.Model.Supplements;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SupplementsInterface extends MongoRepository<Supplements, String>
{
    public List<Supplements> findByPrice(double price);
    public List<Supplements> findByDescriptionContainingIgnoreCase(String description);   
}
