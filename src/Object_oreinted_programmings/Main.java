package Object_oreinted_programmings;

public class Main {
    public static void main(String[] args) {

        Phone iPhone = new Phone("iPhone 11", 6,6, 45);
//        iPhone.name = "iPhone11";
        iPhone.setName("iPhone 11");
   //     System.out.println(iPhone.getName());


//        iPhone.memoryRam = 8;
//        System.out.println(iPhone.memoryRam);
//
//        iPhone.setMemoryRam(8);
//        System.out.println(iPhone.getMemoryRam());

//        iPhone.playMusic("pathshala");
//        iPhone.playMusic("Jagjeet singh ");


        Phone pixel = new Phone("pixel4",8);
        System.out.println(pixel.getName()+ " "+ pixel.getMemoryRam());

    }
}
