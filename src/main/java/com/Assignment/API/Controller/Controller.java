package com.Assignment.API.Controller;

import com.Assignment.API.Entity.Load;
import com.Assignment.API.Services.LoadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {

    @Autowired(required = true)
    private LoadService loadService;

    @GetMapping("/load")
    public List<Load> getLoad() {
        return this.loadService.getLoad();
    }

    @GetMapping("/load/{loadId}")
    public Load getLoadId(@PathVariable String loadId) {
        return this.loadService.getLoadId(Integer.parseInt(loadId));
    }

    @PostMapping("/addLoad")
    public String addLoad(@RequestBody Load load) {
        this.loadService.addLoad(load);
        return (String) "Response: loads details added successfully";
    }

    @PutMapping("/updateLoad")
    public Load updateLoad(@RequestBody Load load) {
        return this.loadService.updateLoad(load);
    }

    @PutMapping("/updateLoad/{loadId}")
    public Load updateLoadId(@PathVariable String loadId,@RequestBody Load load ) {
        load.setShipperId(Integer.parseInt(loadId));
        return this.loadService.updateLoad(load);
    }

    @DeleteMapping("deleteLoad/{loadId}")
    public ResponseEntity<HttpStatus> deleteLoad(@PathVariable String loadId) {
        try {
            this.loadService.deleteLoad(Integer.parseInt(loadId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
