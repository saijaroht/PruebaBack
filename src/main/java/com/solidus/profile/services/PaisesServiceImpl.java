package com.solidus.profile.services;

import com.solidus.profile.domain.PaisDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PaisesServiceImpl implements PaisesService {

    @Override
    public List<PaisDTO> getPaises(){
        List<PaisDTO> paisTest = new ArrayList<>();
        PaisDTO pais = new PaisDTO();
        pais.setId(1l);
        pais.setName("Colombia");
        PaisDTO pais2 = new PaisDTO();
        pais2.setId(2l);
        pais2.setName("Brasil");
        paisTest.add(pais);
        paisTest.add(pais2);
        return paisTest;
    }

}
