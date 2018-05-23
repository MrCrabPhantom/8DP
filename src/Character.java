public class Character extends Fundamentals implements Moveable, Alive {
    Character() {
    }

    Character(String n, int start, World w) {
        world = w;
        w.setCharacterArrayElement(this, start / 100);
        pos = start;
        setName(n);
    }

    private int pos;
    private World world;

    int getPos() {
        return pos;
    }

    @Override
    public void move(int size) {
        pos = pos + size;
    }

    public void lookAround() throws NullPointerException, EndOfRoad {
        System.out.println(toString());
        System.out.println("Текущая координата " + getPos());
        if(pos>=1000) throw new EndOfRoad();
        int rPos = relativeLength(pos);
        System.out.println("Текущая улица " + world.getStreetArrayElement(rPos / 1000).getName());
        world.getStreetArrayElement(rPos / 1000).getHouseArray(rPos % 1000).Characteristic();
        try {
            world.getStreetArrayElement(rPos / 1000).getShopArray(rPos % 1000).Characteristic();
        } catch (NullPointerException n) {
            System.out.println("Магазина нет");
        }
        System.out.println("Качество дороги " + world.getStreetArrayElement(rPos / 1000).getRoad().getType(pos));
        world.getStreetArrayElement(rPos / 1000).getRoad().checkRoad(rPos);
        System.out.println(" ");
    }
}
//NullPointerException
//+