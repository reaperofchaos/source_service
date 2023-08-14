package com.jomondb.source.service.mappers

import com.jomondb.source.dataobject.ExpertDTO
import com.jomondb.source.domain.Experts

class ExpertMapper {
    fun Experts.toExpertDTO() = ExpertDTO(
        ID = ID,
        FirstName = first_name,
        MiddleName = middle_name,
        LastName = last_name,
        Suffix = Suffix
    )

    fun ExpertToExpertDTO(expert: Experts): ExpertDTO {
        return expert.toExpertDTO()
    }

    fun listExpertToListExpertDTO(expertList: List<Experts>): List<ExpertDTO>{
        var dtoList = mutableListOf<ExpertDTO>()
        expertList.forEach{it->dtoList.add(it.toExpertDTO())}
        return dtoList;
    }

    fun ExpertDTO.toExpert() = Experts(
        ID = ID,
        first_name = FirstName,
        middle_name = MiddleName,
        last_name = LastName,
        Suffix = Suffix)


    fun ExpertDTOToExpert(expertDTO: ExpertDTO): Experts{
        return expertDTO.toExpert()
    }

    fun listExpertDTOToListExpert(expertDTOList: List<ExpertDTO>): List<Experts>{
        var expertList = mutableListOf<Experts>()
        expertDTOList.forEach{it->expertList.add(it.toExpert())}
        return expertList;
    }

}