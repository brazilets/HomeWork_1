package HomeWork_1;

    public class RunClass {

        public static void main(String[] args) {
            Person[] person = new Person[4];
            person[0] = new Person("name1", 100);
            person[1] = new Person("name2", 200);
            person[2] = new Person("name3", 300);
            person[3] = new Person("name4", 400);
            Group group = new Group("group1", person);

            Restoran restoran = new Restoran(250, 350, 410);
            String result = restoran.doIt(group);
            System.out.println(result);
        }
    }
