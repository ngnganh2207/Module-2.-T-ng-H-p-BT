public class CatClass {
    String name;
    String type;
    int age;
    String color;

    //Nếu ta không tạo constructor thì trình biên dịch(compiler) sẽ tự tạo 1 phương thức rỗng
    CatClass(){
        this.name= "cuong";
    }

    CatClass(String name, String type, int age){
        this.name= name;
        this.age= age;
        //nếu bỏ this thì type=type1 thì được
        this.type=type;
    }
    CatClass(String name, String type, String color){
        this.name=name;
        this.age=age;
        this.color=color;
    }
    CatClass(String name, String type, int age, String color){
        this.name= name;
        this.type= type;
        this.age= age;
        this.color= color;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
    void setName(String name){
        this.name= name;
    }
    void setAge(int age){
        this.age=age;
    }


    public static void main(String[] args) {
        CatClass cat= new CatClass("Chó","Mèo ta",3,"Lông vàng");
        System.out.println(cat.name);
        System.out.println(cat.age);
        cat.setName("Chó tây");
        cat.setAge(100);
        System.out.println(cat.getAge());
        System.out.println(cat.getName());

    }


}
