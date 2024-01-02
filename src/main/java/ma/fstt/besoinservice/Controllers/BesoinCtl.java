package ma.fstt.besoinservice.Controllers;

import ma.fstt.besoinservice.Entities.Besoin;
import ma.fstt.besoinservice.Services.BesoinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/besoin")
@RestController
public class BesoinCtl {

    @Autowired
    BesoinService besoinService;

    @PostMapping("")
    public String add(@RequestBody Besoin Besoin){
        besoinService.save(Besoin);
        return "saved";
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable("id") Long id){
        besoinService.delete(id);
        return "deleted";
    }

    @GetMapping("")
    public List<Besoin> getall(){
        return besoinService.getall();
    }

    @GetMapping("/{id}")
    public Besoin getone(@PathVariable("id") Long id ){
        return besoinService.getone(id);
    }

    @PatchMapping("/{id}")
    public String update(@PathVariable("id") Long id ,@RequestBody Besoin Besoin) {
        Besoin.setBesoin_id(id);
        besoinService.update(Besoin);
        return "updated";

    }

    @GetMapping("/user/{id_user}")
    public List<Besoin> findByUser_id(@PathVariable("id_user") Long id_user ){
        return besoinService.findByUser_id(id_user);
    }

}
