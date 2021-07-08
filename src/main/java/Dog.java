public class Dog extends Animal {

    private static int num;

    public Dog (String name) {
        super.setName(name);
        super.setType("Собака");
        num++;
    }

    @Override
    public void swim(int distance) {
        if(distance<=10){
            super.swim(distance);
        } else {
            System.out.printf("%s %s не смог(ла) проплыть столько :(\n",super.getType(),super.getName());
        }
    }

    @Override
    public void run(int distance) {
        if(distance<=500) {
            super.run(distance);
        } else {
            System.out.printf("%s %s не смог(ла) пробежать столько :(\n",getType(),getName());
        }

    }

    public static int getNum() {return num;}
}
