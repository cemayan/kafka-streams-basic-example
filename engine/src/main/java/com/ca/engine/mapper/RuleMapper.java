package com.ca.engine.mapper;

import com.ca.engine.dto.RuleDTO;
import com.ca.engine.dto.RuleManagementDTO;
import com.ca.engine.model.Config;
import com.ca.engine.model.Rule;
import com.ca.engine.model.RuleManagement;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.common.protocol.types.Field;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RuleMapper {

    RuleMapper INSTANCE = Mappers.getMapper(RuleMapper.class);


    @Mapping(source = "ruleName", target = "ruleName")
    @Mapping(source = "eventName", target = "eventName")
    @Mapping(source = "config", target = "config", qualifiedByName = "str")
    Rule ruleDTOtoRule(RuleDTO ruleDTO);

    @Mapping(source = "rule1", target = "rule1")
    @Mapping(source = "rule2", target = "rule2")
    @Mapping(source = "logicOperator", target = "logicOperator")
    @Mapping(source = "status", target = "status")
    RuleManagement ruleManagementDTOtoRuleManagement(RuleManagementDTO ruleManagementDTO);



    @Named("str")
    public static String str(Config config) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(config);
    }
}
