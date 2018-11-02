public class Object {
    private String name;
    private String gender;
    private int facevalue;
    private int height;
    private String mind;

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    public void setGender(String gender) {

        this.gender = gender;
    }

    public String getGender() {

        return gender;
    }

    public void setFacevalue(int facevalue) {

        this.facevalue = facevalue;
    }

    public int getFacevalue() {
        return facevalue;
    }

    public void setHeight(int height) {

        this.height = height;
    }

    public int getHeight() {

        return height;
    }

    public void setMind(String mind) {

        this.mind = mind;
    }

    public String getMind() {

        return mind;
    }

    public String toString() {
        return "姓名:" + name + "性别:" + gender + "颜值:" + facevalue + "身高:" + height + "思想:" + mind;
    }

    public static void main(String args[]) {
        Object person = new Object();
        person.setName("kuang");
        person.setGender("female");
        person.setFacevalue(10);
        person.setHeight(180);
        person.setMind("merry");

        System.out.println(person);
    }
}
