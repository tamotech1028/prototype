public class MangaArtist {

    public Manga[] createManyManga() {
        Manga[] mangas = new Manga[200];
        PrototypeManager manager = new PrototypeManager();
        // 『進撃の小人』の原本を作る
        Manga manga = new Manga("進撃の小人");
        createManga(manga);

        // PrototypeManagerを使って原本を保存する
        manager.addPrototype("進撃の小人", manga);
        // keyを元に漫画を持ってくる
        Cloneable cloneable = manager.getClone("進撃の小人");

        for (int i=0; i<100; i++) {
            // 100冊コピーしてリストに詰める
            mangas[i] = (Manga) cloneable.createClone();
        }
        return mangas;
    }

    public void createManga(Manga manga) {
        drawName(manga);
        drawSketch(manga);
        drawPen(manga);
        pasteTone(manga);
        bindBook(manga);
    }

    private void drawName(Manga manga) {
        // 漫画のネームを書く
    }
    private void drawSketch(Manga manga) {
        // 下絵を書く
    }
    private void drawPen(Manga manga) {
        // ペン入れをする
    }
    private void pasteTone(Manga manga) {
        // トーンを貼る
    }
    private void bindBook(Manga manga) {
        // 製本する
    }
}
