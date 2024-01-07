package ma.fstt.besoinservice.Controllers;

import ma.fstt.besoinservice.Entities.Besoin;
import ma.fstt.besoinservice.Services.BesoinService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequestMapping("/besoin")
@RestController
@CrossOrigin
public class BesoinCtl {

    @Autowired
    BesoinService besoinService;

    @PostMapping("")
    public ResponseEntity<Map<String, Object>> add(@RequestBody Besoin Besoin){
        besoinService.save(Besoin);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "saved");
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, Object>> delete(@PathVariable("id") Long id){
        besoinService.delete(id);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "deleted");
        return ResponseEntity.ok(response);
    }

    @GetMapping
    public ResponseEntity<Map<String, Object>> getall(){
        List<Besoin> besoins = besoinService.getall();
        Map<String, Object> response = new HashMap<>();
        if (!besoins.isEmpty()){
            response.put("data", besoins);
            return ResponseEntity.ok(response);
        }else {
            response.put("data", null);
            return ResponseEntity.ok(response);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Map<String, Object>> getone(@PathVariable("id") Long id ){
        Besoin Besoin = besoinService.getone(id);
        Map<String, Object> response = new HashMap<>();
        if (Besoin != null){
            response.put("data", Besoin);
            return ResponseEntity.ok(response);
        }else {
            response.put("data", null);
            return ResponseEntity.ok(response);
        }
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Map<String, Object>> update(@PathVariable("id") Long id ,@RequestBody Besoin Besoin) {
        Besoin.setBesoin_id(id);
        besoinService.update(Besoin);
        Map<String, Object> response = new HashMap<>();
        response.put("message", "updated");
        return ResponseEntity.ok(response);
    }

    @GetMapping("/user/{id_user}")
    public ResponseEntity<Map<String, Object>> findByUser_id(@PathVariable("id_user") Long id_user ){
        List<Besoin> besoins = besoinService.findByUser_id(id_user);
        Map<String, Object> response = new HashMap<>();
        if (!besoins.isEmpty()){
            response.put("data", besoins);
            return ResponseEntity.ok(response);
        }else {
            response.put("data", null);
            return ResponseEntity.ok(response);
        }
    }

}
