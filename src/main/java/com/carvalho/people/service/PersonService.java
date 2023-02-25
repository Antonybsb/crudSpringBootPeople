package com.carvalho.people.service;


import com.carvalho.people.dto.request.PersonRequestDTO;
import com.carvalho.people.dto.response.PersonResponseDTO;

import java.util.List;

public interface PersonService {

    PersonResponseDTO findByID(Long id);

    List<PersonResponseDTO> findAll();

    PersonResponseDTO register(PersonRequestDTO personDTO);

    PersonResponseDTO update(Long id, PersonRequestDTO personDTO);

    String delete(Long id);


}
