class Street extends Fundamentals {
    Street(){}
    Street(String n, int X, int i) {setName(n); length = X; streetGenerate(i);}

    //При подсчете абсолюнтой и относительной позиции не используется
    private int length;

    private House house = new House();

    private Street.Road road;
    private House[] houseArray = new House[175];

    //Магазин не является частью дома
    private House.Shop[] shopArray = new House.Shop[175];


    //ПОЧЕМУ ЗДЕСЬ?
    private void streetGenerate(int index) {
        int aLength = absoluteLength(index);
        for (int i = 0; i <= length; i++) {
            houseArray[i] = new House(i, randomColor());
            if (aLength <= coordinateSystem.maxX / 2) setShopArray(house.new Shop(i),i);
        }
    }
    House.Shop getShopArray(int i) {
        return shopArray[i];
    }

    public void setShopArray(House.Shop shop, int i) {
        this.shopArray[i] = shop;
    }
    House getHouseArray(int i) {
        return houseArray[i];
    }

    public void setHouseArray(House[] houseArray) {
        this.houseArray = houseArray;
    }

    public Road getRoad() {
        return road;
    }

    public void setRoad(Road road) {
        this.road = road;
    }
    class Road extends Fundamentals {

        //What???
        private roadType type1;
        private roadType type2;

        Road() {type1 = roadType.GOODROAD; type2 = roadType.BADROAD;}
        roadType getType(int X){
            if(X<=coordinateSystem.maxX/2) return  type1; else return type2;
        }


        void checkRoad(int i) {
            if (getType(i) == roadType.BADROAD) {
                class RoadHoles {
                    private double width = Math.random() * 10;

                    private RoadHoles() {
                        getRoadHole();
                    }
                    void getRoadHole(){
                        System.out.println("Ширина ямы в дороге равна " + width);
                    }
                }
                RoadHoles roadHoles = new RoadHoles();
            }
        }
    }
}
//Here probably should be inner class "Road"
//+