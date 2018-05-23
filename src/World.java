class World extends Fundamentals {
    World (){generate();}
    final String[] streetsNames = {"Светлая улица ", "Счастливая улица ", "бульвар Радости ", "улица Бедности ", "Тёмная улица ", "Грязная улица ", "Болотная улица ", "Гнилая улица ", "Большая трущобная улица ", "Малая трущобная улица ", "Первый Трущобный переулок ", "Второй Трущобный переулок ", "Третий трущобный переулок ", "Мусорный тупичок "};

    private Street[] streetArray = new Street[14];
    private Character[] characterArray = new Character[10];

    //Useless++++++++
//    void check() throws EndOfRoad{
//        for (int i =1; i<10; i++){
//            if (characterArray[i] != null){
//            if (characterArray[i].getPos() >=1000) throw new EndOfRoad(characterArray[i]);
//        }}
//    }

    //Название не соответствует тому что делает ++++++++++++
    Street getStreetArrayElement(int i) {
        return streetArray[i];
    }

    public void setStreetArrayElement(Street streetArray, int i) {
        this.streetArray[i] = streetArray;
    }

    //Название не соответствует тому что делает ++++++++++++++++
    public Character getCharacterArrayElement(int i) {
        return characterArray[i];
    }

    void setCharacterArrayElement(Character characterArray, int i) {
        this.characterArray[i] = characterArray;
    }


    //Должно быть внешним по отношению к классу
    private void generate(){
        Street street = new Street();
        Street.Road fullRoad = street.new Road();
        for(int i = 0; i<=13; i++){
            if (i < 13){
            streetArray[i] = new Street(streetsNames[i], coordinateSystem.streetsLength[i], i);
        streetArray[i].setRoad(fullRoad);}
            }
            streetArray[0].setName("Hell");
            streetArray[1].setName("Hell");
            streetArray[2].setName("Hell");
            streetArray[3].setName("Hell");
        }

}
//+