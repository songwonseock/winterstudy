package anno;
public class MyObject {
    @StringInjector(aa = "My name is JDM.")
    private String name;

    @StringInjector
    private String defaultValue;

    @StringInjector
    private Integer invalidType;

    public String getName() {
        return name;
    }
    public String getDefaultValue() {
        return defaultValue;
    }
    public Integer getInvalidType() {
        return invalidType;
    }
}