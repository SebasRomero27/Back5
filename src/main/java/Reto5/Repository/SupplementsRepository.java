package Reto5.Repository;

import Reto5.Interface.SupplementsInterface;
import Reto5.Model.Supplements;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SupplementsRepository
{
    @Autowired
    private SupplementsInterface supplementsCrudRepository;
    
    public List<Supplements> getAll()
    {
        return supplementsCrudRepository.findAll();
    }
    
    public Optional<Supplements> getSupplement(String reference)
    {
        return supplementsCrudRepository.findById(reference);
    }
    
    public Supplements create(Supplements supplements)
    {
        return supplementsCrudRepository.save(supplements);
    }
    
    public void update(Supplements supplements)
    {
        supplementsCrudRepository.save(supplements);
    }
    
    public void delete(Supplements supplements)
    {
        supplementsCrudRepository.delete(supplements);
    }
    
    public List<Supplements> getByPrice(double price)
    {
        return supplementsCrudRepository.findByPrice(price);
    }

    public List<Supplements> getByDescriptionContains(String description)
    {
        return supplementsCrudRepository.findByDescriptionContainingIgnoreCase(description);
    }    
}
