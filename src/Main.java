public class Main {
    public static void main(String[] args) {
        bangundatar lingkaran = new lingkaran("Merah", 8);
        bangundatar segitiga = new segitiga("Putih", 7, 4);
        bangundatar persegi = new persegi("Biru", 4, 4);


        lingkaran.gambar();
        lingkaran.luas();
        System.out.println();
        segitiga.gambar();
        segitiga.luas();
        System.out.println();
        persegi.gambar();
        persegi.luas();
    }
}