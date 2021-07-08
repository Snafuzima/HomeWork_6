public class Cat extends Animal {

    private static int num;

    public Cat (String name) {
        super.setName(name);
        super.setType("Кот");
        num++;
    }


    @Override
    public void run(int distance) {
        if(distance<=200) {
            super.run(distance);
        } else {
            System.out.printf("%s %s не смог(ла) пробежать столько :(\n",getType(),getName());
        }

    }

    public static int getNum() {return num;}
}
