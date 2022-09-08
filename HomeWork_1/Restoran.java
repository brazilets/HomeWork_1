package HomeWork_1;

    public class Restoran {
        String result;
        private int breakfast;
        private int dinner;
        private int lunch;

        public Restoran(int breakfast, int dinner, int lunch) {
            this.breakfast = breakfast;
            this.dinner = dinner;
            this.lunch = lunch;
        }

        public String doIt(Group group) {
            result = "Group number: "+ group.getName()+ " " + '\n';
            for (Person person: group.getPeoples()) {
                result += "Customer name: " + person.getName()+ " " + '\n';
                int value = person.getCanEatCalories();
                testBreakfast(value);
                testDinner(value);
                testLunch(value);
            }

            return result;
        }

        private void testBreakfast(int value) {
            if (value<breakfast) result = result + "Breakfast - ate "+ '\n';
            else result += "Breakfast - not full "+ '\n';
        }

        private void testDinner(int value) {
            if (value<dinner + 50) result += "Dinner - ate "+ '\n';
            else result += "Dinner - not full"+ '\n';
        }

        private void testLunch(int value) {
            if (value<lunch - 100) result += "Lunch - ate"+ '\n';
            else result += "Lunch - not full"+ '\n';
        }
    }
