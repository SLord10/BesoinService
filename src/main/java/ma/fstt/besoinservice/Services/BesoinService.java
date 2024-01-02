package ma.fstt.besoinservice.Services;

import ma.fstt.besoinservice.Entities.Besoin;
import ma.fstt.besoinservice.Repositories.BesoinRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BesoinService {
    @Autowired
    BesoinRepo BesoinRepo;

    public void save(Besoin Besoin){
        BesoinRepo.save(Besoin);
    }

    public void delete(Long id){
        BesoinRepo.deleteById(id);
    }

    public Besoin getone(Long id){
        return BesoinRepo.findById(id).get();
    }

    public List<Besoin> getall(){
        return BesoinRepo.findAll();
    }

    public void update(Besoin Besoin){

        BesoinRepo.save(Besoin);
    }


    public List<Besoin> findByUser_id(Long id_user){
        return BesoinRepo.findByUser_id(id_user);
    }


}
