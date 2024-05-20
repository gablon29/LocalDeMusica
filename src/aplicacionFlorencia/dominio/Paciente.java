package aplicacionFlorencia.dominio;

public class Paciente {
   private int id;
   private String name;
   private int age;
   private String patology;

    public Paciente(int id, String name, int age, String patology) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.patology = patology;
    }
    public String getPatology() {
        return patology;
    }

    public void setPatology(String patology) {
        this.patology = patology;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Paciente {" +
                "id= " + id +
                ", name= '" + name + '\'' +
                ", age= " + age +
                ", patology= '" + patology + '\'' +
                '}';
    }
}
