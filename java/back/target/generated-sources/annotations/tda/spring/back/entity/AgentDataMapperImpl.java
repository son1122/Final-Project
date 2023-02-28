package tda.spring.back.entity;

import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-02-26T17:50:23+0700",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 1.8.0_302 (Temurin)"
)
@Component
public class AgentDataMapperImpl implements AgentDataMapper {

    @Override
    public AgentData toEntity(AgentDataDto agentDataDto) {
        if ( agentDataDto == null ) {
            return null;
        }

        AgentData agentData = new AgentData();

        linkAgentLogin( agentData );
        linkLocationDatas( agentData );

        return agentData;
    }

    @Override
    public AgentDataDto toDto(AgentData agentData) {
        if ( agentData == null ) {
            return null;
        }

        AgentDataDto agentDataDto = new AgentDataDto();

        return agentDataDto;
    }

    @Override
    public AgentData partialUpdate(AgentDataDto agentDataDto, AgentData agentData) {
        if ( agentDataDto == null ) {
            return null;
        }

        linkAgentLogin( agentData );
        linkLocationDatas( agentData );

        return agentData;
    }
}
