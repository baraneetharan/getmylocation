package com.getmylocation.getmylocation;

import java.util.List;

public interface PunchdataService {

    public Punchdata createPunchdata(Punchdata punchdata);
    public List<Punchdata> getPunchdatas();
    public Punchdata findByPunchdataId(Long id);
    public Punchdata updatePunchdata(Long id,Punchdata punchdata);
    public void deletePunchdataById(Long id); 

}