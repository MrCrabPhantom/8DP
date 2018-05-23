public class Main {
        public static void main(String arg[]) {
                World world = new World();
                //JAVA naming convention ++++++++++++++
                Character neznayka = new Character("Незнайка ", 1, world);
                Character znayka = new Character("Знайка ", 400, world);
                Character kozlik = new Character("Козлик", 250, world);
                try{
                neznayka.lookAround();
                znayka.lookAround();
                kozlik.lookAround();

                //JAVA naming convention +++++++++++++++
                neznayka.move(100);
                znayka.move(600);
                kozlik.move(300);
                neznayka.lookAround();
                znayka.lookAround();
                kozlik.lookAround();}
                catch (Fundamentals.EndOfRoad e){
                        House endHouse = new House(world.getStreetArrayElement(12).getHouseArray(46)) {
                                boolean isLookLike = true;
                                Color color = Color.GRAY;
                                House getLikeness() {
                                        if (isLookLike && color == Color.GRAY)
                                                System.out.print(e.character.getName()+"встретил в конце улицы стоял серый дом, напоминавший огромный мусорный ящик. ");
                                                return this;
                                }
                        }.getLikeness();
               }
                }
//                try {
//                        world.check();
//                } catch (Fundamentals.EndOfRoad e){
//                        //Бесмыслленно++++++++++++
//                        House endHouse = new House(world.getStreetArrayElement(12).getHouseArray(46)) {
//                                boolean isLookLike = true;
//                                Color color = Color.GRAY;
//                                House getLikeness() {
//                                        if (isLookLike && color == Color.GRAY)
//                                                System.out.print(e.character.getName()+"встретил в конце улицы стоял серый дом, напоминавший огромный мусорный ящик. ");
//                                                return this;
//                                }
//                        }.getLikeness();
//                }
        }
//Exception for endHouse(should be called if someone reach 1000)
//+