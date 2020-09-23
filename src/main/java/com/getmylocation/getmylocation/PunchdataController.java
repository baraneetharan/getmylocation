package com.getmylocation.getmylocation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
* PunchdataController
*/

@CrossOrigin(origins = "*")
@EnableAspectJAutoProxy(proxyTargetClass = true)
@RestController
@RequestMapping("/api/punchdatas")

public class PunchdataController {

   @Autowired
   private PunchdataService punchdataService;

   // @Autowired
   // private ModelMapper modelMapper;

   @PostMapping(value = "/", headers = "Accept=application/json")
   public ResponseEntity<Punchdata> createPunchdata(@RequestBody Punchdata Punchdata) {
       Punchdata actualPunchdata=punchdataService.createPunchdata(Punchdata);
       HttpHeaders headers = new HttpHeaders();
       // headers.setLocation(ucBuilder.path("/{id}").buildAndExpand(Punchdata.getPunchdataid()).toUri());
       return new ResponseEntity<>(actualPunchdata,headers, HttpStatus.CREATED);
   }

   @GetMapping("/")
   public @ResponseBody ResponseEntity<List<Punchdata>> all() {
       return new ResponseEntity<>(punchdataService.getPunchdatas(), HttpStatus.OK);
   }

   @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
   public ResponseEntity<Punchdata> getPunchdataById(@PathVariable("id") long id) {
       Punchdata Punchdata = punchdataService.findByPunchdataId(id);
       if (Punchdata == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       return new ResponseEntity<>(Punchdata, HttpStatus.OK);
   }

   @PutMapping(value = "/{id}", headers="Accept=application/json")
   public ResponseEntity<Punchdata> updatePunchdata(@PathVariable("id") long id,@RequestBody Punchdata currentPunchdata)
   {
       Punchdata Punchdata=punchdataService.updatePunchdata(id,currentPunchdata);
       return new ResponseEntity<>(Punchdata,HttpStatus.OK);
   }

   @DeleteMapping(value="/{id}", headers ="Accept=application/json")
   public ResponseEntity<Punchdata> deletePunchdata(@PathVariable("id") Long id){
       Punchdata user = punchdataService.findByPunchdataId(id);
       if (user == null) {
           return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       }
       punchdataService.deletePunchdataById(id);
       return new ResponseEntity<>(HttpStatus.NO_CONTENT);
   }


}