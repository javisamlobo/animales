public class Horse implements Animals{
    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
