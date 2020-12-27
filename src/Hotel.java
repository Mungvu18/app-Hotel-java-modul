public class Hotel {
   private Person person;
   private int dayByRent;
   private String kindOfRoom;

    public Hotel(Person person, int dayByRent, String kindOfRoom) {
        this.person = person;
        this.dayByRent = dayByRent;
        this.kindOfRoom = kindOfRoom;
    }
    public int getTotalMoney(){
        return dayByRent*setPrice();
    }

    public Person getPerson() {
        return person;
    }

    public int setPrice() {
        int price = 0;
        switch (this.kindOfRoom){
            case "small":
                price = 2000;
                break;
            case "normal":
                price = 3000;
                break;
            case "luxury":
                price = 4000;
                break;
        }
        return price;
    }


    @Override
    public String toString() {
        return "Hotel{" +
                "person=" + person +
                ", dayByRent=" + dayByRent +
                ", price=" + setPrice() +
                ", kindOfRoom='" + kindOfRoom + '\'' +
                '}';
    }
}
