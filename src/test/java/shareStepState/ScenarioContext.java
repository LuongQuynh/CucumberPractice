package shareStepState;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {
	private Map<String, Object> scenarioContext;
	
	public ScenarioContext() {
		scenarioContext = new HashMap<>();
	}
	
	public void setContext(Context key, Object value) {
		scenarioContext.put(key.toString(), value);
	}
	
	public Object getContext(Context key) {
		return scenarioContext.get(key.toString());
	}
	
	
	
	
//	public void setGetter(Context key, Object value) {
//		scenarioContext.put(key.toString(), value);
//		
//	}
//	
//	public void setSetter(Context key, ) {
//		scenarioContext.compute(key, remappingFunction);
//		
//	}
	
	
}
