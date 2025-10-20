package devtitans.antoshchuk.scheduleschoolboard.service.util.mapper;

public interface Mapper {
    Object mapDtoToModel(Object dto, Class<?> dtoClass);
    Object mapModelToDto(Object model, Class<?> dtoClass);
}
