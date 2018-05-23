class House extends Fundamentals {
    House(){}
    House(House h) {h=this;}
    House(int i, Color C){
        color = C;
        heigth = coordinateSystem.maxX - i;
    }

    private int heigth;
    private Color color;

    void Characteristic() {
        System.out.println("Высота дома " + heigth);
        System.out.println("Цвет дома " + color.name());
    }

    class Shop extends Fundamentals {
        Shop() {}
        Shop(int i){
            X = i;
            glassClearness =(coordinateSystem.maxX - i)/10;
            if (Math.random()>0.5) haveAdvertisment = true;
        }

        int X;
        int rX;
        float glassClearness;
        boolean haveAdvertisment = false;

        boolean isHaveAdvertisment() {
            return haveAdvertisment;
        }
        float getGlassClearness() {
            return glassClearness;
        }

        String getAdress(World world){
        rX = relativeLength(X);
        return world.streetsNames[rX/1000];
        }

        void Characteristic(){
            System.out.println("Прозрачность окон "+getGlassClearness());
            System.out.println("Есть реклама "+isHaveAdvertisment());
            }
        }
}
//Here Characteristic in Shop will throw an Exception, similar to NullPointerException
//+