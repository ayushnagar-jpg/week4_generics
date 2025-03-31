package annotation.deprecated;

public class LegacyAPI {
	@Deprecated
  public String oldMethod() {
	  return "oldMethod";
  }
  
  public String newMethod() {
	  return "newMethod";
  }
}
