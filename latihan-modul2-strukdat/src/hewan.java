import java.util.ArrayList;

public class hewan{

    public static void main(String[] args) {
        ArrayList<String> hewan = new ArrayList<>();

        hewan.add("Sapi");
        hewan.add("Kelinci");
        hewan.add("Kambing");
        hewan.add("Unta");
        hewan.add("Domba");

        System.out.printf("Hewan :"+hewan);
        ArrayList<String> DeleteHewan = new ArrayList<>();
        DeleteHewan.add("Kelinci");
        DeleteHewan.add("Kambing");
        DeleteHewan.add("Unta");

        System.out.println("\nHewan yang dihapus :\n"+ DeleteHewan);

        hewan.removeAll(DeleteHewan);

        System.out.println("\nOutput Hewan :\n"+ hewan);
    }

}
