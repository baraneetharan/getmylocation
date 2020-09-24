package com.getmylocation.getmylocation;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PunchdataServiceImp implements PunchdataService {

    @Autowired
    PunchdataRepository PunchdataRepository;

    public Punchdata createPunchdata(Punchdata Punchdata) {
        return PunchdataRepository.save(Punchdata);
    }

    public List<Punchdata> getPunchdatas() {
        return PunchdataRepository.findAll();
    }

    public Punchdata findByPunchdataId(Long id) {
        return PunchdataRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Not found"));
    }

    public Punchdata updatePunchdata(Long id,Punchdata Punchdata) {
        Punchdata t = PunchdataRepository.getOne(id);
        t.setUserlatitude(Punchdata.getUserlatitude());
        t.setUserlongitude(Punchdata.getUserlongitude());
        t.setUseremail(Punchdata.getUseremail());
        t.setPunchtime(Punchdata.getPunchtime());
        t.setAddress(Punchdata.getAddress());
        return PunchdataRepository.save(t);
    }

    public void deletePunchdataById(Long id) {
        PunchdataRepository.deleteById(id);
    }

}