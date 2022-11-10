package models.signals;

import com.mindsmiths.ruleEngine.model.Agent;
import com.mindsmiths.sdk.core.api.Message;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AgentCreated extends Message {
    Agent agent;
}
