package com.david.spring7restmvc.mappers;

import com.david.spring7restmvc.entities.Beer;
import com.david.spring7restmvc.model.BeerDTO;
import org.mapstruct.Mapper;

@Mapper
public interface BeerMapper {

    Beer beerDtoToBeer(BeerDTO dto);

    BeerDTO beerToBeerDto(Beer beer);
}
