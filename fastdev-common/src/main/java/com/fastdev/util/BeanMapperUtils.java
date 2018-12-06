package com.fastdev.util;

import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;
import ma.glasnost.orika.metadata.Type;

import java.util.List;

public abstract class BeanMapperUtils {

    private static MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

    public static <S,D> D map(S source,Class<D> clazz){
        MapperFacade mapper = mapperFactory.getMapperFacade();
        return mapper.map(source, clazz);
    }

    public static <S, D> D map(S s, Type<S> sType, Type<D> dType){
        MapperFacade mapper = mapperFactory.getMapperFacade();
        return mapper.map(s, sType, dType);
    }

    public static <S,D> List<D> mapAsList(List<S> source, Class<D> clazz){
        MapperFacade mapper = mapperFactory.getMapperFacade();
        return mapper.mapAsList(source, clazz);
    }




}
