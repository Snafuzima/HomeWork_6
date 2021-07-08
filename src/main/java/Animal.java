import java.sql.SQLOutput;

public class Animal {
    private String name;
    private String type;
    private static int num;

    public Animal () {
        num++;
    }

    public void run (int distance) {
        System.out.printf("%s %s пробежал(а) %d метров(а)\n",type,name,distance);
    }

    public void swim (int distance) {
            System.out.printf("%s %s проплыл(а) %d метра(ов)\n",type,name,distance);
    }

    public void getInfo() {
        System.out.println("Имя: "+name);
        System.out.println("Вид: "+type);
    }




    //set & get переменных
    public void setName (String name) {this.name=name;}
    public String getName () {return name;}

    public void setType (String type) {this.type=type;}
    public String getType () {return type;}

    public static int getNum(){return num;}

}
